package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.factoryMethod.FabricaPersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public class FabricaOrcMago implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem(String nome) {
        return new Personagem(
            nome,
            "Orc",
            "Mago",
            10, 14, 6, 100, 120,
            criarArma(),
            criarArmadura(),
            new String[]{"Magia Sombria", "Invocação"}
        );
    }
    @Override
    public Arma criarArma() {
        return new Arma("Cajado Tribal", 12, "Cajado");
    }
    @Override
    public Armadura criarArmadura() {
        return new Armadura("Vestes Xamânicas", 6, "Leve");
    }
} 