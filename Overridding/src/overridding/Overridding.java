/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Kernel
 */
package overridding;
class my_class1
{
    int base_sal=20000;
    void sal()
    {
        System.out.println(base_sal);
    }
}
class my_class2 extends my_class1
{
    void sal()
    {
        int total_sal = base_sal + 5000;
        System.out.println("Total salary ="+ total_sal);
    }
}
public class Overridding{
    

    public static void main(String[]args)
    {
        my_class2 obj = new my_class2();
        obj.sal();
}
}