

package Aula5_Ex3;

/**
 *
 * @author Aluno
 */
public class Desenvolvedor extends Funcionario{
    
    String lingProgram;
    
    
    public Desenvolvedor(String nome, String cargo, double salario, String lingProgram) {
        super(nome, cargo, salario);
        this.lingProgram = lingProgram;
    }

    public String getLingProgram() {
        return lingProgram;
    }

    public void setLingProgram(String lingProgram) {
        this.lingProgram = lingProgram;
    }
    
    
    
}
