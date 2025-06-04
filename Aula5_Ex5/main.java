

package Aula5_Ex5;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        
        Notebook n = new Notebook("marca1", "modelo1", 12);
        Smartphone s = new Smartphone("marca2", "modelo2", 20);
        Tablet t = new Tablet("marca3", "modelo3", 500);
        
        System.out.println("Notebook: ");
        System.out.println("Marca: "+n.getMarca());
        System.out.println("Modelo: "+n.getModelo());
        System.out.println("Armazenamento: "+n.getCapArmazenamento()+"\n");
        
        System.out.println("Smartphone: ");
        System.out.println("Marca: "+s.getMarca());
        System.out.println("Modelo: "+s.getModelo());
        System.out.println("Tamanho da tela: "+s.getTamTela()+"\n");
        
        System.out.println("Tablet: ");
        System.out.println("Marca: "+t.getMarca());
        System.out.println("Modelo: "+t.getModelo());
        System.out.println("Armazenamento: "+t.getTamTela());
        
        
        
        
    }
    
}
