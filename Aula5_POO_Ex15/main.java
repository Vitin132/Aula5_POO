

package Aula5_POO_Ex15;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        
        
        Musica minhaMusica = new Musica("Bohemian Rhapsody", 660, "Queen", "Bohemian Rhapsody");
        Filme meuFilme = new Filme ("Meu malvado favorito", 148, "Diretor do filme", "Animação");
        Jogo meuJogo = new Jogo("Castlevania SOTN", 660, "Multiplataforma", 14);
        
        
        System.out.println("Música: "+minhaMusica.getTitulo()+"\nArtista: "+minhaMusica.getArtista());
        System.out.println("Duração: "+minhaMusica.getDuracao());
        System.out.println("Álbum: "+minhaMusica.getAlbum()+"\n");
        
        System.out.println("Filme: "+meuFilme.getTitulo()+"\nDiretor: "+meuFilme.getDiretor());
        System.out.println("Duração: "+meuFilme.getDuracao());
        System.out.println("Tipo: "+meuFilme.getGenero()+"\n");
        
        System.out.println("Jogo: "+meuJogo.getTitulo()+"\nDuração: "+meuJogo.getDuracao());
        System.out.println("Plataforma: "+meuJogo.getPlataforma());
        System.out.println("Classificação: "+meuJogo.getClassificacao());
        
        
    }
}
