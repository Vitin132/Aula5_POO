

package Aula5_Ex10;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        
        Cubo cubo = new Cubo(5);
        Cilindro cilindro = new Cilindro(5, 10);
        Esfera esfera = new Esfera(10);
        
        
        System.out.println("Volume do Cubo: "+cubo.calcularVolume()+"\n");
        System.out.println("Volume do Cilindro: "+cilindro.calcularVolume()+"\n");
        System.out.println("Volume da Esfera: "+esfera.calcularVolume()+"\n");
        
        
        
    }
}
