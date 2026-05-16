// strings questions, i am going to do them using void methods


public class StringsOnString{

    public static void main(String[] args){
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);
 
    System.out.print("Enter a [Name of anything]: ");
    String name = inputCollector.nextLine();    
//reverse
    reverse(name);
//palindrome
    palindromes(name);
//titlecase
    titleCases(name);
}


//Rverse a string without using built-in reverse functions.

    public static void reverse(String characters){

        for (int count = characters.length-1; count >= 0; count--){
 
               System.out.printf("%s ", characters.toUpperCase().charAt(count));
        }
    }

//Check if a string is palindrome

    public static void palindromes(String names){

        String space = "";
        int count;
        for(count = names.length-1; count >= 0; count--){

            space += names.charAt(count); 
        }
        if (space.equals(names)){ System.out.printf("%s---->%s%nIt's a Palindrome", names,space);}
        else{ System.out.printf("%s---->%s%nNot a Palindrome", names, space);}
        
    }
    
//convert a String to title upper case capitalize the first letter of each word
    public static void titleCases(String words){
        int lengthOfWord = words.length().charAt(0);
        char capitalize = (char)lengthOfWord.toUpperCase();

        System.out.print(capitalize);
    }
}
