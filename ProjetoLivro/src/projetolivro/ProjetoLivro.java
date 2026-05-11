package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa p1= new Pessoa("Alfredo",21,"M");
        Livro it=new Livro("It a Coisa", "Stephen King",3500,1,true, p1);
        it.avancarPag();
        it.avancarPag();
        it.avancarPag();
        it.detalhes();
    }
    
} 
