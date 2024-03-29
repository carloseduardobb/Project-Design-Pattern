/*
 * To change this license header, choose License Headers in Jogo Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectDesignPattern;

/**
 *
 * @author Carlos Eduardo
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Personagem personagem = Personagem.getPersonagem();
        
        Raca mago = new Mago();
        Raca guerreiro = new Guerreiro();
        
        personagem.classe();
        personagem.Atributos();
        personagem.setClasse(mago);
        personagem.classe();
        personagem.Atributos();
        personagem.setClasse(guerreiro);
        personagem.classe();
        personagem.Atributos();
        personagem.setClasse(new Arqueiro());
        personagem.classe();
        personagem.Atributos();
        
        System.out.println("\nAções\n");
        personagem.mover();
        personagem.entrarTerrenoRuim();
        personagem.atacar();
        personagem.consumirPowerUp();
        personagem.atacar();
        personagem.mover();
        personagem.entrarTerrenoNormal();
        personagem.atacar();
    }
    
}
