package flower;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlowerSpec {
    private Color color;
    private float price;
    private double SepaLength;
}
