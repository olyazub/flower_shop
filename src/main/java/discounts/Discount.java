package discounts;


import flower.Bouquet;
import flower.Order;

public class Discount extends Order {
    private Order order;

    public Discount(Order order) {
        this.order = order;
    }

    public double getPrice(){
        return order.getPrice();
    }

    public boolean process() {
        return order.process();
    }

    public Bouquet addFlowerBucket(Bouquet fb) {
        return order.addBucket(fb);
    }
}
