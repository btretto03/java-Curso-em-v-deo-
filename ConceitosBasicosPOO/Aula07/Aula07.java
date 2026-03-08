package ConceitosBasicosPOO.Aula07;

public class Aula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "EUA", 31, 1.78f, 83.9f, 12, 3, 1);
        l[1] = new Lutador("Snapdragon", "Inglaterra", 29, 1.68f, 73.8f, 15, 2, 0);
        l[2] = new Lutador("Cyborg", "Brasil", 35, 1.93f, 108.0f, 14, 4, 2);
        l[3] = new Lutador("Barboza", "Brasil", 30, 1.75f, 79.0f, 10, 5, 3);
        l[4] = new Lutador("Leblanc", "França", 28, 1.65f, 68.0f, 16, 2, 1);
        l[5] = new Lutador("Nascimento", "Brasil", 32, 1.80f, 93.0f, 8, 7, 2);

        for(int i = 0; i < 6; i ++) {
            l[i].apresentar();
            l[i].status();
            System.out.println("-----------------------------");
        }
    }
}
