/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Ny-731-t12
 */
import java.util.Scanner;
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello , World! ");
        System.out.println("I love Math.");
        System.out.println("My name is Kemo.");
        System.out.println("Stephanie and Angel");
        System.out.println("Skateboarding");
        System.out.println("       0     ");
        System.out.println("       |     ");
        System.out.println("   ____|____");
        System.out.println("  |         |");
        System.out.println("  |   |  |  |");
       System.out.println("*=|         |=*");
        System.out.println ("  |  XXXXX  |");
        System.out.println("  |_________|");
        System.out.println("Bubbles");
        System.out.println("Robotics is life.");
        System.out.println("ローズ");
        
        Scanner in = new Scanner(System.in);
        System.out.println("how much is your fahrenheit?");
        double farenheit = in.nextDouble () ;
        double celsius = (farenheit - 32) * 5/9; 
        double kelvin = ( celsius+ 273);
        System.out.println("tFarenheit\tCelsius\tKelvin");
        System.out.println(farenheit + "\t" + celsius + "\t" + kelvin );
        
          
       
       
        
        
        
        
        
        
        
        
        
        

    }
    
}
