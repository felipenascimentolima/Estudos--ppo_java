package projetopessoas;

public class ProjetoPessoas { 

    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p0 = new Pessoa();
        Aluno p1 = new Aluno();
        Professor p2=new Professor();
        Funcionario p3=new Funcionario();
        
        p0.setNome("Alfredo");
        p0.setSexo("Masculino");
        p0.setIdade(56);
        p0.fazerAniv();
        
        p1.setNome("Felipe");
        p1.setSexo("Masculino");
        p1.setIdade(22);
        p1.setCurso("Biologia");
        p1.setMatr(12345);
        
        
        p2.setNome("Julia");
        p2.setSexo("Feminino");
        p2.setIdade(35);
        p2.setEspecialidade("Biologia");
        p2.setSalario(2145);
        
        
        p3.setNome("Joao");
        p3.setSexo("Feminino");
        p3.setIdade(22);
        p3.setTrabalhando(true);
        p3.setSetor("Faxineiro");
        p3.mudarTrabalho("Porteiro");
        p3.getSetor();
        p3.isTrabalhando();
        p3.isTrabalhando();
        
        p1.cancelarMatr();
        p2.receberAum(100);
        p3.mudarTrabalho("");
        p3.setTrabalhando(false);
        
    }
    
}
