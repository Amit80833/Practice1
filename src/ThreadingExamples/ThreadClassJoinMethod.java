package ThreadingExamples;
//Example of join() Method in Java
public class ThreadClassJoinMethod extends Thread{

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(500);
                System.out.println("The current thread name is:"+ Thread.currentThread().getName());
            }catch (InterruptedException e){
                System.out.println("the exception has been caught"+e);
            }
            System.out.println(i);
        }
    }
}
 class ThreadjoinExample{
     public static void main(String[] args) {
         ThreadClassJoinMethod tcjm1 = new ThreadClassJoinMethod();
         ThreadClassJoinMethod tcjm2 = new ThreadClassJoinMethod();
         ThreadClassJoinMethod tcjm3 = new ThreadClassJoinMethod();

         tcjm1.start();
         try {
             System.out.println("The current thread name is: "+ Thread.currentThread().getName());
             tcjm1.join(1500);
         }catch (InterruptedException e){
             System.out.println("the exception has been caught"+e);
         }

         tcjm2.start();
        /* try {
             System.out.println("the current thread name is: "+Thread.currentThread().getName());
             tcjm2.join();
         }catch (InterruptedException e){
             System.out.println("exception has been caught"+e);
         }

         */

         tcjm3.start();
       /*  try {
             System.out.println("the current thread name is:"+ Thread.currentThread().getName());
             tcjm3.join();
         }catch (InterruptedException e){
             System.out.println("exception has been caught"+e);
         }

        */

     }
}
