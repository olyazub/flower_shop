package flower;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public enum BouquetType {
   CHAMOMILEBIG(new Flower(new FlowerSpec(Color.WHITE, 7,11), FlowerType.CHAMOMILE),17),
    RED101(new Flower(new FlowerSpec(Color.RED, 20,18), FlowerType.ROSE),101),
    NONE(null, 0);

    public Flower flower;
    public int quantity;

     BouquetType(Flower flower, int quantity){
         this.flower = flower;
         this.quantity = quantity;
     }


    }


