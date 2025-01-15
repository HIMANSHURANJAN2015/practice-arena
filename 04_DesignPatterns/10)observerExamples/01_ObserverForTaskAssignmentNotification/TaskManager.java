package com.assignment.question;

//step-3 create concrete observable 
import com.assignment.question.services.AppService;
import com.assignment.question.services.EmailService;
import com.assignment.question.services.SlackService;
//to use ArrayList and List
import java.util.List;
import java.util.ArrayList;

public class TaskManager extends Publisher {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);

    }

    public void notifyObservers(Long taskId, Long userId){
        for(Observer o: observers) {
            o.update(taskId, userId);
        }
    }

    public void assignTask(Long taskId, Long userId) {
        notifyObservers(taskId, userId);
    }

}
// Older code b4 implementing Observer DP
//public class TaskManager {
//
//     private EmailService emailService = new EmailService();
//     private SlackService slackService = new SlackService();
//     private AppService appService = new AppService();


//     public void assignTask(Long taskId, Long userId) {
//         emailService.sendEmail(userId, taskId);
//         slackService.sendSlack(userId, taskId);
//         appService.sendPush(userId, taskId);

//     }
// }