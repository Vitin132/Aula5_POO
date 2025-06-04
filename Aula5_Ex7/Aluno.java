

package Aula5_Ex7;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa{
    
    int matricula;
    
    
    public Aluno(String nome, String endereco, int idade, int matricula) {
        super(nome, endereco, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    

}
