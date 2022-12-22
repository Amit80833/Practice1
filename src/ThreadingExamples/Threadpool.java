package ThreadingExamples;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestThreadPool implements Runnable{
    private String message;
    TestThreadPool(String s){
        this.message=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"(start) message = "+message);
        processmessage();
        System.out.println(Thread.currentThread().getName()+"( End)");
    }
    public void processmessage(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class Threadpool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <=5; i++) {
            Runnable worker = new TestThreadPool("" + i);
            try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Runnable worker2 = new TestThreadPool(""+i);
            executor.execute(worker);
            executor.execute(worker2);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("finished all threads");

    }
}