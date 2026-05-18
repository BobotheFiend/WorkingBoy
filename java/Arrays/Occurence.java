public class Occurence{
    public static void main(String... args){

    int [] numbers = {1,2,3,3,4,5,5,6,6,7,7,8,8,9,9,4,5,3,2,7,8};

    int count = 0;
    for(;count < numbers.length; count++) {

        int occurence = 0;
        int innerCount = 0;
        for(;innerCount < numbers.length; innerCount++){
            
           if (numbers[innerCount] == numbers[count]){
                occurence++;
           }
        }
        System.out.println("Number of occurence" + numbers[count] + "=" + " " + occurence + " time(s)");
            
    }


    }
}
