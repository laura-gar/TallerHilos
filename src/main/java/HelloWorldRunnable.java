import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HelloWorldRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println("Hello from runnable Object: " + Thread.currentThread());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        int n = 100;
        ExecutorService pool = Executors.newFixedThreadPool(10);


        while(n > 0){
            pool.submit(new HelloWorldRunnable());
            n --;
        }

        System.out.println("Hello from main");
    }
}
