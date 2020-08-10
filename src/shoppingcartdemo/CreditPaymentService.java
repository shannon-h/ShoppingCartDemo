/**
 * Filename: Cart.java
 * @author Shannon Han, User: theje
 */
package shoppingcartdemo;

public class CreditPaymentService extends PaymentService {

    @Override
    public void processAmount(double amount) {
        System.out.printf("Processing credit payment of $%.0f\n", amount);
    }
    
}
