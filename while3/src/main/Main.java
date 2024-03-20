
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner grava = new Scanner(System.in);
    int idade = 1, soma = 0, quant =0; 
    double media = 0; 
    while(idade !=0){
    
    System.out.println("Digite a idade ou 0 para sair");
    idade = grava.nextInt();  
    soma = soma + idade; 
    quant++; 
    }
    quant = quant-1; 
    media = soma / quant; 
    System.out.println("A média é:"+ media);
  }   
}
