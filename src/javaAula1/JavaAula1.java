package javaAula1;

import java.util.Scanner;

public class JavaAula1 {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
//códigos de if e else
				
		if( 5 < 10) {
	        System.out.println(" 5  é menor que 10");

	        }
	        else {
	            System.out.println("algo esta errado");
	            	}
	
//código de for
	for(int i=0;i <= 4; i++ ) {
        System.out.println(i);
    }

// códigos de while
	int i = 1;
   
    while( i <= 5) {
        System.out.println(i);
        ++i;
        
	}
    
    
    // códigos de case
    
    Scanner leitura = new Scanner(System.in);
    
    int x =0;
    
    System.out.println("digite um valor:");
    
    x = leitura.nextInt(); 

    switch(x){
    case 0:
        System.out.println("o seu valor é igual a 0");
        break;

    case 1:
        System.out.println("o seu valor é igual a 1");
        break;

    case 2:
        System.out.println("o seu valor é igual a 2");
        break;

    default:
        System.out.println("o seu valor é invalido");
        break;

    }
    
	}
}


