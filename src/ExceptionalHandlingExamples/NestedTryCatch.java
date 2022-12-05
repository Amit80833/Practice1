package ExceptionalHandlingExamples;

public class NestedTryCatch {
    public static void Nested(){
        try {
            String s="Amit";
            s.length();
            try {
                int arr1[]=new int[5];
                arr1[4]=45;
                try {
                    int data=50/0;
                }
                catch (ArithmeticException e){
                    System.out.println("Arithmetic exception handled");
                }
                finally {
                    System.out.println("innermost finally block executed");
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexoutofbound exception handled");
            }
            finally {
                System.out.println("second inner finally block executed");
            }
        }
        catch (NullPointerException e){
            System.out.println("nullpointerexception handled");
        }
        finally {
            System.out.println("outer finally block executed");
        }
    }
}
