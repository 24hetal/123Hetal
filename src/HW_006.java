
import java.util.Arrays;

public class HW_006 {
    //remove specific element from an array
        public static void main(String[] args) {
                int[] my_array = {22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

                System.out.println("Main Array : "+ Arrays.toString(my_array));

                // Remove the fourth element (index 4 and value is 26) of the array
                int removeIndex = 4;

                for(int i = removeIndex; i < my_array.length -1; i++){
                    my_array[i] = my_array[i + 1];
                }
////  the size of an array of element/value vl not cut but , after the removing one value/element
// the last and second last element in the array will show twice

                System.out.println("After removing the element four: "+Arrays.toString(my_array));
           }
        }