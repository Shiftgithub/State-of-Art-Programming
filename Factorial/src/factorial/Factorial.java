/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial;

import java.util.Scanner;

/**
 *
 * @author Kernel
 */
public class Factorial {
    private static int num1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner scn = new Scanner(System.in);
        int str1 = scn.nextInt();
        my_class my1 = new my_class();
        int res = my1.my_out(str1);
        System.out.println("Factorial is : "+res);
    }
}
class my_class{
    public int my_out(int str2){
        int fact = 1;
        for(int i = 1 ; i <= str2 ; i++){
            fact = fact * i;
        }
        return fact;
    }
}

