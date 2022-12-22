package ThreadingExamples;
//Example of the sleep() Method in Java : on the main thread
public class TestSleepMethod2 {
    public static void main(String[] args) {
        try {
            for (int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
