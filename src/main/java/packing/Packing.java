package packing;

import flower.Bouquet;
import flower.Order;

public class Packing extends Order {
    private Order order;

    public Packing(Order order) {
        this.order = order;
    }

    @Override
    public double getPrice() {
        return order.getPrice();
    }

    @Override
    public boolean process() {
        return super.process();
    }

    public Bouquet addBucket(Bouquet fb) {
        order.addBucket(fb);
        return fb;
    }
}
