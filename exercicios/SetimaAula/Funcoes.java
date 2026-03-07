package exercicios.SetimaAula;

public class Funcoes {
    static void soma(int a, int b) { /*preciso do static, como main é static 
                                      * não posso chamar ele se não for static */
            int s = a + b;
            System.out.println(s);
        }
    
    static int soma2 (int a, int b) {
        int s  = a + b;
        return s;
    }
    public static void main(String[] args) {
        int b;
        soma(5,2);
        b = soma2 (5, 2);
        System.out.println(b);

    }
}
