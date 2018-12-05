package flower;

import delivery.DeliveryWay;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import payment.Payment;

import java.util.ArrayList;

@ToString
public class Order {
    public ArrayList<Bouquet> items;
    @Setter @Getter
    public Payment payment;
    @Setter @Getter
    private DeliveryWay delivery;

    public double price;

    public Order() {
        items = new ArrayList<Bouquet>();
        price = 0.0;
    }

    public boolean process() {
        if (payment != null) {
            payment.process(this.getPrice());
        }
        else {
            System.out.println("Please choose a payment method and proceed");
            return false;
        }
        return true;
    }

    public double getPrice() {
        return this.price;
    }

    public Bouquet addBucket(Bouquet fb) {
        items.add(fb);
        price = price + fb.getPrice();
        return fb;
    }
}
