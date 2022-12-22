package ThreadingExamples;
//Example of the sleep() method in Java : on the custom thread
public class TestSleepMethod extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(100);
            }catch (InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestSleepMethod tsm1=new TestSleepMethod();
        TestSleepMethod tsm2=new TestSleepMethod();
        tsm1.run();//.start()
        tsm2.run();//.start()
    }
}
