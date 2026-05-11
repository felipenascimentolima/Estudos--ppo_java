/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author User TS
 */
public class Caneta {
    public String modelo;
    public String cor;
    float ponta;
    protected int carga;
    private boolean tampada;
    void status() {
        System.out.println("o modelo e " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("sua ponta e: " + this.ponta);
        System.out.println("esta com " + this.carga + "% de carga");
       if (tampada == true){
           System.out.println("Esta tampada");
       } else{
           System.out.println("Esta destampada ");
       }
    }
    void rabiscar/*funcionario (ele realiza uma ação privada que o clinte pede publicamente)*/ () {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar");
        } else{
            System.out.println("Estou rabiscando");
        } 
    
    }
    public void tampar (){ 
    this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
}
