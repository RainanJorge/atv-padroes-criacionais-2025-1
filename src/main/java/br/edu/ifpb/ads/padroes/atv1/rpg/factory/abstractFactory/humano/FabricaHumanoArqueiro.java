package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.humano;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.factoryMethod.FabricaPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class FabricaHumanoArqueiro implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem(String nome) {
        return new Personagem(
            nome,
            "Humano",
            "Arqueiro",
            10, 12, 16, 100, 70,
            criarArma(),
            criarArmadura(),
            new String[]{"Tiro Certeiro", "Chuva de Flechas"}
        );
    }
    @Override
    public Arma criarArma() {
        return new Arma("Arco Élfico", 20, "Arco");
    }
    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Couro", 12, "Média");
    }
} 