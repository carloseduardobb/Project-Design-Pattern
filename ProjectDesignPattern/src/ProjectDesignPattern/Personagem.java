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
public class Personagem {

    private Raca raca;
    private static Personagem personagem;
    private State estadoAtual;

    private Personagem() {
        estadoAtual = new StandartState();
        raca = new Humano();
    }

    public void setClasse(Raca novaRaca) {
        this.raca = novaRaca;
    }

    public Raca getRaca() {
        return raca;
    }

    public static Personagem getPersonagem() {
        if (personagem == null) {
            personagem = new Personagem();
        }
        return personagem;
    }

    public void classe() {
        raca.classe();
    }

    private void setNewState(State novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void entrarTerrenoRuim() {
        System.out.println("Entrando no Terreno Ruim");
        setNewState(new CriticalState());
    }

    public void entrarTerrenoNormal() {
        System.out.println("Entrando no Terreno Bom");
        setNewState(new StandartState());
    }
    
    public void consumirPowerUp(){
        
        System.out.println("Consumindo PowerUp");
        setNewState(new GodState());
    }

    public void mover() {
        estadoAtual.mover(raca.velocidaDeMovimentoBase());
    }

    public void atacar() {
        estadoAtual.atacar(raca.velocidadeDeAtaque());
    }

    public void Atributos() {
        System.out.println("Vida base:" +getRaca().vidaBase());
        System.out.println("Mana base:" +getRaca().manaBase());
        System.out.println("Velocidade de ataque base:" +getRaca().velocidadeDeAtaque());
        System.out.println("Veocidade de movimento base:" +getRaca().velocidaDeMovimentoBase());
    }

}
