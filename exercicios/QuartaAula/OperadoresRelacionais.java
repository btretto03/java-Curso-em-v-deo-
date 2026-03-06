package exercicios.QuartaAula;

public class OperadoresRelacionais {
   public static void main(String[] args) {
    //A grande maioria dos relacionais são iguais ao C
    String nome1 = "Bruno";
    String nome2 = "Bruno";

    String res = (nome1 == nome2) ? "igual" : "diferente";
    System.out.println(res);

    //Outra forma de comprar
    System.out.println(nome1.equals(nome2)); //retorna true
   }
}
