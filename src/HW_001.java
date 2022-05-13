import java.util.Arrays;
//test the equality of two int arrays
public class HW_001 {

    public static void main (String[]args){
////defining 3 arrays to compare

    int[] array1 = new int[]{21, 32, 36, 47};
    int[] array2 = new int[]{11, 22, 33, 44};
    int[] array3 = new int[]{21, 32, 36, 47};

    System.out.println(" array1 and array2 equal or not  : " + Arrays.equals(array1, array2));
    System.out.println(" array1 and array3 equal or not :  " + Arrays.equals(array1, array3));

}}
