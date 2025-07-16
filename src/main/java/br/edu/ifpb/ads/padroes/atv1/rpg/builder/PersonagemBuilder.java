package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class PersonagemBuilder {
    private String nome;
    private String raca;
    private String classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public PersonagemBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public PersonagemBuilder setRaca(String raca) {
        this.raca = raca;
        return this;
    }
    public PersonagemBuilder setClasse(String classe) {
        this.classe = classe;
        return this;
    }
    public PersonagemBuilder setForca(int forca) {
        this.forca = forca;
        return this;
    }
    public PersonagemBuilder setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
        return this;
    }
    public PersonagemBuilder setAgilidade(int agilidade) {
        this.agilidade = agilidade;
        return this;
    }
    public PersonagemBuilder setVida(int vida) {
        this.vida = vida;
        return this;
    }
    public PersonagemBuilder setMana(int mana) {
        this.mana = mana;
        return this;
    }
    public PersonagemBuilder setArma(Arma arma) {
        this.arma = arma;
        return this;
    }
    public PersonagemBuilder setArmadura(Armadura armadura) {
        this.armadura = armadura;
        return this;
    }
    public PersonagemBuilder setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
        return this;
    }
    public Personagem build() {
        return new Personagem(nome, raca, classe, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
} 