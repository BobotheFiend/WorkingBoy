public class ArrayJoin{
	public static void main(String... args){

		int [] collections = {10,30,50,70,90};
		int [] collectionsTwo = {0,20,40,60,100};

		int [] coJoin = new int[collections.length + collectionsTwo.length];
	
		int count = 0;
		for (;count < collections.length; count++){
			coJoin[count] = collections[count];
		}
	
		int countTwo = 0;
		for(;countTwo < collectionsTwo.length; countTwo++){
			coJoin[count++] = collectionsTwo[countTwo];
		}
		System.out.print(java.util.Arrays.toString(coJoin));
	}
} 
