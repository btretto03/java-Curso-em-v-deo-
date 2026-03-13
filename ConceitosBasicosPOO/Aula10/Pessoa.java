package ConceitosBasicosPOO.Aula10;

public abstract class Pessoa {  //Classe abstrata, não pode ser instanciada(não posso criar uma pessoa na main)
    
    private String nome;
    private int idade;
    private String sexo;   

    public void fazerAniversario(){
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
