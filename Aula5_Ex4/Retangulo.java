

package Aula5_Ex4;

/**
 *
 * @author Aluno
 */
public class Retangulo extends FormaGeometrica{
    
    double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    @Override
    public double calcularArea() {
        double area;
        return area = largura * altura;
        
        
    }

}
