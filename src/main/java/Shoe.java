import lombok.Getter;
import lombok.Setter;

public class Shoe {

    @Getter
    @Setter
    private String name;
    private int size;

    public Shoe(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
