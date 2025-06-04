

package Aula5_Ex8;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        
        JogoCartas c = new JogoCartas();
        JogoTabuleiro t = new JogoTabuleiro();
        JogoVideogame g = new JogoVideogame();
        
        System.out.println("Cartas: ");
        c.jogar();
        System.out.println("");
        System.out.println("Tabuleiro: ");
        t.jogar();
        System.out.println("");
        System.out.println("Videogame: ");
        g.jogar();
        
        
        
        
    }
}
