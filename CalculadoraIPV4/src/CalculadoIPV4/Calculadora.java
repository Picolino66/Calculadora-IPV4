package CalculadoIPV4;

import java.util.Scanner;

public class Calculadora {
 
 
    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
    Calculo calcip;
    
    char classe;
    double ip1, ip2, ip3, ip4, opc, laco;
   
    Ip cond = new Ip();
    
          do
            {
            System.out.println ("Digite a Classe, A, B e C: ");
            classe = input.next().charAt(0);
            
            System.out.println ("Digite a primeira parte do IP   :");
            ip1 = input.nextDouble();
           
            System.out.println ("Digite a segunda parte do IP    :");
            ip2 = input.nextDouble();
            
            System.out.println ("Digite a terceira parte do IP   :");
            ip3 = input.nextDouble();
            
            System.out.println("Digite a quarta parte do IP     :");
            ip4 = input.nextDouble();
            
            laco = cond.condicao(ip1, ip2, ip3, ip4, classe);
            }while (laco!=1);
            
            do 
            { 
            System.out.println ("\nDiga com que dados vai entrar\n");
            System.out.println ("1. Quantas Sub Redes \n");
            System.out.println( "2. Nos por Sub Rede \n");
            System.out.println( "3. Bits da Mascara \n");
            System.out.println( "4. Bits da Sub-Rede \n");
            System.out.println( "0. Sair \n");
            opc = input.nextDouble();
            
            new Calculo(classe, opc, ip1, ip2, ip3, ip4);
            
            }while (opc!=0);
    }
}
