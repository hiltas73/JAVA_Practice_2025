package January_25;

import java.util.Scanner;

public class AverageNumber {

    public static void averageNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you wish to find the average?");
        int numberOfNumbers = sc.nextInt();
        int count = 1;
        int total = 0;

        while (count<=numberOfNumbers){
            System.out.println("Enter number " + count + " : ");
            int no = sc.nextInt();
            total = no + total;
            count++;
        }
        System.out.println("total = " + total);
        System.out.println("Average of your numbers : " + (total/numberOfNumbers));
    }

    public static void main(String[] args) {
        averageNumber();
    }

}
