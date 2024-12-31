package January_25;

public class FindMaxNumber_Array {

    public static void main(String[] args) {

        int[] nums = {1,2,3,5,8,13,21,4,7,25,6};

        int max = nums[0];

        for (int each : nums) {
            if (each>max){
                max = each;
            }
        }

        System.out.println("Max number is " + max);
    }
}
