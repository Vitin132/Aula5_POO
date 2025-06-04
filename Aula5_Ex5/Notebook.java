

package Aula5_Ex5;

/**
 *
 * @author Aluno
 */
public class Notebook extends DispositivoEletronico{
    int capArmazenamento;
    
    
    public Notebook(String marca, String modelo, int capArmazenamento) {
        super(marca, modelo);
        this.capArmazenamento = capArmazenamento;
    }

    public int getCapArmazenamento() {
        return capArmazenamento;
    }

    public void setCapArmazenamento(int capArmazenamento) {
        this.capArmazenamento = capArmazenamento;
    }
    
    
}
