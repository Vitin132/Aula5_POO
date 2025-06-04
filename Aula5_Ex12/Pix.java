

package Aula5_Ex12;

/**
 *
 * @author Aluno
 */
public class Pix extends FormaPag{

    @Override
    public void processarPagamento(double valor) {
        
        System.out.println("Pagamento efetuado com sucesso pelo pix. Valor transferido: "+valor+" reais.");
        
        
    }

}
