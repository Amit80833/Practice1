package ExceptionalHandlingExamples;

public class FinallyKeywordExample {
    public static void finally1(){
        try {
            int arr[]=new int[5];
            arr[5]=10;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception handled");
        }
        finally {
            System.out.println("this block will execute everytime unless of exception");
        }

    }
}
