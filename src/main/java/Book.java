import lombok.Getter;
import lombok.Setter;

public class Book {

    @Getter
    @Setter
    private String name;
    private String author;
    private int numberofPages;

    public Book(String name, String author, int numberofPages) {
        this.name = name;
        this.author = author;
        this.numberofPages = numberofPages;

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numberofPages=" + numberofPages +
                '}';
    }
}
