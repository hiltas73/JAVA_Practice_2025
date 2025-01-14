package January_25;

import java.util.Scanner;

public class ReverseInteger {

//    public static int reverse(int number) {
//        int reversed = 0;
//
//        while (number != 0) {
//            int digit = number % 10; // Extract the last digit
//            reversed = reversed * 10 + digit; // Build the reversed number
//            number /= 10; // Remove the last digit from the original number
//        }
//
//        return reversed;
//    }

    private static int reverse() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive number to reverse:");
        int number = sc.nextInt();
        int reversed = 0;

        while(number != 0){
            int num = number % 10;              // we extract the last digit
            reversed = reversed * 10 + num;     // build the reversed number
            number /= 10;                       // remove the last digit from the original number
        }
        System.out.println("reversed number is = " + reversed);

        return reversed;
    }

    public static void main(String[] args) {
        reverse();
    }


}
