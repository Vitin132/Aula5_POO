

package Aula5_Ex10;

/**
 *
 * @author Aluno
 */
public class Esfera extends FigGeometrica{
    
    double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    
    
    @Override
    public double calcularVolume() {
        
        double volume;
        return volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
        
    }

}
