package ConceitosBasicosPOO.Aula09;

public class projetoPessoas {
    public static void main(String[] args) {
        //Programa principal
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Professor p3 = new Professor();
        
        p1.setNome("Pedro");
        p1.setIdade(20);
        p1.setSexo("M");
        p2.setNome("Maria");
        p2.setIdade(19);
        p2.setSexo("F");
        p3.setNome("Cláudio");
        p3.setIdade(30);
        p3.setSexo("M");
        p3.setEspecialidade("Computação");
        p3.setSalario(5000);
        System.out.println("Pessoa 1: " + p1.getNome() + ", " + p1.getIdade() + " anos, " + p1.getSexo());
        System.out.println("Pessoa 2: " + p2.getNome() + ", " + p2.getIdade() + " anos, " + p2.getSexo());
        System  .out.println("Professor: " + p3.getNome() + ", " + p3.getIdade() + " anos, " + p3.getSexo() + ", Especialidade: " + p3.getEspecialidade() + ", Salário: R$" + p3.getSalario());
    }
}
