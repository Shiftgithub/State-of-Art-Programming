/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector_practice;
import java.util.*;
import java.util.Iterator;
/**
 *
 * @author Kernel
 */
public class Vector_practice {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector v= new Vector();
        v.add("small");
         v.add("large");
          v.add("medium");
           v.add("XL");
            v.add("XXL");
           
           Iterator i= v.iterator();
           while(i.hasNext())
           {
               System.out.println(i.next());
           }
    }
    
}
