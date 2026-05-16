public class ArrayAppearance{
	public static void main(String... args){

		int [] collections = {10,66,4,6,5,3,56,54,44,33,44,55,66,77,88,100};
	
		int appearance = collections[0];
		int lastindex = collections[collections.length-1];
		int count = 0;
		
		for(;count < collections.length; count++){

			int counter = 0;
			for(int counting = 0; counting < collections.length; counting++){

				if (collections[counting] == collections[count]){
				counter++;
                }
			}
            System.out.println("Element " + collections[count] + " appears " + counter + " time(s).");
//		if counter == count
        }

    }
}
