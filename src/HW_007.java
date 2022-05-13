import java.util.Arrays;
//find maximum-minimum values of an array

public class HW_007 {

    public static void main(String args[]) {

        int[] nums = {8, -7, 2, -6, 0, 1, 9, -3, -9};

        Arrays.sort(nums);
        System.out.println("Minimum value of array = " + nums[0]);
        System.out.println("Maximum value of array = " + nums[nums.length - 1]);
    }
}




