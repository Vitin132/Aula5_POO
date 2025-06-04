

package Aula5_Ex3;

/**
 *
 * @author Aluno
 */
public class Vendedor extends Funcionario{
    
    double comissao;
    
    
    public Vendedor(String nome, String cargo, double salario, double comissao) {
        super(nome, cargo, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
    
}
