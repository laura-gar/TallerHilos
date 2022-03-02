import java.util.LinkedList;
import java.util.List;

public class HelloWorldThreads extends Thread {

    public static List <Thread> threadList = new LinkedList<Thread>();


    @Override
    public void run(){
        System.out.println("Hello World from a thread object: " + this.toString());
    }

    public static void main(String[] args){
        int i = 5;
        while(i > 0) {
            Thread t = (new HelloWorldThreads());
            threadList.add(t);
            t.start();
            i --;
        }

        System.out.println("Hello form main: " + Thread.currentThread().toString());

        for(Thread t: threadList){
            System.out.println("Stack trace: " + t.getState());
        }
    }
}
