package ConceitosBasicosPOO.Aula08;

public class Aula08 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Fernando", "Brasil", 25, 1.75f, 70.5f, 10, 5, 3);
        l[1] = new Lutador("Carlos", "Brasil", 30, 1.80f, 80.0f, 15, 2, 1);
        l[2] = new Lutador("João", "Brasil", 28, 1.70f, 65.0f, 12, 3, 2);
        l[3] = new Lutador("Pedro", "Brasil", 32, 1.85f, 90.0f, 20, 1, 0);
        l[4] = new Lutador("Lucas", "Brasil", 27, 1.78f, 75.0f, 8, 4, 1);
        l[5] = new Lutador("Ricardo", "Brasil", 29, 1.82f, 85.0f, 18, 2, 3);
        
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[0], l[1]);
        UFC01.lutar();
    }
}
