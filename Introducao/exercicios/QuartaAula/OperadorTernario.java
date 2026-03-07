package Introducao.exercicios.QuartaAula;

public class OperadorTernario {
    public static void main(String[] args) {
        int n1 = 3, n2 = 4;

        if (n1 > n2) {
            n1 = n2;
        } else {
            n1 = 1;
        }

        /*Posso escrever esse mesmo bloco if como
        * Se a condição (n1 > n2) for verdadeira (?), ela recebe n2. 
        * Caso contrário (:), ela recebe 1
        */
        n1 = (n1 > n2) ? n2 : 1;

    }
}
