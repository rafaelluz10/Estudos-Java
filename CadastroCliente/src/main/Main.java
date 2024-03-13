
package main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
     Scanner grava = new Scanner (System.in);
    long cpf;
    int menu, rg, codigo, sair; 
    
    System.out.println("Menu");
    System.out.println("Digite sua opção");
    System.out.println("1 - Inclusão");
    System.out.println("2 - Alteração");
    System.out.println("3 - Exclusão");
    System.out.println("4 - Sair");
    menu = grava.nextInt(); 
    
    if (menu == 1) {
        System.out.println("Digite seu cpf:");
        cpf = grava.nextLong();
        System.out.println("Digite seu rg:");
        rg = grava.nextInt();
        System.out.println("Digite seu código");
        codigo = grava.nextInt(); 
    } else if (menu == 2) {
        System.out.println("Registro Alterado com sucesso");
    } else if (menu == 3) {
        System.out.println("Registro Excluido com sucesso");
    } else if (menu ==4) { 
        System.out.println ("Fechando o sistema");
    }else
        System.out.println("Opção Inválida");
    }
   
    
   
}
    

