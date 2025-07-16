package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.factoryMethod.FabricaPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class FabricaHumanoMago implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem(String nome) {
        return new Personagem(
            nome,
            "Humano",
            "Mago",
            6, 18, 8, 80, 150,
            criarArma(),
            criarArmadura(),
            new String[]{"Bola de Fogo", "Cura"}
        );
    }
    @Override
    public Arma criarArma() {
        return new Arma("Cajado Mágico", 15, "Cajado");
    }
    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Mágicas", 8, "Leve");
    }
} 