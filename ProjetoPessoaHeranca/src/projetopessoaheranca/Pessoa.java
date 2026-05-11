package projetopessoaheranca;

public abstract class Pessoa {
    protected String nome;
    protected String sexo;
    protected int idade;
    
    public final void  fazerAniver(){
        this.idade=this.idade+1;
    }
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
        if(this.sexo.equals("F")){
            this.sexo="Feminino";
        }   else if (this.sexo.equals("M")){
            this.sexo="Masculino";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Dados{" + "nome= " + nome + ", sexo= " + sexo + ", idade= " + idade + '}';
    }
    
    
}


