package CalculadoIPV4;
import java.util.Scanner;

 public class Calculo 
 {
    Calculo(char classe, double opc, double ip1, double ip2, double ip3, double ip4)
    {
            double bitsrede, subredes, bitsmasc, masc, nos, i,auxsubredes, auxbitsrede,auxip1=ip1, auxip2=ip2, auxip3=ip3, auxip4=ip4, auxnos;
            Scanner input = new Scanner(System.in);
            Funcoes funcip = new Funcoes();
            Imprimir impip = new Imprimir();
           /*Opçao 1 recebe rede e faz os cálculos*/
           if (opc == 1)
           {
               System.out.println ("Digite quantas sub-redes vai ter:");
               subredes = input.nextInt();

               auxsubredes = funcip.Redes(subredes, classe);

               if (auxsubredes !=0)
               {
                   if (classe == 'A' || classe == 'a')
                   { 
                       nos = (16777216 / auxsubredes);
                       bitsrede = funcip.BitsRede(auxsubredes);
                       bitsmasc = bitsrede + 8;
                       masc = funcip.Mascara (bitsrede);
                       impip.imprimir (bitsrede,bitsmasc,nos,auxsubredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
                   }     

                   if (classe == 'B' || classe == 'b')
                   {        
                       nos = (65536 / auxsubredes);
                       bitsrede = funcip.BitsRede(auxsubredes);
                       bitsmasc = bitsrede + 16;
                       masc = funcip.Mascara (bitsrede);
                       impip.imprimir (bitsrede,bitsmasc,nos,auxsubredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
                   }      

                   if (classe == 'C' || classe == 'c')
                   { 
                       nos = (256 / auxsubredes);
                       bitsrede = funcip.BitsRede(auxsubredes);
                       bitsmasc = bitsrede + 24;
                       masc = funcip.Mascara (bitsrede);
                       impip.imprimir (bitsrede,bitsmasc,nos,auxsubredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
                   }
               }       
       }

       /*Opçao 2 recebe rede e faz os cálculos*/
       if (opc == 2)
       {
               System.out.println ("Digite o numero de nos na rede (Incluindo ip de rede e broadcast): ");
               nos = input.nextInt();
               auxnos = funcip.Nos(nos, classe);
               if (auxnos!=0)
               {
                   if (classe == 'A' || classe == 'a')
                       { 
                               subredes = (16777216/auxnos); 
                               auxsubredes = subredes;
                               bitsrede = funcip.BitsRede(auxsubredes);
                               bitsmasc = bitsrede + 8;
                               masc = funcip.Mascara(bitsrede);
                               impip.imprimir (bitsrede,bitsmasc,auxnos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
                       }

                   if (classe == 'B' || classe == 'b')
                       { 
                               subredes = (65536 / auxnos);
                               auxsubredes = subredes;
                               bitsrede = funcip.BitsRede(auxsubredes);
                               bitsmasc = bitsrede + 16;
                               masc = funcip.Mascara (bitsrede);
                               impip.imprimir (bitsrede,bitsmasc,auxnos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
                       }         

                   if (classe == 'C' || classe == 'c')
                       { 
                               subredes = (256 / auxnos);
                               auxsubredes = subredes;
                               bitsrede = funcip.BitsRede(auxsubredes);
                               bitsmasc = bitsrede + 24;
                               masc = funcip.Mascara(bitsrede);
                               impip.imprimir (bitsrede,bitsmasc,auxnos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
                       }       
                       }
       }

       /*Opçao 3 recebe rede e faz os cálculos*/
        if (opc == 3)
        {
                   System.out.println ("Digite os Bits da mascara: ");
                   bitsmasc = input.nextInt();
                   if ((classe == 'A' || classe == 'a') && bitsmasc<=30 && bitsmasc>=8)
                   {
                           bitsrede = bitsmasc - 8;
                           subredes = Math.pow(2,bitsrede);
                           nos = (16777216 / subredes);
                           masc = funcip.Mascara (bitsrede);
                           impip.imprimir (bitsrede,bitsmasc,nos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
                   }

                   if ((classe == 'B' || classe == 'b') && bitsmasc<=30 && bitsmasc>=16)
                   {
                           bitsrede = bitsmasc - 16;
                           subredes = Math.pow(2,bitsrede);
                           nos = (65536 / subredes);
                           masc = funcip.Mascara (bitsrede);
                           impip.imprimir (bitsrede,bitsmasc,nos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);    
                   }

                   if ((classe == 'C' || classe == 'c') && bitsmasc<=30 && bitsmasc>=24)
                   {
                           bitsrede = bitsmasc - 24;
                           subredes = Math.pow(2,bitsrede);
                           nos = (256 / subredes);
                           masc = funcip.Mascara (bitsrede);
                           impip.imprimir (bitsrede,bitsmasc,nos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);         
                   }

       }

       /*Opçao 4 recebe rede e faz os cálculos*/
        if (opc == 4)
        {
                   System.out.println ("Digite os Bits da subrede: ");
                   bitsrede = input.nextInt();    
                   auxbitsrede = bitsrede;
                   if ((classe == 'A' || classe == 'a') && bitsrede <=22)
                   {
                           bitsmasc = bitsrede + 8;
                           subredes = Math.pow(2,bitsrede);
                           nos = (16777216 / subredes);
                           masc = funcip.Mascara (bitsrede);
                           impip.imprimir (bitsrede,bitsmasc,nos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
                   }

                   if ((classe == 'B' || classe == 'b') && bitsrede <=14)
                   {   
                           bitsmasc = bitsrede + 16;
                           subredes = Math.pow(2,bitsrede);
                           nos = (65536 / subredes);
                           masc = funcip.Mascara (bitsrede);
                           impip.imprimir (bitsrede,bitsmasc,nos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
                   }

                   if ((classe == 'C' || classe == 'c') && bitsrede <=6)
                   {
                           bitsmasc = bitsrede + 24;
                           subredes = Math.pow(2,bitsrede);
                           nos = (256 / subredes);
                           masc = funcip.Mascara (bitsrede);
                           impip.imprimir (bitsrede,bitsmasc,nos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);         
                   }
       }


    }
   
}

