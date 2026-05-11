package projetopessoas;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniv(){
        this.idade++;
        System.out.println(this.nome+" fez aniversario!!");
        System.out.println(this.idade);
    }
    
    public void statusPessoa(){
        if(this.sexo.equals("F")){
            this.setSexo("Feminino");
        } else if (this.sexo.equals("M")){
            this.setSexo("Masculino");
        }
        System.out.println(this.nome+this.idade+this.sexo);
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
