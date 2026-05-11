/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luta;

/**
 *
 * @author User TS
 */
public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

//--------------------------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }
//--------------------------------------------------------------------------------------

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nac) {
        this.nacionalidade = nac;
    }
//--------------------------------------------------------------------------------------

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }
//--------------------------------------------------------------------------------------

    public float getAltura() {
        return altura;
    }

    public void setAltura(float alt) {
        this.altura = alt;
    }
//--------------------------------------------------------------------------------------

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }
//--------------------------------------------------------------------------------------

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Categoria Inválida";
        } else if (this.peso <= 70.3) {
            this.categoria = "Peso-Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Peso-Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Peso-Pesado";
        }
    }
//--------------------------------------------------------------------------------------

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vit) {
        this.vitorias = vit;
    }
//--------------------------------------------------------------------------------------

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int der) {
        this.derrotas = der;
    }
//--------------------------------------------------------------------------------------

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int emp) {
        this.empates = emp;
    }

    //--------------------------------------------------------------------------------------
    public void apresentar() {
        System.out.println("----------------  ---------------  ----------  -------------------------");
        System.out.println("Boa noite galera!!!!!!!!!!!!!");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void status() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println(this.getNome());
        System.out.println("E um peso " + this.getCategoria());
        System.out.println(this.categoria);
        System.out.println(this.getPeso()+" Kg");
        System.out.println(this.getVitorias() + " Vitoria(s)");
        System.out.println(this.getDerrotas() + " Derrota(s)");
        System.out.println(this.getEmpates() + " Empate(s)");
    }

    public void ganharLuta() {
        
        this.setVitorias(this.getVitorias() + 1);
        
    }

    public void perderLuta() {
        System.out.println(this.getNome()+" perdeu a luta");
        this.setDerrotas(this.getDerrotas() +1);
    }

    public void empatarLuta() {
        
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String no, String nac, int id, float alt, float pe, int vit, int der, int emp) {
        this.nome = no;
        this.nacionalidade = nac;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pe);
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
    }

}
