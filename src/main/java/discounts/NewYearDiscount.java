package discounts;

import flower.Order;

public class NewYearDiscount extends Discount {

    public NewYearDiscount(Order order) {
        super(order);
    }

    @Override
    public double getPrice() {
        return super.getPrice()  * 0.7;
    }
}
