/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app.pkg03;

/**
 *
 * @author 100157856
 */
import java.util.*;
public class App03 {

    double vc=0,vs=0,vcd=0;
    
void volume(int s)         
{
            vc=s*s*s;
    
            System.out.println("The volume of the cube is"+vc);
            
}

void volume(float r)
{
    vs=(4/3)*(22/7)*r*r*r;
    
    System.out.println("The volume of the sphere is "+vs);
    
    
}

    void volume(int l,int b,int h)
    {
        vcd=l*b*h;
        System.out.println("The volume of the cuboid is "+vcd);
        
        
    }
            
            
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int s,l,b,h;
    float r;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the side of the cube");
    s=sc.nextInt();
    
    System.out.println("Enter the radius of the sphere");
    r=sc.nextFloat();
    
    System.out.println("Enter l,b,h of the cube");
    
    l=sc.nextInt();
    b=sc.nextInt();
    h=sc.nextInt();
    App03 obj=new App03();
    
    obj.volume(s);
    obj.volume(r);
    obj.volume(l,b,h);
    
   
            
 
    
    
    
    
    
    
    
    
    
    
    }
    
}
