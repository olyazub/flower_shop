package flower;

import lombok.Data;

import java.util.HashMap;

@Data
public class CheckOut {

    private HashMap<Flower,Integer> check;
    private int quantity;
}
