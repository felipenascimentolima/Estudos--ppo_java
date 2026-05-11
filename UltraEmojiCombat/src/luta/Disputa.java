package luta;

import java.util.Random;

public class Disputa {
    // Atributos

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Métodos Públicos

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada == true) {
            System.out.println("#### Desafiado ####");
            this.desafiado.apresentar();
            System.out.println("#### Desafiante ####");
            this.desafiante.apresentar();
            Random aleartorio = new Random();
            int vencedor = aleartorio.nextInt(3);
            switch (vencedor) {
                case 0: //Empate
                    System.out.println("---------------------------------------------------------------");
                    System.out.println(this.desafiado.getNome()+" e "+ this.desafiante.getNome()+ " EMPATARAM !!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado Ganhou
                    System.out.println("---------------------------------------------------------------");
                    System.out.println(this.desafiado.getNome() + " GANHOU !!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println(this.desafiante.getNome() + " GANHOU !!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("A luta nao vai acontecer !!!!!!!!");
        }
    }
    //Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
