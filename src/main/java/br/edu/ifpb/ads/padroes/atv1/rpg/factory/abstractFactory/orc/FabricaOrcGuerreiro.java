package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.factoryMethod.FabricaPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class FabricaOrcGuerreiro implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem(String nome) {
        return new Personagem(
            nome,
            "Orc",
            "Guerreiro",
            20, 6, 8, 150, 20,
            criarArma(),
            criarArmadura(),
            new String[]{"Fúria", "Pancada Devastadora"}
        );
    }
    @Override
    public Arma criarArma() {
        return new Arma("Machado de Guerra", 30, "Machado");
    }
    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura Brutal", 25, "Pesada");
    }
} 