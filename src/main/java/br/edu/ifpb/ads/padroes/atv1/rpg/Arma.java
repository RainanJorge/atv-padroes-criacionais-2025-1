package br.edu.ifpb.ads.padroes.atv1.rpg;

public class Arma implements Cloneable {

    private String nome;
    private int dano;
    private String tipo;

    public Arma(String nome, int dano, String tipo) {
        this.nome = nome;
        this.dano = dano;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public Arma clone() {
        try {
            return (Arma) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class Builder {
        private String nome;
        private int dano;
        private String tipo;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder dano(int dano) {
            this.dano = dano;
            return this;
        }

        public Builder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public Arma build() {
            return new Arma(nome, dano, tipo);
        }
    }
}
