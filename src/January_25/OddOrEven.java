package January_25;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 100: ");
        int num = sc.nextInt();

        if (num<1 || num>100){
            System.out.println("Input is invalid");
            System.exit(1);
        }else {
            if (num % 2 == 0){
                System.out.println(num + " is EVEN...");
            }else {
                System.out.println(num + " is ODD...");
            }
        }

        sc.close();

    }

}
