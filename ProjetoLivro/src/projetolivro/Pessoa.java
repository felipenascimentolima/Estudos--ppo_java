package projetolivro;

public class Pessoa {
        private String nome;
        private int idade;
        private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sex) {
        this.sexo = sex;
        if (this.sexo.equals("M")||this.sexo.equals("m")){
            this.setSexo("Masculino");
        }       else if(this.sexo.equals("F")||this.sexo.equals("f")){
                    this.setSexo("Feminino");
            }
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
        
    //=====================================================================
    
        public void fazerAniver(){
            this.idade++;
        }
        
     //=====================================================================
        
        
}
