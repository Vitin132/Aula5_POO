

package Aula5_Ex11;

/**
 *
 * @author Aluno
 */
public class Roupa extends Produto{
    
    String tamanho;
    
    
    public Roupa(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

        
    
}
