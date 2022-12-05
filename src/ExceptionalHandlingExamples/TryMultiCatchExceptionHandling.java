package ExceptionalHandlingExamples;

public class TryMultiCatchExceptionHandling {
    public static void test1() {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurs");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }
        catch (Exception e){
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");

    }

}
