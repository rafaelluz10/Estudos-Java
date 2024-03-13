package main;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner grava = new Scanner (System.in);
        
        int resultado1=0, resultado2=0, resultado3=0, resultado4=0, resultado5=0, resultado6=0, resultado7=0, resultado8=0, resultado9=0, resultado10=0, resultados=0;
        int pergunta1, pergunta2, pergunta3, pergunta4, pergunta5, pergunta6, pergunta7, pergunta8, pergunta9, pergunta10;
    
        System.out.println("Quiz de matemática, digite o valor da alternativa correta.");
    
        System.out.println("Primeira pergunta: ");
        System.out.println("Quanto é dez mais cinco?");
        System.out.println("8");
        System.out.println("6");
        System.out.println("15");
        pergunta1 = grava.nextInt();
        
        
        if (pergunta1 == 15 ){
        resultado1 = resultado1 +1;
        };
        
        System.out.println("Segunda pergunta: ");
        System.out.println("Quanto é a raiz quadrada de 121?");
        System.out.println("11");
        System.out.println("248");
        System.out.println("27");
        pergunta2 = grava.nextInt();
        
        
        if (pergunta2 == 11){
        resultado2 = resultado2+1;
        };
        
        System.out.println("Terceira pergunta: ");
        System.out.println("Quanto é dez por cento de 1200");
        System.out.println("120");
        System.out.println("134");
        System.out.println("119");
        pergunta3 = grava.nextInt();
        
        
        if (pergunta3 == 120){
        resultado3 = resultado3+1;
        };
        
        System.out.println("Quarta pergunta: ");
        System.out.println("Quanto é quinze multiplicado por sete?");
        System.out.println("186");
        System.out.println("98");
        System.out.println("105");
        pergunta4 = grava.nextInt();
        
        
        if (pergunta4 == 105){
        resultado4 = resultado4+1;
        };
        
        System.out.println("Quinta pergunta: ");
        System.out.println("Quanto é três elevado a terceira potência?");
        System.out.println("12");
        System.out.println("9");
        System.out.println("27");
        pergunta5 = grava.nextInt();
        
        
        if (pergunta5 == 27){
        resultado5 = resultado5+1;
        };
        
        System.out.println("Sexta pergunta: ");
        System.out.println("Quanto é 315 dividido por 7?");
        System.out.println("73");
        System.out.println("45");
        System.out.println("38");
        pergunta6 = grava.nextInt();
        
        
        if (pergunta6 == 45){
        resultado6 = resultado6+1;
        };
        
        System.out.println("Sétima pergunta: ");
        System.out.println("Quanto é 34+27");
        System.out.println("121");
        System.out.println("54");
        System.out.println("61");
        pergunta7 = grava.nextInt();
        
        
        if (pergunta7 == 61){
        resultado7 = resultado7+1;
        };
        
        System.out.println("Oitava pergunta: ");
        System.out.println("Quanto é a raiz quadrada de 4?");
        System.out.println("2");
        System.out.println("12");
        System.out.println("9");
        pergunta8 = grava.nextInt();
        
        
        if (pergunta8 == 2){
        resultado8 = resultado8+1;
        };
        
        System.out.println("Nona pergunta: ");
        System.out.println("Quanto é 100 elevado a 0?");
        System.out.println("0");
        System.out.println("1");
        System.out.println("100");
        pergunta9 = grava.nextInt();
        
        
        if (pergunta9 == 15){
        resultado9 = resultado9+1;
        };
        
        System.out.println("Décima pergunta: ");
        System.out.println("Quanto");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        pergunta10 = grava.nextInt();
        
        
        if (pergunta10 == 0){
        resultado10 = resultado10 + 1;
        };
        
        resultados=(resultado1 + resultado2 + resultado3 + resultado4 + resultado5 + resultado6 + resultado7 + resultado8 + resultado9 + resultado10);
        
        if (resultados <= 3 )
        System.out.println("Não manja nada," +resultados);
        else if(resultados >= 4 && resultados <=6)
            System.out.println("Precisa estudar mais," +resultados);
        else if(resultados >= 7 && resultados <=8)
            System.out.println("Foi bem, quase gabaritou" +resultados);
        else if(resultados == 9 )
            System.out.println("Foi por pouco" +resultados);
        else
            System.out.println("Você conhece do assunto, parabéns" +resultados);
            
    }
    
    
}

        

    
    
    
    
    
    
    
         
     
        
        
        
       
