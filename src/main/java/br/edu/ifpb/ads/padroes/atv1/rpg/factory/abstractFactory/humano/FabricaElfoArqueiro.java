package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.factoryMethod.FabricaPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class FabricaElfoArqueiro implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem(String nome) {
        return new Personagem(
            nome,
            "Elfo",
            "Arqueiro",
            8, 16, 20, 90, 100,
            criarArma(),
            criarArmadura(),
            new String[]{"Tiro Múltiplo", "Camuflagem"}
        );
    }
    @Override
    public Arma criarArma() {
        return new Arma("Arco Longo Élfico", 28, "Arco");
    }
    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro Élfico", 14, "Média");
    }
} 