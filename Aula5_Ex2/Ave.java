

package Aula5_Ex2;

/**
 *
 * @author Aluno
 */
public class Ave extends Animal{
    
    String envergaduraAsas;
    

    public Ave(String nome, int idade, String envergaduraAsas) {
        super(nome, idade);
        this.envergaduraAsas = envergaduraAsas;
    }

    public String getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(String envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }
    
    
    
    
}
