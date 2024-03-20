package main;
 
import java.util.Scanner;
 
public class Main {
 
  
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int quant=0;
        System.out.println("Digite a quantidade de vezes á aparecer a mensagem");
        quant = grava.nextInt();
        while(quant > 0){
            System.out.println("Isso é um teste" + quant);
            quant--;
        }
         } 
    }

