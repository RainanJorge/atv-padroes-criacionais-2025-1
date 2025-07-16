package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.elfo;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.factoryMethod.FabricaPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class FabricaElfoGuerreiro implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem(String nome) {
        return new Personagem(
            nome,
            "Elfo",
            "Guerreiro",
            12, 14, 16, 100, 60,
            criarArma(),
            criarArmadura(),
            new String[]{"Dança das Lâminas", "Agilidade Élfica"}
        );
    }
    @Override
    public Arma criarArma() {
        return new Arma("Lâmina Élfica", 22, "Espada");
    }
    @Override
    public Armadura criarArmadura() {
        return new Armadura("Cota de Malha Élfica", 15, "Média");
    }
} 