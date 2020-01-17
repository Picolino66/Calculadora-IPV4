package CalculadoIPV4;

public class Funcoes {
    /*Funçao recebe quantidade de subredes e verifica se ela cabe na classe*/
    double Redes (double subredes, char classe)   
    {
	double ajuda=0,auxsubredes=0,i;
        
	if ((classe == 'A' || classe == 'a') && subredes > 4194304)
        {
    		System.out.println ("Nao e possivel com tantas sub-redes.\n");
    		return 0;
	}	
	if ((classe == 'B' || classe == 'b') && subredes > 16384)
            {	
		System.out.println ("Nao e possivel com tantas sub-redes.\n");
		return 0;
	}
	if ((classe == 'C' || classe == 'c') && subredes > 64)
        {
    		System.out.println ("Nao e possivel com tantas sub-redes.\n");
    		return 0;
	}
        else
        {   
            i = 0;
            do{
            ajuda = Math.pow (2,(i));
		if (subredes <= ajuda ) 
		{
		   auxsubredes = ajuda;
		}
            i++;
            }while (ajuda != auxsubredes) ;
    
        }   
    return auxsubredes; 
    }
    
    /*função que recebe os bitsderede e converte em máscara*/
double Mascara (double auxbitsrede)
 {
    double masc, i;
    masc = 0;
    if (auxbitsrede <= 8)
    {
        for (i=0; i<=(auxbitsrede-1); i++)
        {
            masc = masc + Math.pow (2,(7-i));
        }
    }
    if (auxbitsrede >=9 && auxbitsrede <=16)
    {
        for (i=0; i<=(auxbitsrede-9); i++)
        {
            masc = masc + Math.pow (2,(7-i));
        }                      
                    
    }
    if (auxbitsrede >=17 && auxbitsrede <=22 )
    {
    	for (i=0; i<=(auxbitsrede-17); i++)
        {
        	masc = masc + Math.pow (2,(7-i));
        }
                     
    }
    return masc;
}

/*Funçao que recebe a quantidade de subredes e converte em bits de rede*/
double BitsRede (double auxsubredes)
{
    double bitsrede;
    bitsrede = 0;
    while (auxsubredes != 1)
    {
    	auxsubredes = auxsubredes / 2;
        bitsrede = bitsrede + 1;      
    }
    return bitsrede;
}



/*Funçao recebe quantidade de nos na rede e verfica se cabe na classe*/
double Nos(double nos, char classe)
{
    double ajuda=0,auxnos=0,i;
    if ((classe == 'A' || classe == 'a') && nos >16777216)
    {   
        System.out.println("Nao e possivel com tantas nos.\n");
    	return 0;
    }	
    if ((classe == 'B' || classe == 'b') && nos > 65536)
    {	
	System.out.println("Nao e possivel com tantas nos.\n");
	return 0;
    }
    if ((classe == 'C' || classe == 'c') && nos > 256)
    {
    	System.out.println ("Nao e possivel com tantas nos.\n");
    	return 0;
    }
    else
    {   
	i = 0;
	do{
	ajuda = Math.pow (2,(i));
		if (nos <= ajuda ) 
		{
		   auxnos = ajuda;
		}
	i++;
        }while (ajuda != auxnos) ;
    
    }
    return auxnos;
}
   
}
