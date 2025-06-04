

package Aula5_Ex7;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Vitor", "Endereço1", 23, 1001234);
        Professor p = new Professor("Nome1", "Endereço2", 32, "Física");
        Funcionario f = new Funcionario("Nome2", "Endereço3", 40, "Vendedor");
        
        
        
        System.out.println("Aluno: ");
        System.out.println("Nome: "+a.getNome());
        System.out.println("Idade: "+a.getIdade());
        System.out.println("Endereço: "+a.getEndereco());
        System.out.println("Matrícula: "+a.getMatricula()+"\n");
        
        System.out.println("Professor: ");
        System.out.println("Nome: "+p.getNome());
        System.out.println("Idade: "+p.getIdade());
        System.out.println("Endereço: "+p.getEndereco());
        System.out.println("Disciplina: "+p.getDisciplina()+"\n");
        
        System.out.println("Aluno: ");
        System.out.println("Nome: "+f.getNome());
        System.out.println("Idade: "+f.getIdade());
        System.out.println("Endereço: "+f.getEndereco());
        System.out.println("Cargo: "+f.getCargo());
        
    }
}
