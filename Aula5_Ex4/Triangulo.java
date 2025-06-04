

package Aula5_Ex4;

/**
 *
 * @author Aluno
 */
public class Triangulo extends FormaGeometrica{
    
    double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
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
        return area = (base * altura)/2;
    }

}
