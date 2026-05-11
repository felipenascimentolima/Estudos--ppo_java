package projetolivro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //=====================================================================

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tit) {
        this.titulo = tit;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String aut) {
        this.autor = aut;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPag) {
        this.totPaginas = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAt) {
        this.pagAtual = pagAt;
    }

    public boolean isAberto() {
        return aberto;
    }
    
    public String getAbertoTexto(){
        return aberto? "Sim":"Não";
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
        
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
        
    }
    
    //=====================================================================

    public Livro(String tit, String aut, int totPag, int pagAt, boolean aberto, Pessoa lei) {
        this.titulo = tit;
        this.autor = aut;
        this.totPaginas = totPag;
        this.pagAtual = pagAt;
        this.aberto = aberto;
        this.leitor=lei;
        
    }
    
  //======================================================================
    
    public void detalhes(){
        System.out.println("O nome do livro e " + this.titulo);
        System.out.println("O autor e "+ this.autor);
        System.out.println("Esse livro tem "+ this.totPaginas+ " paginas");
        System.out.println("Qual pagina esta "+ this.pagAtual);
        System.out.println("Esta aberto? "+ getAbertoTexto());
        System.out.println(this.leitor.getNome()+" esta lendo agora");
        
    }

    @Override
    public void abrir() {
        this.aberto=true;
    }

    @Override
    public void fechar() {
        this.aberto=false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual=p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
}
