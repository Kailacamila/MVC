package aula;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        Estatiticas estatiticas = new Estatiticas(numeros);

        System.out.println("media: " + estatiticas.medianum()); 
        System.out.println("menor: " + estatiticas.menornum()); 
        System.out.println("maior: " + estatiticas.maiornum());
        System.out.println("Desvio: " + estatiticas.desvionum()); 
    }
}
