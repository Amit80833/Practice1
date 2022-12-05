package ExceptionalHandlingExamples;

public class CustomException2 extends Exception{
    public CustomException2(String str){
        super(str);
    }
}
class TestException {
    public static void main(String[] args) {
        try {
            throw new CustomException2("this is my custom exception");
        }
        catch (CustomException2 e){
            System.out.println("Custom exception handled by amit");
            System.out.println(e.getMessage());
        }
    }
}