public class ReversalsRandom{
    public static void main (String... args){

        java.util.Random picker =  new java.util.Random();

        String [] names = {"Walter", "ObillyGoat", "Darkside", "Shuku", "Mandid", "Tinubu", "Kwansogbu", "Omo", "omo", "peep"};

        int nameLength = picker.nextInt(names.length);

        String giveMeName = names[nameLength];

        System.out.println("Name Choosen: " + giveMeName);
        String reversal = "";

        int count = giveMeName.length()-1;
        for(;count >= 0;){

            reversal += giveMeName.charAt(count--);

        }
        System.out.printf("The reverse of %s ---> %s%n", giveMeName, reversal);
    
        if(reversal.equals(giveMeName)){
            System.out.printf("\n%s----> %s%nIt's a Palindrome\n", giveMeName,reversal);
        } else{
               System.out.printf("%s----> %s%nNOT a Palindrome\n", giveMeName,reversal);
            }

        int vowelCount = 0;
        int consonantCount = 0;

        for(char counter : giveMeName.toCharArray()){

            switch(Character.toLowerCase(counter)){
                case 'a': 
                case 'e':
                case 'i':
                case 'o':
                case 'u': 
                            vowelCount++;
                            break;
                default: if (Character.isLetter(counter)) consonantCount++;
                
            }
        }
            System.out.printf("Vowels in %s --> %s%nConsonants in %s --> %s%n",giveMeName, vowelCount,giveMeName,consonantCount);

        for(int looping = 0; looping < giveMeName.length(); looping++){
            char indexChar = giveMeName.charAt(looping);
//            System.out.printf("%c\n",indexChar);

            if(giveMeName.indexOf(indexChar) == giveMeName.lastIndexOf(indexChar)){
                System.out.println(indexChar);
            }
        }
//            System.out.println(indexChar);
    }
}
