package January_25;

import java.util.Arrays;

public class ReverseArrayOfStrings {

    public static void main(String[] args) {

        String[] arr = {"World", "Java", "My", "To", "Welcome", "Hello"};

//        String reverse = "";
//
//        // 1st way
//        for (int i = arr.length-1; i>=0; i--) {
//            reverse += arr[i] + " ";
//        }
//        System.out.println("reversed version of arr as String: " + reverse);
//
//        String[] reverseArray = reverse.trim().split(" ");
//        System.out.println("reversed version of arr as Array: " + Arrays.toString(reverseArray));

        // 2nd way
        String[] rev = new String[arr.length];
        for (int i = arr.length-1, y = 0; i>=0; i--, y++) {
            rev[y] = arr[i];
        }
        System.out.println("Reversed array : " + Arrays.toString(rev));

    }
}
