package flower;

import lombok.Data;

import java.util.ArrayList;

import static flower.BouquetType.NONE;

@Data
public class Bouquet {
    private ArrayList<Flower> flowers = new ArrayList<Flower>();
    public double price;


    public Bouquet(BouquetType def) {
        if ( ! def.equals(BouquetType.NONE)){
                this.addFlower(def.flower, def.quantity);
            }
        }


    public void addFlower(Flower flower, int... Quantity) {
        //System.out.println(flowers);
        int q = Quantity.length > 0 ? Quantity[0] : 1;
        for (int i = 0; i < q ; i++) {
            flowers.add(flower);
            price = price + flower.getPrice();
        }

    }
    public double getPrice() {
        return price;
    }
}
