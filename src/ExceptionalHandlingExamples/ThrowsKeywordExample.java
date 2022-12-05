package ExceptionalHandlingExamples;
//unchecked exception
public class ThrowsKeywordExample {
    public static void Validate(int age){
        if (age<18){
            throw new ArithmeticException("Not eligible for voting");
        }
        else {
            System.out.println("Eligible for voting");
        }
    }
}
