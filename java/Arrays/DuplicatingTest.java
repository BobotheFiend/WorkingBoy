public class DuplicatingTest{
    public static void main (String... args){

        int [] collections = {22,3,3,55,5,4,7,6,5,66,7,66,8,9,0,-2,-2,-4,5,6};

        int counter = 0;
        int count = 0;

        for(;count < collections.length; count++){
            int indexing;
            for(indexing = 0; indexing < counter; indexing++){

                if (collections[indexing] == collections[count]){ break;}
            }
            if(indexing == counter){
                collections[counter++] = collections[count];
            }
        }

        int [] arrays = new int [counter];
        int index =0;
        for(; index < arrays.length; index++){
            arrays[index] = collections[index];
        System.out.print(arrays[index] + " ");
        }
        System.out.println(java.util.Arrays.toString(arrays));

        int add = 0;
        int adding = 0;
        for(;adding < arrays.length; adding++){
            add += arrays[adding];
            System.out.print(add + " ");
        }

        float average = (float)add/adding;
        System.out.println(average);
    }
}
