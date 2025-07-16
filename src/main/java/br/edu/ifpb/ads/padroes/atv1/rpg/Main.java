package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.config.ConfiguracaoJogo;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.elfo.FabricaElfoMago;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractFactory.orc.FabricaOrcGuerreiro;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.factoryMethod.FabricaPersonagem;

public class Main {
    public static void main(String[] args) {
        //Builder
        Personagem mago = new PersonagemBuilder()
            .setNome("Merlin")
            .setRaca("Humano")
            .setClasse("Mago")
            .setForca(6)
            .setInteligencia(18)
            .setAgilidade(8)
            .setVida(80)
            .setMana(150)
            .setArma(new Arma("Cajado Mágico", 15, "Cajado"))
            .setArmadura(new Armadura("Vestes Mágicas", 8, "Leve"))
            .setHabilidades(new String[]{"Bola de Fogo", "Cura"})
            .build();
        System.out.println("Personagem criado com Builder: " + mago);

        //Singleton
        ConfiguracaoJogo config = ConfiguracaoJogo.getInstancia();
        config.setNivelDificuldade(2);
        System.out.println("Dificuldade do jogo: " + config.getNivelDificuldade());

        //Prototype
        Personagem magoClone = mago.clone();
        magoClone.setNome("Morgana");
        System.out.println("Clone do mago: " + magoClone);

        //Factory
        FabricaPersonagem fabricaElfoMago = new FabricaElfoMago();
        Personagem elfoMago = fabricaElfoMago.criarPersonagem("Legolas");
        System.out.println("Personagem criado com Factory: " + elfoMago);

        FabricaPersonagem fabricaOrcGuerreiro = new FabricaOrcGuerreiro();
        Personagem orcGuerreiro = fabricaOrcGuerreiro.criarPersonagem("Grommash");
        System.out.println("Personagem criado com Factory: " + orcGuerreiro);
    }
} 