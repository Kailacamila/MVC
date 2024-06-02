package aula;

import java.util.ArrayList;

// impelemta as funçoes//  

public class Estatiticas implements Interface  {

     private ArrayList<Double> numeros;
     public Estatiticas (int[] numeros) {
    	 this.numeros = new ArrayList <> ();
    	 for (int numero: numeros) {
    		 this.numeros.add((double) numero);
    	 }
     }
     
	
	@Override 
		
	public float medianum() {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return (float) (soma / numeros.size());
    }
	

	@Override
	    public float desvionum() {
	    double media = medianum(); 
	    double sumOfSquareOfDifferences = 0; 
	    for (double numero : numeros) {
	        sumOfSquareOfDifferences += Math.pow(numero - media, 2);
	    }
	       return (float) Math.sqrt(sumOfSquareOfDifferences / numeros.size()); 
	} 
	
	

	@Override
	
	public int menornum() {
	    double menor = Double.MAX_VALUE;
	    for (double numero : numeros) {
	        if (numero < menor) {
	            menor = numero; 
	        }
	    }
	    return (int) menor;
	}
	
	@Override
	
	public int maiornum() {
	    double maior = Double.MIN_VALUE; 
	    for (double numero : numeros) {
	        if (numero > maior) {
	            maior = numero; 
	        }
	    }
	    return (int) maior;
	}
}