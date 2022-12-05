package ExceptionalHandlingExamples;



public class ExceptionHandling {
    public static void main(String args[]) throws CustomExceptions {
        /*ExceptionHandlingUsingCatchBlock.Input(50,0);
        TryMultiCatchExceptionHandling.test1();
*/
//        ThrowsKeywordExample.Validate(19);
//        System.out.println("rest of the code");



       // FinallyKeywordExample.finally1();
//        NestedTryCatch.Nested();


     /*   try{
            ThrowingCheckedException.method();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("rest of the code");

      */
        try {
            throw new CustomExceptions("this is user defined exception");
        } catch (CustomExceptions e) {
            System.out.println("Caught the exceptions");
            System.out.println(e.getMessage());
        }

    }
}
