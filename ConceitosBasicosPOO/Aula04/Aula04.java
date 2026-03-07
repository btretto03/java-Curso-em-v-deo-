package ConceitosBasicosPOO.Aula04;

public class Aula04 {

    public static void main(String[] args) {
        
        // Criando a primeira caneta utilizando o Método Construtor
        Caneta c1 = new Caneta("BIC", "Amarela", 0.4f);
        c1.status();
        
        System.out.println("-------------------------");
        
        // Criando uma segunda caneta (objeto independente) usando o mesmo Construtor
        Caneta c2 = new Caneta("KKK", "Laranja", 1.5f);
        c2.status();
        
        /* * OBSERVAÇÕES DA AULA:
         * Como o construtor já tampou as canetas internamente (this.tampar();), 
         * tanto a c1 quanto a c2 vão imprimir "Tampada: true" no status.
         */
    }
}