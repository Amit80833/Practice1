package ExceptionalHandlingExamples;

public class InvalidAgeException extends Exception{
    InvalidAgeException(String str){
        super(str);
    }
}

     class  TestCustomException1{
    static void validate(int age)throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("not eligible to vote");
        }
        else{
            System.out.println("welcome to voting club");
        }
    }

         public static void main(String[] args) {
             try {
                 validate(13);
             }catch (InvalidAgeException ex){
                 System.out.println("Exception caught");
                 System.out.println(ex.getMessage());
             }

         }

    }
