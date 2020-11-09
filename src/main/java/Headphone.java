import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Headphone {

    @Getter
    @Setter
    private String name;
    private String company;

    public Headphone(String name, String company) {
        this.name = name;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Headphone{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
