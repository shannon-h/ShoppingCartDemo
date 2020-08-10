/**
 * Filename: ShoppingCartDemo.java
 * @author Shannon Han, User: theje
 */
package shoppingcartdemo;

import java.io.File;

public class ShoppingCartDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //gets the absolute 
        File file = new File("ShoppingCartDemo.java");
        String absolutePath = file.getAbsolutePath();
        
        System.out.println(absolutePath);
        
        //creates the paymentservice instances
        PaymentServiceFactory factory = PaymentServiceFactory.getInstance();
        PaymentService creditService = factory.getPaymentService(PaymentServiceType.CREDIT);
        PaymentService debitService = factory.getPaymentService(PaymentServiceType.DEBIT);
        
        //creates the cart and adds products
        Cart cart = new Cart();
        cart.addProduct(new Product("shirt", 50));
        cart.addProduct(new Product("pants", 60));
        
        //set debit service and pay
        cart.setPaymentService(creditService);
        cart.payCart();
        
        //set debit service and pay
        cart.setPaymentService(debitService);
        cart.payCart();
    }
    
}
