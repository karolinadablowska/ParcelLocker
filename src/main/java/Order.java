import java.time.LocalDate;

public class Order {

    private ProductList<?> orders;
    private int numberofPackage;
    private LocalDate date = LocalDate.now();

    public Order(ProductList<?> orders, int numberofPackage, LocalDate date) {
        this.orders = orders;
        this.numberofPackage = numberofPackage;
        this.date = date;
    }


    public void zamow() {
         System.out.println(orders);
    }

}
