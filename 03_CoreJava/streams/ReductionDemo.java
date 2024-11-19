import java.util.*;
import java.util.stream.*;

public class ReductionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(7);
        al.add(17);
        al.add(27);
        al.add(37);
        //adds them by reduce
        Optional<Integer> optAns = al.stream().reduce((a,b) -> a+b);
        if(optAns.isPresent()) {
            int val = optAns.get();
            System.out.println("Value in int = "+val);
            System.out.println("Value in int *1000 = "+(val*1000));
        }
    }
}