package January_25;

import java.util.Scanner;

public class GreaterNumber {

/**
 * Use an IF statement to determine if the number a is greater than the other given number b
 */

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number a");
    int a = sc.nextInt();
    System.out.println("Enter the second number b");
    int b = sc.nextInt();

    if (a > b){
        System.out.println(a + " is greater than " + b);
    }else {
        System.out.println(b + " is greater than " + a);
    }

    sc.close();

}

}
