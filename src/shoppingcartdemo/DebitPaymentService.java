/**
 * Filename: DebitPaymentService.java
 * @author Shannon Han, User: theje
 */
package shoppingcartdemo;

public class DebitPaymentService extends PaymentService {

    @Override
    public void processAmount(double amount) {
        System.out.printf("Processing debit payment of $%.0f\n", amount);
    }
    
}
