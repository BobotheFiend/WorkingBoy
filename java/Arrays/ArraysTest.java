public class ArraysTest{

    public static void main(String... args){

        String [] characters = {"Boy", "Dad", "o", "Me", "Nope", "Kashamadupe", "Biggi", "Smallie", "nawa"};
        int [] collections = {6,3,4,6,3,2,1,90,0,-2,4,5,6};
        
        int largest = collections[0];
        int smallest = collections[0];

        String largestLetter = characters[0];
        String smallestLetter = characters[0];

        int count = 0;
        int counter = 0;
        for(;count < collections.length; count++ ){

            if (collections[count] > largest){
            largest = collections[count];
             }
    
            if (collections[count] < smallest){
            smallest = collections[count];
            }
        }
        
        for(; counter < characters.length;counter++){
            if(characters[count] > largestLetter){
                largestLetter = characters[count];
            }
            
            if(characters[count] < smallestLetter){
                smallestLetter = characters[count];
            } 
        }
        System.out.printf("The largest number in the collections = %d%nThe smallest number in the collection = %d%n%nThe largest letter in the characters = %s%nThe smallest letter in the characters = %s%n",largest,smallest,largestLetter,smallestLetter);
    }
}
