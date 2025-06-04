

package Aula5_Ex2;

/**
 *
 * @author Aluno
 */
public class Mamifero extends Animal{

    String tipoPelo;
    
    
    public Mamifero(String nome, int idade, String tipoPelo) {
        super(nome, idade);
        this.tipoPelo = tipoPelo;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }
    
    
    
    
}
