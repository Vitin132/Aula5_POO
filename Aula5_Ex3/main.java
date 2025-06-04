

package Aula5_Ex3;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        
        Gerente g = new Gerente("Nome1", "Gerente", 2500, "Finanças");
        
        Vendedor v = new Vendedor("Nome2", "Vendedor", 1500, 50);
        
        Desenvolvedor d = new Desenvolvedor("Nome3", "Desenvolvedor de Sofware", 3000, "Java e Python");
        
        System.out.println("Gerente: ");
        System.out.println("Nome: "+g.getNome());
        System.out.println("Cargo: "+g.getCargo());
        System.out.println("Salário: "+g.getSalario());
        System.out.println("Departamento: "+g.getDepartamento()+"\n");
        
        System.out.println("Vendedor: ");
        System.out.println("Nome: "+v.getNome());
        System.out.println("Cargo: "+v.getCargo());
        System.out.println("Salário: "+v.getSalario());
        System.out.println("Comissao: "+v.getComissao()+"\n");
        
        System.out.println("Dev: ");
        System.out.println("Nome: "+d.getNome());
        System.out.println("Cargo: "+d.getCargo());
        System.out.println("Salário: "+d.getSalario());
        System.out.println("Linguagem de Programação: "+d.getLingProgram());
        
        
    }
}
