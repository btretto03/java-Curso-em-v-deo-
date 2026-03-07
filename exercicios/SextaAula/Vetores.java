package exercicios.SextaAula;

import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
        int n[] = new int[4]; //vetor é um objeto
        n[0] = 1;
        n[1] = 2;
        n[2] = 3;
        n[3] = 4;

        /* Ou poderia declarar esse vetor dessa forma
        * int n[] = {1, 2, 3, 4} */

        for (int i = 0; i < 4; i ++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();

        System.out.println("Total de casa de n é " + n.length); //método igual o len do Python

        for (int valor: n) { //for each ( para cada valor do vetor n)
            System.out.println(valor);
        }

        int n2[] = {1, 5, 3, 5, 10};

        Arrays.sort(n2); // método para ordenar vetores
        int p = Arrays.binarySearch(n2, 3); //método para buscar um elemento
        System.out.println("Encontrei o valor na posicao " + p);

        Arrays.fill(n2, 0); //método para preencher todas posicoes do vetor com o valor
        for (int valor: n2) { //for each ( para cada valor do vetor n)
            System.out.println(valor);
        }
    }
}
