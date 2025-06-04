

package Aula5_Ex2;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero("Cachorro", 10, "Marrom");
        Ave a = new Ave("Pardal", 2, "20cm");
        Reptil r = new Reptil("Dragão de Comodo", 5, "Escamas blindadas de Osteodermos");
        
        
        System.out.println("Mamifero: ");
        System.out.println("Nome: "+m.getNome());
        System.out.println("Idade: "+m.getIdade());
        System.out.println("Tipo de pelo: "+m.getTipoPelo()+"\n");
        
        System.out.println("Ave: ");
        System.out.println("Nome: "+a.getNome());
        System.out.println("Idade: "+a.getIdade());
        System.out.println("Envergadura das Asas: "+a.getEnvergaduraAsas()+"\n");
        
        System.out.println("Reptil:");
        System.out.println("Nome: "+r.getNome());
        System.out.println("Idade: "+r.getIdade());
        System.out.println("Tipo das Escamas: "+r.getTipoEscama());
        
        
        
    }
}
