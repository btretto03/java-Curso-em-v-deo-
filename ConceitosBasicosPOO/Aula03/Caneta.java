package ConceitosBasicosPOO.Aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    /* this é uma referência ao objeto que chamou, sempre que você quiser mexer em um atributo 
    * coloque a palavra this antes dele  */
    public void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }

    public void mudarponta (int a) {
        this.ponta = a;
    }
}
