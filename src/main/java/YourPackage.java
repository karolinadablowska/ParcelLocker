import lombok.Getter;
import lombok.ToString;

import java.util.Scanner;
@Getter
@ToString
public class YourPackage {

    Scanner sc = new Scanner(System.in);

    private int iterator = 0;




    public void addPackageCup() {

        System.out.println("Color of cup: ");
        String name = sc.next();

        ProductList<Cup> cups = new ProductList<>();

    }

    public void addPackageShoe() {

        System.out.println("Name of cup: ");
        String name = sc.next();
        System.out.println("Size of cup: ");
        int size = sc.nextInt();

        ProductList<Shoe> shoes = new ProductList<>();

    }

    public void addPackageHeadphone() {

        System.out.println("Name of headphone: ");
        String name = sc.next();
        System.out.println("Company of headphone: ");
        String company = sc.next();

        ProductList<Headphone> cups = new ProductList<>();

    }

    public int howManyBook() {
        return iterator;
    }


    public void addPackageBook() {
        System.out.println("Name of book: ");
        String name = sc.next();
        System.out.println("Name of author: ");
        String author = sc.next();
        System.out.println("Number of pages: ");
        int page = sc.nextInt();


    }


    public void addPackageBook(Book b1) {
        System.out.println("Name of book: ");
        String name = sc.next();
        System.out.println("Name of author: ");
        String author = sc.next();
        System.out.println("Number of pages: ");
        int page = sc.nextInt();


    }
}
