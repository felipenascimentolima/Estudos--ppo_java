package projetopessoaheranca;

public class ProjetoPessoaHeranca {
    public static void main(String[] args) {
        
        
        Aluno p1=new Aluno();
        Bolsista p2=new Bolsista();
        Visitante p3=new Visitante();
        
        
        p1.setNome("Felipe");
        p1.setIdade(23);
        p1.setSexo("M");
        
        p2.setNome("Liz");
        p2.setIdade(17);
        p2.setSexo("F");
        
        p3.setNome("Lucas");
        p3.setIdade(15);
        p3.setSexo("M");
        
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        p1.PagarMensalidade();
        
         
    }
    
}
