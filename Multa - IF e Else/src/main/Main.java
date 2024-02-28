
package main;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
    double velocidadepermitida, velocidadecarro, sub;  
     
    Scanner grava = new Scanner (System.in); 
    
   System.out.println("A velocidade permitida na via é:");
   velocidadepermitida = grava.nextDouble();
   
   System.out.println("A velocidade do carro é de:");
   velocidadecarro = grava.nextDouble();
  
   sub = velocidadecarro - velocidadepermitida ;
   
   if (sub <= 0); {
   System.out.println("Você não foi multado");     
   }
   if(sub <=10) {
     System.out.println("Aviso, acima do limite. Multa de R$80,00");
   }
    else if (sub<=39) {
       System.out.println("Aviso, acima do limite da via. Multa de R$120,00");
    }
    else 
    System.out.println("Aviso, acima do limite da via. Multa de R$200,00");
  }

}

