package ConceitosBasicosPOO.Aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    /* this é uma referência ao objeto que chamou, sempre que você quiser mexer em um atributo 
    * coloque a palavra this antes dele  */
    void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
