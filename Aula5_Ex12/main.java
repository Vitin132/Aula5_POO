package Aula5_Ex12;

/**
 *
 * @author Aluno
 */
public class main {

    public static void main(String[] args) {

        Pix p = new Pix();
        CartaoCredito cartao = new CartaoCredito();
        Boleto b = new Boleto();
        
        double valor1 = 500;
        double valor2 = 1500;
        double valor3 = 2000;
        
        System.out.println("Pix: ");
        p.processarPagamento(valor1);
        System.out.println("");
        System.out.println("Cartao: ");
        cartao.processarPagamento(valor3);
        System.out.println("");
        System.out.println("Boleto: ");
        b.processarPagamento(valor2);
        

    }
}
