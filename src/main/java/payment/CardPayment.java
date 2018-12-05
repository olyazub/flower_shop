package payment;

public class CardPayment implements Payment{
    public boolean process(double price){
        System.out.printf("Paid %.2f with a credit card", price);
        return true;
    }
}
