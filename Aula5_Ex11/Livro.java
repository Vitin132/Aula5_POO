

package Aula5_Ex11;

/**
 *
 * @author Aluno
 */
public class Livro extends Produto{
    String autor;
    int isbn;
    
    
    public Livro(String nome, double preco, String autor, int isbn) {
        super(nome, preco);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    

}
