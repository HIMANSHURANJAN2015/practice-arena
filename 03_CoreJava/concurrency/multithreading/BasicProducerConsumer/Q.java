package Concurrency.Multithreading.BasicProducerConsumer;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        //Wait if value is not set. But to avoid spurioud waking, putting it inside while loop
        while(!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception caught");
            }
        }
        System.out.println("Got: "+n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int v) {
        //Wait if value is already set. But to avoid spurious waking, putring it inside while loop
        while(valueSet) {
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("Exception caught");
            }
        }
        this.n = v;
        valueSet = true;
        System.out.println("Put: "+n);
        notify();
    }
}
