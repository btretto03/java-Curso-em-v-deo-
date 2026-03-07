package Introducao.exercicios.SegundaAula;
import java.util.Scanner; //ferramenta para ler dados

public class EntradaDeDados {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); // Cria o "leitor" e conecta ele ao teclado (System.in)

    System.out.println("Digite o nome do aluno: ");
    String nome = entrada.nextLine(); // Pausa o programa, lê o texto digitado e guarda na variável 'nome'

    System.out.println("Digite a nota do aluno:");
    float nota = entrada.nextFloat(); // Pausa novamente, lê o número e guarda na variável 'nota'

    System.out.printf("A nota de %s é %.2f\n", nome, nota);

    entrada.close(); //Desliga o leitor (boa prática)

    /*
    * Se quiser usar o teclado para ler um num inteiro:
    * int idade = entrada.nextInt()
    */
  }
}
