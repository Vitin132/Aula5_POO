

package Aula5_Ex11;

/**
 *
 * @author Aluno
 */
public class Eletronico extends Produto{
    
    int voltagem;
    
    
    public Eletronico(String nome, double preco, int voltagem) {
        super(nome, preco);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
    
    

}
