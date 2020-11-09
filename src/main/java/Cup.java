import lombok.Getter;
import lombok.Setter;

public class Cup {

    @Getter
    @Setter
    private String color;

    public Cup(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "color='" + color + '\'' +
                '}';
    }
}
