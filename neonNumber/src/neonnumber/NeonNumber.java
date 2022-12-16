package neonnumber;

import java.util.*;
import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        NeonNumberClass2 obj1 = new NeonNumberClass2();
        if (obj1.checkNeon(n)) {
            System.out.println("Given number " + n + " is Neon number");
        } else {
            System.out.println("Given number " + n + " is not a Neon number");
        }
    }
}

class NeonNumberClass2 {

    public static boolean checkNeon(int a) {

        int n = 0;
        int square = n * n;
        int sum = 0;

        while (square > 0) {
            int r = square % 10;
            sum += r;
            square = square / 10;
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}
