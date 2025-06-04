

package Aula5_Ex2;

/**
 *
 * @author Aluno
 */
public class Reptil extends Animal{

    String tipoEscama;
    
    
    
    public Reptil(String nome, int idade, String tipoEscamas) {
        super(nome, idade);
        this.tipoEscama = tipoEscama;
    }

    public String getTipoEscama() {
        return tipoEscama;
    }

    public void setTipoEscama(String tipoEscama) {
        this.tipoEscama = tipoEscama;
    }

    
    
    
}
