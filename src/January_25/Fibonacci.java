package January_25;

import java.util.Scanner;

public class Fibonacci {

    public static void fibonacci(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number to be the number of your fibonacci series: ");
        int fibNumber = sc.nextInt();
        int a = 0, b = 1, fib = 0;

        System.out.print( "Your fibonacci series numbers : ");

        for (int i = 0; i <= fibNumber; i++) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(fib + " ");
        }
        System.out.println();
        System.out.println("Your fibonacci number in total is: " + fib);
        sc.close();
    }

    public static void main(String[] args) {
        fibonacci();
    }

}
