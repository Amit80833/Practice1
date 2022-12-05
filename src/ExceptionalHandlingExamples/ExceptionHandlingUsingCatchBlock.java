package ExceptionalHandlingExamples;

public class ExceptionHandlingUsingCatchBlock {

    public static int Input(int i,int j){
        int data = 0;
        try{
             data=i/j;
        }
        catch (Exception e){
            System.out.println(i/(j+2));
        }
        return data;
    }
}
