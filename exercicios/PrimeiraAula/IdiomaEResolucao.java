package exercicios.PrimeiraAula;

import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class IdiomaEResolucao {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.println(idioma.getDisplayLanguage()); 

        for (int i = 0; i < 14; i ++) {
            System.out.print("-");
        }

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimensao = toolkit.getScreenSize();
        System.out.println("\nA resolução da tela é:");
        System.out.println(dimensao.width + " x " + dimensao.height);
    }
}