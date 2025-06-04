

package Aula5_Ex7;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa{
    
    String disciplina;
    
    public Professor(String nome, String endereco, int idade, String disciplina) {
        super(nome, endereco, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    
    
    
}
