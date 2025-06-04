

package Aula5_Ex12;

/**
 *
 * @author Aluno
 */
public class Boleto extends FormaPag{

    @Override
    public void processarPagamento(double valor) {
        
        System.out.println("Pagamento efetuado pelo boleto no valor de: "+valor+" reais.");
        
        
    }

}
