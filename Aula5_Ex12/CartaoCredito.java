

package Aula5_Ex12;

/**
 *
 * @author Aluno
 */
public class CartaoCredito extends FormaPag{
    
    
    
    
    
    @Override
    public void processarPagamento(double valor) {
        
        System.out.println("Cartão aceito. Pagamento no valor de: "+valor+" efetuado com sucesso.");
        
    }

}
