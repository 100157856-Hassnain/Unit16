/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator2;

/**
 *
 * @author 100157856
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            Calculator c1 = new Calculator();
            Calculator c2 = new Calculator();
            
           c1.name = "first Calculator";
           c2.name = "second Calculator";
            
            
            System.out.println(c1.name + " calculated " + c1.add(3, 4));
            System.out.println(c2.name + " calculated " + c2.modulus(29,5));
            
            
    }   
    
    
    }
