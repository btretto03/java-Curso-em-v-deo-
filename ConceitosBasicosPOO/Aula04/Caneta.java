package ConceitosBasicosPOO.Aula04;

public class Caneta {
    // 1. Definição dos Atributos
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    // 2. Método Construtor (Tem o mesmo nome da classe)
    // Inicializa a caneta exigindo 3 parâmetros obrigatórios e já tampando ela por padrão.
    public Caneta(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.setPonta(p); // Pode usar o método setter ou "this.ponta = p;"
        this.tampar();    // Toda caneta instanciada já nascerá tampada
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() { 
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}