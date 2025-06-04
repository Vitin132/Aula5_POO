

package Aula5_Ex3;

/**
 *
 * @author Aluno
 */
public class Gerente extends Funcionario{
    
    String departamento;
    
    
    public Gerente(String nome, String cargo, double salario, String departamento) {
        super(nome, cargo, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
    
}
