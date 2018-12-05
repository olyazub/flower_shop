package delivery;

import flower.Order;

public interface DeliveryWay {
  boolean process(Order order);

  boolean prepare();
}
