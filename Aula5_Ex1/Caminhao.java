

package Aula5_Ex1;

/**
 *
 * @author Aluno
 */
public class Caminhao extends Veiculo{
    
    
    double capCargas;

    public Caminhao(String marca, String modelo, int ano,double capCargas) {
        super(marca, modelo, ano);
        this.capCargas = capCargas;
    }

    public double getCapCargas() {
        return capCargas;
    }

    public void setCapCargas(double capCargas) {
        this.capCargas = capCargas;
    }
    
    
    
    
}
