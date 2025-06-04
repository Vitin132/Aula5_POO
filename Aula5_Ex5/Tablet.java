

package Aula5_Ex5;

/**
 *
 * @author Aluno
 */
public class Tablet extends DispositivoEletronico{
    int tamTela;
    
    
    public Tablet(String marca, String modelo, int tamTela) {
        super(marca, modelo);
        this.tamTela = tamTela;
    }

    public int getTamTela() {
        return tamTela;
    }

    public void setTamTela(int tamTela) {
        this.tamTela = tamTela;
    }
    
    

}
