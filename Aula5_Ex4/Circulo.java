

package Aula5_Ex4;

/**
 *
 * @author Aluno
 */
public class Circulo extends FormaGeometrica{

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    
    
    @Override
    public double calcularArea() {
        double area;
        return area = Math.PI * (raio * raio);
    }

}
