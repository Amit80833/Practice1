package ThreadingExamples;

public class ShutdownHookExample extends Thread{
    @Override
    public void run() {
        System.out.println("shut down hook task completed....");
    }
}
class ShutDown{
    public static void main(String[] args) {
          Runtime r = Runtime.getRuntime();
          r.addShutdownHook(new ShutdownHookExample());

        System.out.println("Now main sleeping....press ctrl+c to exit");
        try {
                Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}