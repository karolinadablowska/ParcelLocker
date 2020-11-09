import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter

public class ProductList<P> {

    private P [] values;

    public ProductList(P... values)
    {
        this.values = values;
    }


    @Override
    public String toString() {
        return "Your products{" +
                "values=" + Arrays.toString(values) +
                '}';
    }



}

