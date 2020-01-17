package CalculadoIPV4;
import java.util.Scanner;

public class Ip {
    
  double condicao(double ip1, double ip2, double ip3, double ip4, char classe)
  {
      double aux = 0;
        if (classe == 'A' || classe == 'a')
        {
            if (ip1 < 1 || ip1 > 126) 
            {          
                System.out.println  ("Esse IP nao e dessa classe.\n");  
                aux = 0;
            }
            else aux = 1;
        }
        if (classe == 'B' || classe == 'b')
        {
            if (ip1 < 128 || ip1 > 191)  
            {      
                System.out.println  ("Esse IP nao e dessa classe.\n");  
                aux = 0;
            }
            else aux = 1;
        }
        if (classe == 'C' || classe == 'c')
        {
            if (ip1 < 192 || ip1 > 223)  
            {      
                System.out.println  ("Esse IP nao e dessa classe.\n");  
                aux = 0;
            }
            else aux = 1;
        }
      return aux;
    }   
}
