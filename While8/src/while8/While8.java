
package while8;

import java.util.Scanner;


public class While8 {

    
    public static void main(String[] args) {
       Scanner grava = new Scanner(System.in);
      int tab=0, cont=0;
       System.out.println("Qual a tabuada você desejada ?");
       tab = grava.nextInt();
       System.out.println("");
       System.out.println("TABUADA");
       while(cont < 10){
           cont++;
           System.out.println(tab + " X " + cont + " = "+(tab*cont));
       }

      
      
      }
          
          

        
}
    
