#include <cstdlib>
#include <iostream>
#include <stdio.h>
#include<stdlib.h>
#include <math.h>

using namespace std;

/*Funçao verifica se o ip tá na classe informada*/
void Condicao (char classe, int ip1, int ip2, int ip3, int ip4)
{
    if (classe == 'A' || classe == 'a')
    {
       while (ip1 < 1 || ip1 > 126) 
       {  
          cout << "Esse IP nao e dessa classe.\n";  
          cout << "Digite a Classe, A, B e C: ";
          cin >> classe;
          cout << "Digite a primeira parte do IP   :";
          cin >> ip1;
          cout << "Digite a segunda parte do IP    :";
          cin >> ip2;
          cout << "Digite a terceira parte do IP   :";
          cin >> ip3;
          cout << "Digite a quarta parte do IP     :";
          cin >> ip4;
          system("cls");  
       }
    }
    
      if (classe == 'B' || classe == 'b')
    {
       while (ip1 < 128 || ip1 > 191)  
       {  
       cout << "Esse IP nao e dessa classe.\n";  
       cout << "Digite a Classe, A, B e C: ";
       cin >> classe;
       cout << "Digite a primeira parte do IP   :";
       cin >> ip1;
       cout << "Digite a segunda parte do IP    :";
       cin >> ip2;
       cout << "Digite a terceira parte do IP   :";
       cin >> ip3;
       cout << "Digite a quarta parte do IP     :";
       cin >> ip4;
       system("cls");  
       }
    }
     if (classe == 'C' || classe == 'c')
    {
     while (ip1 < 192 || ip1 > 223)  
       {  
        cout << "Esse IP nao e dessa classe.\n";    
        cout << "Digite a Classe, A, B e C: ";
        cin >> classe;
        cout << "Digite a primeira parte do IP   :";
        cin >> ip1;
        cout << "Digite a segunda parte do IP    :";
        cin >> ip2;
        cout << "Digite a terceira parte do IP   :";
        cin >> ip3;
        cout << "Digite a quarta parte do IP     :";
        cin >> ip4;
        system("cls");
       }
     }
}    

/*função que recebe os bitsderede e converte em máscara*/
int Mascara (int auxbitsrede)
 {
 int masc, i;
masc = 0;
	if (auxbitsrede <= 8)
    {
    	for (i=0; i<=(auxbitsrede-1); i++)
        {
        	masc = masc + pow (2,(7-i));
        }
    }
    if (auxbitsrede >=9 && auxbitsrede <=16)
    {
        for (i=0; i<=(auxbitsrede-9); i++)
        {
            masc = masc + pow (2,(7-i));
        }                      
                    
    }
    if (auxbitsrede >=17 && auxbitsrede <=22 )
    {
    	for (i=0; i<=(auxbitsrede-17); i++)
        {
        	masc = masc + pow (2,(7-i));
        }
                     
    }
    return masc;
}

/*Funçao que recebe a quantidade de subredes e converte em bits de rede*/
int BitsRede (int auxsubredes)
{
int bitsrede;
bitsrede = 0;
	while (auxsubredes != 1)
    {
    	auxsubredes = auxsubredes / 2;
        bitsrede = bitsrede + 1;      
    }
return bitsrede;
}



/*Funçao recebe quantidade de nos na rede e verfica se cabe na classe*/
int Nos(int nos, char classe)
{
	int ajuda=0,auxnos=0,i;
	if ((classe == 'A' || classe == 'a') && nos >16777216)
    {
    		cout << "Nao e possivel com tantas nos.\n";
    		return 0;
	}	
	if ((classe == 'B' || classe == 'b') && nos > 65536)
    {	
		cout << "Nao e possivel com tantas nos.\n";
		return 0;
	}
	if ((classe == 'C' || classe == 'c') && nos > 256)
    {
    		cout << "Nao e possivel com tantas nos.\n";
    		return 0;
	}
else
{   
	i = 0;
	do{
	ajuda = pow (2,(i));
	cout << ajuda;
		if (nos <= ajuda ) 
		{
		   auxnos = ajuda;
		}
	i++;
   }while (ajuda != auxnos) ;
    
}
return auxnos;
}
/*Funçao recebe quantidade de subredes e verifica se ela cabe na classe*/
int Redes (int subredes, char classe)   
{
	int ajuda=0,auxsubredes=0,i;
	if ((classe == 'A' || classe == 'a') && subredes > 4194304)
    {
    		cout << "Nao e possivel com tantas sub-redes.\n";
    		return 0;
	}	
	if ((classe == 'B' || classe == 'b') && subredes > 16384)
    {	
		cout << "Nao e possivel com tantas sub-redes.\n";
		return 0;
	}
	if ((classe == 'C' || classe == 'c') && subredes > 64)
    {
    		cout << "Nao e possivel com tantas sub-redes.\n";
    		return 0;
	}
else
{   
	i = 0;
	do{
	ajuda = pow (2,(i));
	cout << ajuda;
		if (subredes <= ajuda ) 
		{
		   auxsubredes = ajuda;
		}
	i++;
    }while (ajuda != auxsubredes) ;
    
}
return auxsubredes; 
}
/*Funçao que recebe a opçao desejada do usuário e calcula a resposta*/
void IP (char classe, int opc, int ip1, int ip2, int ip3, int ip4)
{
int bitsrede, subredes, bitsmasc, masc, nos, i,auxsubredes, auxbitsrede,auxip1=ip1, auxip2=ip2, auxip3=ip3, auxip4=ip4, auxnos;

/*Opçao 1 recebe rede e faz os cálculos*/
if (opc == 1)
{
	cout << "Digite quantas sub-redes vai ter:";
    cin >> subredes;
    auxsubredes = Redes(subredes, classe);
    if (auxsubredes !=0)
    {
	if (classe == 'A' || classe == 'a')
       { 
        	nos = (16777216 / auxsubredes);
      		bitsrede = BitsRede(auxsubredes);
            bitsmasc = bitsrede + 8;
       	 	masc = Mascara (bitsrede);
       	 	Imprimir (bitsrede,bitsmasc,nos,auxsubredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
       }     
    
	if (classe == 'B' || classe == 'b')
       {        
	   		nos = (65536 / auxsubredes);
        	bitsrede = BitsRede(auxsubredes);
        	bitsmasc = bitsrede + 16;
       		masc = Mascara (bitsrede);
         	Imprimir (bitsrede,bitsmasc,nos,auxsubredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
       }      
       
    if (classe == 'C' || classe == 'c')
       { 
        	nos = (256 / auxsubredes);
        	bitsrede = BitsRede(auxsubredes);
            bitsmasc = bitsrede + 24;
       		masc = Mascara (bitsrede);
        	Imprimir (bitsrede,bitsmasc,nos,auxsubredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
       }
	}       
}

/*Opçao 2 recebe rede e faz os cálculos*/
if (opc == 2)
{
		cout << "Digite o numero de nos na rede (Incluindo ip de rede e broadcast): ";
        cin >> nos;
        auxnos = Nos(nos, classe);
        if (auxnos!=0)
        {
        if (classe == 'A' || classe == 'a')
       		{ 
				subredes = (16777216/auxnos); 
        		auxsubredes = subredes;
        		bitsrede = BitsRede(auxsubredes);
               	bitsmasc = bitsrede + 8;
        		masc = Mascara(bitsrede);
        		Imprimir (bitsrede,bitsmasc,auxnos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
         	}
			      
      	if (classe == 'B' || classe == 'b')
       		{ 
               	subredes = (65536 / auxnos);
       			auxsubredes = subredes;
      			bitsrede = BitsRede(auxsubredes);
               	bitsmasc = bitsrede + 16;
         		masc = Mascara (bitsrede);
         		Imprimir (bitsrede,bitsmasc,auxnos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
       		}         
       
      	if (classe == 'C' || classe == 'c')
       		{ 
				subredes = (256 / auxnos);
        		auxsubredes = subredes;
        		bitsrede = BitsRede(auxsubredes);
               	bitsmasc = bitsrede + 24;
        		masc = Mascara(bitsrede);
        		Imprimir (bitsrede,bitsmasc,auxnos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
       		}       
		}
}

/*Opçao 3 recebe rede e faz os cálculos*/
if (opc == 3)
 {
      cout << "Digite os Bits da mascara: ";
      cin >> bitsmasc;
 	if ((classe == 'A' || classe == 'a') && bitsmasc<=30 && bitsmasc>=8)
 	{
      bitsrede = bitsmasc - 8;
      subredes = pow(2,bitsrede);
      nos = (16777216 / subredes);
      masc = Mascara (bitsrede);
 	  Imprimir (bitsrede,bitsmasc,nos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
 	}

	if ((classe == 'B' || classe == 'b') && bitsmasc<=30 && bitsmasc>=16)
 	{
      bitsrede = bitsmasc - 16;
      subredes = pow(2,bitsrede);
      nos = (65536 / subredes);
      masc = Mascara (bitsrede);
      Imprimir (bitsrede,bitsmasc,nos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);    
 	}
 
 	if ((classe == 'C' || classe == 'c') && bitsmasc<=30 && bitsmasc>=24)
 	{
      bitsrede = bitsmasc - 24;
      subredes = pow(2,bitsrede);
      nos = (256 / subredes);
      masc = Mascara (bitsrede);
      Imprimir (bitsrede,bitsmasc,nos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);         
 	}
 
}

/*Opçao 4 recebe rede e faz os cálculos*/
if (opc == 4)
{
      cout << "Digite os Bits da subrede: ";
      cin >> bitsrede;    
      auxbitsrede = bitsrede;
 	if ((classe == 'A' || classe == 'a') && bitsrede <=22)
 	{
      bitsmasc = bitsrede + 8;
      subredes = pow(2,bitsrede);
      nos = (16777216 / subredes);
      masc = Mascara (bitsrede);
      Imprimir (bitsrede,bitsmasc,nos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
	}
	
	if ((classe == 'B' || classe == 'b') && bitsrede <=14)
	{
      bitsmasc = bitsrede + 16;
      subredes = pow(2,bitsrede);
      nos = (65536 / subredes);
      masc = Mascara (bitsrede);
      Imprimir (bitsrede,bitsmasc,nos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);
 	}
 	
	if ((classe == 'C' || classe == 'c') && bitsrede <=6)
 	{
      bitsmasc = bitsrede + 24;
      subredes = pow(2,bitsrede);
      nos = (256 / subredes);
      masc = Mascara (bitsrede);
      Imprimir (bitsrede,bitsmasc,nos,subredes,masc,classe, auxip1, auxip2, auxip3, auxip4);         
 	}
}


}

/*Função feita para imprimir os dados*/
void Imprimir (int bitsrede, int bitsmasc, int nos, int subredes, int masc, char classe, int ip1, int ip2, int ip3, int ip4)
 {
     int i;
 		if (classe == 'A' || classe == 'a')
       { 
	        system("cls");
        	cout << bitsrede << " bits de subrede.\n";
        	cout << bitsmasc << " bits de mascara.\n";
        	cout << nos << " nos na rede (Incluindo ip da rede e broadcast.\n";
        	cout << subredes << " sub-redes.\n";
        	if (bitsrede <= 8)
        	{
        		cout << "Mascara 255."<<masc<<".0.0 --- Mascara A. \n";
        	}
        	if (bitsrede >=9 && bitsrede <=16)
        	{ 
        		cout << "Mascara 255.255."<<masc<<".0 --- Mascara B. \n";
        	}
        	if (bitsrede >=17 && bitsrede <=22 )
         	{  
         		cout << "Mascara 255.255.255."<<masc<<" --- Mascara C. \n";          
         	}
     	}
        if (classe == 'B' || classe == 'b')
       	{ 
        	system("cls");
        	cout << bitsrede << " bits de subrede.\n";
        	cout << bitsmasc << " bits de mascara\n";
        	cout << nos << " nos na rede (Incluindo ip inicial e broadcast.\n";
        	cout << subredes << " sub-redes.\n";
        	if (bitsrede <= 8)
        	{
        		cout << "Mascara 255.255."<<masc<<".0 --- Mascara B. \n";
        	}
        	if (bitsrede >=9 && bitsrede <=14)
        	{ 
        		cout << "Mascara 255.255.255."<<masc<<" --- Mascara C. \n";
        	}
       	}
    	if (classe == 'C' || classe == 'c')
       	{ 
        	system("cls");
        	cout << bitsrede << " bits de subrede.\n";
        	cout << bitsmasc << " bits de mascara.\n";
        	cout << nos << " nos na rede (Incluindo ip da rede e broadcast.\n";
        	cout << subredes << " sub-redes.\n";
        	if (bitsrede <= 8)
       	 	{
        		cout << "Mascara 255.255.255."<<masc<<" --- Mascara C. \n";
        	}
       }
        
}

/*Programa principal*/    
int main()
{
    char classe;
    int ip1, ip2, ip3, ip4, opc;
 	do {       
    cout << "Digite a Classe, A, B e C: ";
    cin >> classe;
    cout << "Digite a primeira parte do IP   :";
    cin >> ip1;
    cout << "Digite a segunda parte do IP    :";
    cin >> ip2;
    cout << "Digite a terceira parte do IP   :";
    cin >> ip3;
    cout << "Digite a quarta parte do IP     :";
    cin >> ip4;
    system("cls");
    
    Condicao (classe, ip1, ip2, ip3, ip4);
  
    cout << "\nDiga com que dados vai entrar\n";
    cout << "1. Quantas Sub Redes \n";
    cout << "2. Nos por Sub Rede \n";
    cout << "3. Bits da Mascara \n";
    cout << "4. Bits da Sub-Rede \n";
    cout << "0. Sair \n";
    cin >> opc;
    system("cls");
    
    IP (classe, opc, ip1, ip2, ip3, ip4);
    }while (opc!=0);
    
    system("PAUSE");
    return EXIT_SUCCESS;
}

