/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor;

class my_class
{
    int a,b;
    
 my_class(int x,int y)
{
    a=x;
    b=y;
}
void area()
{
    int ar=a*b;
    System.out.println("Area of rectangle is="+ar);
}
}
public class CONSTRUCTOR {

    
    public static void main(String[] args) {
        my_class obj1 = new my_class(5,2);
        obj1.area();
    }
    
}
