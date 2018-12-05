package flower;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum Color {
    BLUE("#FF0"), WHITE("#FFF"), RED("#F00"), PURPLE("#F0F");

    private String rgb;

    Color(String rgb) {
        this.rgb = rgb;
    }


}
