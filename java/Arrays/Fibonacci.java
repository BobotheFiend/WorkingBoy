public class Fibonacci{
    public static void main(String... args){

    int firstNumber = 0;
    int secondNumber = 1;
    int result = 0;

    int count = 0;
    for(; count < 10; count++){

        result =  firstNumber + secondNumber;
        System.out.printf("%d + %d = %d%n", firstNumber, secondNumber, result);

        firstNumber = secondNumber;
        secondNumber = result;
        
    }
    }
}
