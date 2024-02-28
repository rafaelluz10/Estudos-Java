
package main;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       
      Scanner grava = new Scanner (System.in);
      double salario, va, vt, ir1,ir2;
      
      System.out.println("Digite o valor do seu salário:"); 
      salario = grava.nextDouble();
      
      vt = salario * 0.02; 
      salario = salario - vt;  
      
      va = salario * 0.06;
      salario = salario - va; 
      
      ir1 = salario * 0.07; 
      salario = salario - ir1; 
     
     
      if (salario > 1200){ 
      ir2 = salario * 0.15;
      salario = salario - ir2; 
      System.out.println("O seu salário liquido é de:"+salario);
      System.out.println("Você caiu no segundo desconto de Imposto de Renda!");
    }else {
    System.out.println("O seu salário liquido é:" + salario); 
    System.out.println("Não houve desconto de ir");
        
    }
      
      System.out.println("O desconto de Vale Transporte foi:"+vt);
      System.out.println("O desconto de Ticket Alimentação foi:"+va);
      System.out.println("O desconto de Imposto de renda faixa 1 foi:"+ir1);
   
       
    }
      
      
      
      
      
      
      
      
      
      
     
      
      
     
     
    }
    
}
