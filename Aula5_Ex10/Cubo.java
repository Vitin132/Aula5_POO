

package Aula5_Ex10;

/**
 *
 * @author Aluno
 */
public class Cubo extends FigGeometrica{
    
    double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    
    
    
    @Override
    public double calcularVolume() {
        double volume;
        return volume = Math.pow(aresta, 3) ;
    }

}
