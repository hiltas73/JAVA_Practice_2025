package January_25;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] nums = {10,20,30,40,50};

        System.out.println(Arrays.toString(reversedArray(nums)));

    }
    public static int[] reversedArray(int[] arr){

        int[] reversedArray = new int[arr.length];
        int counter = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            reversedArray[counter] = arr[i];
            counter++;
        }
        return reversedArray;
    }

}
