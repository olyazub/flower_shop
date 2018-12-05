package flower;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Flower {
    private FlowerSpec spec;
    private FlowerType type;



    public double getSepaLength() {
        return spec.getSepaLength();
    }
    public void setSepaLength(double len) {
        spec.setSepaLength(len);
    }

    public double getPrice() { return  spec.getPrice();}
}




//
//public enum Color {
//    red,
//    white,
//    blue
//}
