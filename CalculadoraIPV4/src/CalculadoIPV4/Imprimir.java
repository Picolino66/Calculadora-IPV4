package CalculadoIPV4;

public class Imprimir {
    /*Função feita para imprimir os dados*/
    void imprimir (double bitsrede, double bitsmasc, double nos, double subredes, double masc, char classe, double ip1, double ip2, double ip3, double ip4)
    {
     int i;
 		if (classe == 'A' || classe == 'a')
       { 
	        /*system("cls");*/
        	System.out.println(+bitsrede +" bits de subrede.\n");
        	System.out.println(+bitsmasc + " bits de mascara.\n");
        	System.out.println(+nos + " nos na rede (Incluindo ip da rede e broadcast.\n");
        	System.out.println(+subredes + " sub-redes.\n");
        	if (bitsrede <= 8)
        	{
        		System.out.println("Mascara 255."+masc+".0.0 --- Mascara A. \n");
        	}
        	if (bitsrede >=9 && bitsrede <=16)
        	{ 
        		System.out.println("Mascara 255.255."+masc+".0 --- Mascara B. \n");
        	}
        	if (bitsrede >=17 && bitsrede <=22 )
         	{  
         		System.out.println("Mascara 255.255.255."+masc+" --- Mascara C. \n");          
         	}
     	}
        if (classe == 'B' || classe == 'b')
       	{ 
        	/*system("cls");*/
        	System.out.println (bitsrede + " bits de subrede.\n");
        	System.out.println (bitsmasc + " bits de mascara\n");
        	System.out.println (nos + " nos na rede (Incluindo ip inicial e broadcast.\n");
        	System.out.println (subredes + " sub-redes.\n");
        	if (bitsrede <= 8)
        	{
        		System.out.println ("Mascara 255.255."+masc+".0 --- Mascara B. \n");
        	}
        	if (bitsrede >=9 && bitsrede <=14)
        	{ 
        		System.out.println ("Mascara 255.255.255."+masc+" --- Mascara C. \n");
        	}
       	}
    	if (classe == 'C' || classe == 'c')
       	{ 
        	/*system("cls");*/
        	System.out.println (bitsrede + " bits de subrede.\n");
        	System.out.println (bitsmasc + " bits de mascara.\n");
        	System.out.println (nos + " nos na rede (Incluindo ip da rede e broadcast.\n");
        	System.out.println ( subredes + " sub-redes.\n");
        	if (bitsrede <= 8)
       	 	{
        		System.out.println ("Mascara 255.255.255."+masc+" --- Mascara C. \n");
        	}
       }
        
}

    
}
