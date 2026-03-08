package ConceitosBasicosPOO.Aula08;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            desafiado.apresentar();
            System.out.println("-------------------");
            desafiante.apresentar();
            System.out.println("-------------------");
            int vencedor = (int) (Math.random() * 3); // 0, 1 ou 2
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: //ganhou desafiado
                    System.out.println(desafiado.getNome() + " Venceu!!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: //ganhou desafiante
                    System.out.println(desafiante.getNome() + " Venceu!!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
        }
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }
}
