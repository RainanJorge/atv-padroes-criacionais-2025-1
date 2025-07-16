package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.elfo;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.factoryMethod.FabricaPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class FabricaElfoMago implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem(String nome) {
        return new Personagem(
            nome,
            "Elfo",
            "Mago",
            4, 20, 14, 70, 180,
            criarArma(),
            criarArmadura(),
            new String[]{"Magia da Natureza", "Teleporte"}
        );
    }
    @Override
    public Arma criarArma() {
        return new Arma("Cajado da Natureza", 18, "Cajado");
    }
    @Override
    public Armadura criarArmadura() {
        return new Armadura("Mantos Élficos", 10, "Leve");
    }
} 