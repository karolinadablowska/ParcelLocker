import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class ParcelLockerTest {

    YourPackage yourPackage;
    Book book;

    @Test
    public void addProperty(){
        Book b1 = new Book("jj", "hh", 500);
        yourPackage.addPackageBook(b1);

        int howMany = yourPackage.howManyBook();

        assertEquals(1,howMany);
    }
}
