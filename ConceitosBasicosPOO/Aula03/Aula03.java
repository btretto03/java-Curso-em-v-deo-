package ConceitosBasicosPOO.Aula03;

public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal"; //public
        c1.cor = "Preta"; //public
        // c1.ponta = 0.5f; private, o Vs code nao deixa
        c1.carga = 5; //protected
        c1.tampada = false;
        c1.status();
        c1.rabiscar();
        System.out.println();

        /**Desse jeito eu posso alterar uma classe privada, se eu criar um método publico,
         * pois dessa forma não estou alterando na main, mas estou chamando o metodo que 
         * esta na classe caneta e esse altera lá
         */
        c1.mudarponta(3);
        c1.status();
    }
}
