/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstract_practice;
import static abstract_practice.my_class.sal;
abstract class my_class
{
   static int sal=20000;
    String nam="abc";
    abstract void cal_sal();
}

class md extends my_class
{
    void cal_sal()
    {
        int net_sal=sal+sal*20/100;
        System.out.println(nam+"Anything"+net_sal);
    }
}

class ceo extends my_class
{
    void cal_sal()
    {
        int net_sal=sal+sal*15/100;
        System.out.println(nam+"Anything"+net_sal);
    }
}
class emp extends my_class
{
    void cal_sal()
    {
        int net_sal=sal+sal*10/100;
        System.out.println(nam+"Anything"+net_sal);
    }
}
class c
{
    static int value=100;
    static void prt()
    {
        System.out.println(value);
    }
}
public class Abstract_practice
{
     public static void main(String[] args)
     {
          my_class obj=new md();
          my_class obj1=new ceo();
          my_class obj2=new emp();
          obj.cal_sal();
          obj1.cal_sal();
          obj2.cal_sal();
         c.prt();
     }
}

