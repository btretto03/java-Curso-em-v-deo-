package exercicios.TerceiraAula;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2; 

        System.out.println("A média é igual a " + m);

        int numero = 5;
        //numero ++; //igual em C
        //System.out.println(numero); //printa(6)

        int valor = 5 + numero ++; // Ele soma 5 ao numero e depois ++
        System.out.println(valor); //printa 10

        int numero2 = 5;
        int valor2 = 5 + ++numero2; 
        System.out.println(valor2); // Aqui sim vai somar 6 e printa 11
    }
}
