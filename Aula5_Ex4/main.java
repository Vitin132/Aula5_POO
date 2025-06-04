

package Aula5_Ex4;

/**
 *
 * @author Aluno
 */
public class main {
    
    public static void main(String[] args) {
        
        Circulo c = new Circulo(10);
        Retangulo r = new Retangulo(10, 20);
        Triangulo t = new Triangulo(5,15);
        
        System.out.println("Círculo: ");
        System.out.println("Área do Círculo: "+c.calcularArea());
        System.out.println("Retângulo: ");
        System.out.println("Área do Retângulo: "+r.calcularArea());
        System.out.println("Triângulo: ");
        System.out.println("Área do Triângulo: "+t.calcularArea());
        
        
        
    }
    
    
}
