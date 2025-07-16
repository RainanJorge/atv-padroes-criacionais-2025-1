package br.edu.ifpb.ads.padroes.atv1.rpg.factory.factoryMethod;

import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
 
public interface FabricaPersonagem {
    Personagem criarPersonagem(String nome);
    Arma criarArma();
    Armadura criarArmadura();
} 