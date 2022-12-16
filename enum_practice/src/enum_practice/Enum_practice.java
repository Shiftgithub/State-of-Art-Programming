/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enum_practice;

/**
 *
 * @author Kernel
 */
public class Enum_practice {

    /**
     * @param args the command line arguments
     */
    
    enum size{
        strongly_not_agree,
        not_agree,
        agree,
        strongly_agree
        
    }
    public static void main(String[] args) {
        for(size s:size.values())
        {
            show(s);
        }
    }
    private static void show(size s)
    {
        if(s.equals(size.not_agree))
        {
            System.out.println("not_agree");
    }
        else if(s.equals(size.agree))
        {
            System.out.println("agree");
        }
        else if(s.equals(size.strongly_agree))
        {
            System.out.println("strongly_agree");
        }
    }
}
