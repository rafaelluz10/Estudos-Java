
package while10;

import java.util.Scanner;

public class While10 {

 
    public static void main(String[] args) {
       
      Scanner grava = new Scanner(System.in);
      int cont=0, valor=0 , di=0 , fi=0;
      while(cont < 10){
          cont++;
          System.out.println("Digite o valor "+ cont);
          valor= grava.nextInt();
          if(valor >= 10 && valor <= 50){
              di++;
          }else{
              fi++;
          }

      }
      System.out.println("Foram digitados " + di + " valores dentro do intervalo");
      System.out.println("Foram digitados " + fi + " valores fora do intervalo");

    }
    
}
