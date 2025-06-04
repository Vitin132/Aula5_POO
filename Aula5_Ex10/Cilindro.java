

package Aula5_Ex10;

/**
 *
 * @author Aluno
 */
public class Cilindro extends FigGeometrica{
    
    double raio, altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    @Override
    public double calcularVolume() {
        double volume;
        return volume = Math.PI * Math.pow(raio, 2) * altura;
    }

}
