package exercicios.QuintaAula;
import java.util.Scanner;

public class EstruturasEncadeadas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String tipo;
        int pernas = entrada.nextInt();

        switch(pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 4:
                tipo = "quadrúpede";
                break;
            case 6,8:
                tipo = "aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);

        entrada.close();
    }
}
