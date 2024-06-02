package aula;

import java.util.Scanner;

//                  Crie um programa que recebe uma quantidade de números definidos pelo usuário via terminal e apresente as seguintes informações:

//                         A lista de números recebidos;
//                         Média;
//                         Desvio padrão;
//                         Maior e menor valor.

public class Calculadora {
	
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

        System.out.println("Quantidade de numeros:");
        
        //tamanho do Array //
        
        int [] numeros = new int[sc.nextInt()];
        
        //le os numeros do teclado e coloca no aray//
        
        System.out.println("numeros:");
        for(int i = 0; i < numeros.length; i++) {
        	numeros[i] = sc.nextInt();
        }
        	//Na calculadora implementar array 
        	
        	System.out.println("Lista de números:");
        	for(int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }
        	
        	sc.close();
        	
        	Estatiticas estatiticas = new Estatiticas(numeros);

        	System.out.println("media: " + estatiticas.medianum()); 
        	System.out.println("menor: " + estatiticas.menornum()); 
        	System.out.println("maior: " + estatiticas.maiornum());
        	System.out.println("Desvio: " + estatiticas.desvionum());

        }
        
    }
	

