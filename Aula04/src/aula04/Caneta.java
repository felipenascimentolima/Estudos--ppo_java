/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author User TS
 */
public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampa;
    private String cor;

    public Caneta(String modelo, float ponta, boolean tampa, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampa = tampa;
        this.cor = cor;
    }
    public void status(){
        System.out.println(this.modelo);
        System.out.println(this.ponta);
        System.out.println(this.tampa);
        System.out.println(this.cor);
        
    }
    
}
