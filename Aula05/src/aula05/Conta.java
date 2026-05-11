/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author User TS
 */
public class Conta {

    int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    public Conta(int saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }

    public int getnumConta() {
        return this.numConta;
    }

    public void setnumConta(int nc) {
        this.numConta = nc;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tp) {
        this.tipo = tp;

    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dn) {
        this.dono = dn;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int sld) {
        this.saldo = sld;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

    public void abrirConta(String tp) {
        setTipo(tp);
        setStatus(true);
        System.out.println("A CONTA ESTA ABERTA");
        if (tp.equals("cc") || tp.equals("CC")) {
            setSaldo(50);
            setTipo("conta corrente");
        } else if (tp.equals("cp") || tp.equals("CP")) {
            setSaldo(150);
            setTipo("conta poupanca");
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("ERROR (Conta com dinheiro)");
        } else if (this.saldo < 0) {
            System.out.println("ERROR (Conta em debito)");
        } else {
            this.setStatus(false);
            System.out.println("CONTA FECHADA");
        }
    }

    public void depositar(int v) {
        if (this.status = true) {
            this.saldo = v + this.saldo;
            System.out.println("adicionado +" + v + " na conta");
            System.out.println("saldo atual " + saldo);
        } else {
            System.out.println("ERRO (Impossivel depositar)");
        }
    }

    public void sacar(int v) {
        if (this.status) {
            if (this.saldo >= v) {
                this.saldo = v - this.saldo;
                System.out.println("retirado -" + v + " da conta");
                System.out.println("saldo atual " + saldo);
            } else {
                System.out.println("ERROR (saldo insufuciente)");
            }
        } else {
            System.out.println("ERROR (Conta inativa)");
        }
    }

    public void pagarMensal() {
        int dindin = 0;
        if (this.getTipo()=="Conta corrente" || this.getTipo()=="conta corrente") {
            dindin = 12;
        } else if (this.getTipo()=="Conta poupanca"|| this.getTipo()=="conta poupanca") {
            dindin = 20;
        }
        if (this.getStatus()){
                this.setSaldo(this.getSaldo()-dindin);
                System.out.println("Mensalidade paga por" + this.getDono());
        } else {
            System.out.println("ERROR (Conta fechada)");
        }
    }

    public void imprimeTudo() {
        System.out.println(saldo);
        System.out.println(tipo);
        System.out.println(numConta);
        System.out.println(dono);
    }

}
