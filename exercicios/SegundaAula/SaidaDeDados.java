package exercicios.SegundaAula;

public class SaidaDeDados {
    public static void main(String[] args) {
        float nota = 8.5f;
        String nome = "Bruno";
        System.out.println("Sua nota é " + nota);
        System.out.print("Sua nota é " + nota); //sem o ln não dá o \n
        System.out.print("\n");
        System.out.printf("A nota de %s é %.2f\n", nome, nota); //Print formatado com duas casa decimais(.2)
    }
}
