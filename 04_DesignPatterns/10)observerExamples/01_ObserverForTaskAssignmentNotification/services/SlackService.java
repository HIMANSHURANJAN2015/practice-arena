package com.assignment.question.services;

//step-4: Create concrete observer by implementing observer interface
import com.assignment.question.utils.NotificationUtils;
//to implement observer interface
import com.assignment.question.Observer;

public class SlackService implements Observer {
    public void update(Long taskId, Long userId){
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtils.sendSlack(subject, String.format(message, taskId, userId));
    }    

}

// Older code b4 implementing Observer DP
// public class SlackService {
//     public void sendSlack(Long id, Long taskId) {
//         String subject = "New task assigned";
//         String message = "Task %s assigned to user %s";
//         NotificationUtils.sendSlack(subject, String.format(message, taskId, id));
//     }
// }