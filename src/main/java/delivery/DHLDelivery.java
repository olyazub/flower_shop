package delivery;

import flower.Order;

public class DHLDelivery implements DeliveryWay {
    public boolean process(Order order) {
        System.out.println("Delivered with DHL");
        return order.process();
    }

    public boolean prepare() {
        return false;
    }
}
