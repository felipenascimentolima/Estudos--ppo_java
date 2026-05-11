package projetopessoaheranca;

public class Bolsista extends Aluno {
    private String bolsa;
    
    public void RenovarBolsa(){
        System.out.println("bolsa de "+this.nome+"foi renovada");
    }

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public void PagarMensalidade(){
        System.out.println(this.nome+" e bolsita! Pagamento facilitado");
    }

    
    
    
       
}
