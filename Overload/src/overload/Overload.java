/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Overload;
    
class my_class
{
    void area(int a,int b)
    {
        int ar=a*b;
        System.out.println("Area of rectangle is = "+ar);
    }
    void area(int a)
    {
        int ar= a*a;
        System.out.println("Area of square is = "+ar);
    }
}

    public class Overload {
    public static void main(String[]args)
    {
        my_class obj1=new my_class();
        obj1.area(5,2);
        obj1.area (3);
}
}


