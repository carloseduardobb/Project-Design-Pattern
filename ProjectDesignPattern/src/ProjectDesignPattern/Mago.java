/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectDesignPattern;

/**
 *
 * @author Carlos Eduardo
 */
public class Mago implements RacaSelecionada {
    @Override
    public void classe(){
        System.out.println("Classe selecionada: Mago");
    }

    @Override
    public void vidaBase() {
        System.out.println("Vida Base: 90");
    }

    @Override
    public void manaVase() {
        System.out.println("Mana BaSE: 200");
    }

    @Override
    public void velocidadeBase() {
        System.out.println("Velocidade de Movimento Base: 325");
    }
}
