/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interface_practice;

/**
 *
 * @author Kernel
 */
 interface intr_1
 {
     final int base_fare=500;
     
     public void final_fare();
 }
 class bike implements intr_1
{
    public void final_fare()
    {
        int final_fare=base_fare+500;
        System.out.println("For bike"+final_fare);
    }
}

class bus extends bike
{
    public void final_fare()
    {
        int final_fare=base_fare+2000;
        System.out.println("For bus" +final_fare);
    }
}
public class Interface_practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bike obj1=new bike();
        obj1.final_fare();
        bike obj2=new bus();
        obj2.final_fare();
        
    }
    
}
