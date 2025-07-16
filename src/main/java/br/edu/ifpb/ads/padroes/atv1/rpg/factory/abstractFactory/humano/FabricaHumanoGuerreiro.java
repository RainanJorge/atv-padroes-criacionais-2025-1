package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.factoryMethod.FabricaPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class FabricaHumanoGuerreiro implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem(String nome) {
        return new Personagem(
            nome,
            "Humano",
            "Guerreiro",
            15, 8, 10, 120, 30,
            criarArma(),
            criarArmadura(),
            new String[]{"Investida", "Bloqueio"}
        );
    }
    @Override
    public Arma criarArma() {
        return new Arma("Espada de Ferro", 25, "Espada");
    }
    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Placas", 20, "Pesada");
    }
} 