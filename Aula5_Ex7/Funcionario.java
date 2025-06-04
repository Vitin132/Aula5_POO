

package Aula5_Ex7;

/**
 *
 * @author Aluno
 */
public class Funcionario extends Pessoa{
    
    String cargo;
    
    
    public Funcionario(String nome, String endereco, int idade, String cargo) {
        super(nome, endereco, idade);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    

}
