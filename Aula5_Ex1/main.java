package Aula5_Ex1;

/**
 *
 * @author Aluno
 */
public class main {

    public static void main(String[] args) {
        Carro c = new Carro("Fiat", "Uno", 2004, 4);
        Moto m = new Moto("Honda", "modelo1", 2005, 200);
        Caminhao caminhao = new Caminhao("Marca", "Modelo", 2010, 2000);
        
        
        System.out.println("Carro: ");
        System.out.println("Marca:"+c.getMarca()+"\nModelo: "+c.getModelo()+"\nAno: "+c.getAno()+"\nNúmero de Portas: "+c.getNumPortas());
        
        
        System.out.println("\nMoto: ");
        System.out.println("Marca: "+m.getMarca()+"\nModelo: "+m.getModelo()+"\nAno: "+m.getAno()+"\nCilindradas: "+m.getCilindradas());
        
        System.out.println("\nCaminhão: ");
        System.out.println("Marca: "+caminhao.getMarca()+"\nModelo: "+caminhao.getModelo()+"\nAno: "+caminhao.getAno()+"\nCilindradas: "+caminhao.getCapCargas());

    }

}
