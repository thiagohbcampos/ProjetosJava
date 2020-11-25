
package pagarboleto;

/**
 *
 * @author Thiago Henrique
 */
public class PagarBoleto {
   
    public static void main(String[] args) {
       double boletoValor;
       double valorMulta;
       double valorTotal;
       
       boletoValor = 450;
       valorMulta = boletoValor * 0.10;
       valorTotal = boletoValor + valorMulta;
       
       System.out.println("Valor do seu Boleto: " +boletoValor);
       System.out.println("Percentual da Multa: 10%");
       System.out.println("Total a pagar: " +valorTotal);
    }
    
}
