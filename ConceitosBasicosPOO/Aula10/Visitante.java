package ConceitosBasicosPOO.Aula10;

public class Visitante extends Pessoa{
    public static void main(String[] args) {
        
    
    //Herança pobre
    Visitante v1 = new Visitante();

    v1.setNome("João");
    v1.setIdade(30);
    v1.setSexo("Masculino");
    System.out.println("Visitante: " + v1.getNome() + ", " + v1.getIdade() + " anos, " + v1.getSexo());
    Aluno p2 = new Aluno();
    p2.setNome("Maria");
    p2.setIdade(19);
    p2.setSexo("F");
    p2.setCurso("Informática");
    p2.setMatricula(12345);
    System.out.println("Aluno: " + p2.getNome() + ", " + p2.getIdade() + " anos, " + p2.getSexo() + ", Curso: " + p2.getCurso() + ", Matrícula: " + p2.getMatricula());

    }  
}
