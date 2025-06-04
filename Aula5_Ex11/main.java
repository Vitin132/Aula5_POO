package Aula5_Ex11;

/**
 *
 * @author Aluno
 */
public class main {

    public static void main(String[] args) {

        Livro l = new Livro("titulo1", 50, "autor1", 12345);
        Eletronico e = new Eletronico("TV", 2350, 20);
        Roupa r = new Roupa("Camisa", 34.99, "G");

        System.out.println("Livro: ");
        System.out.println("Título: " + l.getNome());
        System.out.println("Preço: " + l.getPreco());
        System.out.println("Autor: " + l.getAutor());
        System.out.println("ISBN: " + l.getIsbn() + "\n");

        System.out.println("Eletrônico: ");
        System.out.println("Nome: " + e.getNome());
        System.out.println("Preço: " + e.getPreco());
        System.out.println("Voltagem: " + e.getVoltagem()+ "\n");
        
        System.out.println("Eletrônico: ");
        System.out.println("Tipo de roupa: " + r.getNome());
        System.out.println("Preço: " + r.getPreco());
        System.out.println("Tamanho: " + r.getTamanho());
        
        
        
    }
}
