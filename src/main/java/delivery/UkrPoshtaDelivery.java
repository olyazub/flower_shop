package delivery;

import flower.Order;

public class UkrPoshtaDelivery implements DeliveryWay {
    public boolean process(Order order) {
        System.out.println("Delivered with Ukrposhta");
        return order.process();
    }

    public boolean prepare() {
        return false;
    }
}
