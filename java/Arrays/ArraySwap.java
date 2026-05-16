public class ArraySwap{
	public static void main(Strings... args){

		int [] collections = {10,66,4,6,5,3,56,54,44,33,44,55,66,77,88,100};
	
		int firstIndex = collections[0];
		int lastindex = collections[collections.length-1];
		int count = 0;	
		for(;count < collections.length; count++ firstIndex++ lastIndex++){
			int swap = collections[firstIndex];
			collections[firstIndex] = collections[lastIndex];
			collections[lastIndex] = swap
		}
			System.out.print(Array.toString(collections));
		
	}
}