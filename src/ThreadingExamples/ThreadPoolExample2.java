package ThreadingExamples;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample2 implements Runnable{
    private String Taskname;
    ThreadPoolExample2(String str){
        Taskname=str;
    }

    @Override
    public void run() {
        try {
            for (int j=0;j<=5;j++){
                if (j==0){
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization time for the task name:"+Taskname+" = "+sdf.format(dt));
                }
                else {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Time of execution for the task name:"+Taskname+"="+sdf.format(dt));
                }
                Thread.sleep(1000);
            }
            System.out.println(Taskname +" is complete.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
 class ThreadPoolTest{
    static final int MAX_TH=3;

    public static void main(String[] args) {
        Runnable rb1 = new ThreadPoolExample2("Task1");
        Runnable rb2 = new ThreadPoolExample2("Task2");
        Runnable rb3 = new ThreadPoolExample2("Task3");
        Runnable rb4 = new ThreadPoolExample2("Task4");
        Runnable rb5 = new ThreadPoolExample2("Task5");
        ExecutorService es = Executors.newFixedThreadPool(MAX_TH);

        es.execute(rb1);
        es.execute(rb2);
        es.execute(rb3);
        es.execute(rb4);
        es.execute(rb5);

        es.shutdown();

    }
}
