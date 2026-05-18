import java.util.Scanner;
public class Palindrome{
    public static void main(String... args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = inputCollector.nextInt();

    int checker = number;
    int extract = 0;
    int reversed = 0;
//    int count = number;
    for(;number > 0;){

    extract = number % 10;

    reversed = (reversed * 10 ) + extract;
    number /= 10;

//    System.out.print(extract); 

    }
    if (reversed == checker){
        System.out.printf("%n %d ---> %d%nA Palindrome%n", reversed, checker);
    }
    else{    System.out.println("Not a Palindrome");}

    System.out.println(number + " " + checker);
    }
}

