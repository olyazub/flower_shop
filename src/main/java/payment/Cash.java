package payment;

public class Cash implements Payment {
    public boolean process(double price){
        System.out.printf("Paid %.2f with cash", price);
        return true;
    }
}