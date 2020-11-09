package pl.karolina;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@ToString
public class Order<P> {

    static int iterator = 0;

    private P order;
    private int number = iterator++;
    private String code = UUID.randomUUID().toString().substring(0, 5);
    private LocalDate date = LocalDate.now();

    public Order(P order) {
        this.order = order;
    }
}
