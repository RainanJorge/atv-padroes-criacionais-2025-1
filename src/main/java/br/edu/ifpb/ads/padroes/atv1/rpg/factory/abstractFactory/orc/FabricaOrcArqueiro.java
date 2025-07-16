package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.factoryMethod.FabricaPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class FabricaOrcArqueiro implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem(String nome) {
        return new Personagem(
            nome,
            "Orc",
            "Arqueiro",
            14, 8, 12, 120, 40,
            criarArma(),
            criarArmadura(),
            new String[]{"Tiro Brutal", "Intimidação"}
        );
    }
    @Override
    public Arma criarArma() {
        return new Arma("Arco de Osso", 24, "Arco");
    }
    @Override
    public Armadura criarArmadura() {
        return new Armadura("Couro de Besta", 16, "Média");
    }
} 