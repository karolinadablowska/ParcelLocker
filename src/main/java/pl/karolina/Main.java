package pl.karolina;

import pl.karolina.model.Book;
import pl.karolina.model.Cup;
import pl.karolina.model.Headphone;
import pl.karolina.model.Shoe;

import java.util.Scanner;

public class Main {


    private static final int STOP_PROGRAM = 0;
    private static final int GET = 1;
    private static final int SEND = 2;
    private static final int VIEW = 3;


    public static void main(String[] args) {
        YourPackage yourPackage = new YourPackage();


        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("--------------------------------");
            System.out.println("1 - get package");
            System.out.println("2 - send package");
            System.out.println("3 - view package");
            option = sc.nextInt();

            switch (option) {
                case GET:
                    System.out.println("Number: ");
                    int number = sc.nextInt();
                    System.out.println("Code: ");
                    String code = sc.next();

                    yourPackage.get(number, code);

                    break;
                case SEND:
                    System.out.println("Your'e sending a package........");
                    System.out.println("Please wait........");
                    System.out.println("What do you want to send?");
                    int optionOfSending;
                    String name;
                    Order<?> order = null;
                    do {
                        System.out.println("--------------------------------");
                        System.out.println("0 - stop");
                        System.out.println("1 - book");
                        System.out.println("2 - cup");
                        System.out.println("3 - headphone");
                        System.out.println("4 - shoe");

                        optionOfSending = sc.nextInt();

                        switch (optionOfSending) {
                            case 1:
                                System.out.println("A book?");

                                Book book = inputBook(sc);
                                order = new Order<>(book);
                                break;
                            case 2:
                                System.out.println("A cup?");

                                Cup cup = inputCup(sc);
                                order = new Order<>(cup);
                                break;
                            case 3:
                                System.out.println("A headphone?");

                                Headphone headphone = inputHeadphone(sc);
                                order = new Order<>(headphone);
                                break;
                            case 4:
                                System.out.println("A shoe?");

                                Shoe shoe = inputShoe(sc);
                                order = new Order<>(shoe);
                                break;
                        }

                        yourPackage.send(order);


                    } while (optionOfSending != STOP_PROGRAM);
                    break;
                case VIEW:
                    System.out.println(yourPackage.toString());
            }
        } while (option != STOP_PROGRAM);
    }

    private static Shoe inputShoe(Scanner sc) {
        String name;
        System.out.println("Name of shoe: ");
        name = sc.next();
        System.out.println("Size of shoe: ");
        int size = sc.nextInt();

        Shoe shoe = new Shoe(name, size);
        return shoe;
    }

    private static Headphone inputHeadphone(Scanner sc) {
        String name;
        System.out.println("Name of headphone: ");
        name = sc.next();
        System.out.println("Company of headphone: ");
        String company = sc.next();

        Headphone headphone = new Headphone(name, company);
        return headphone;
    }

    private static Cup inputCup(Scanner sc) {
        String name;
        System.out.println("Color of cup: ");
        name = sc.next();
        Cup cup = new Cup(name);
        return cup;
    }

    private static Book inputBook(Scanner sc) {
        String name;
        System.out.println("Name of book: ");
        name = sc.next();
        System.out.println("Name of author: ");
        String author = sc.next();
        System.out.println("Number of pages: ");
        int page = sc.nextInt();

        Book book = new Book(name, author, page);
        return book;
    }
}






/* Napisz aplikację realizującą nadawanie i odbiór paczek z paczkomatu przy ulicy Siedmiogrodzkiej 11 w Warszawie. (podobne działanie)

Po podejściu do paczkomatu system powinien się zapytać, co chcesz zrobić.
Do wyboru są dwie opcje:

odbierz paczkę
nadaj paczkę.
Jeśli wybierzesz opcję "nadaj paczkę", system powinien się zapytać co chcesz wysłać, do dyspozycji masz:

słuchawki (nazwa, producent)
buty (nazwa, rozmiar)
książka (tytul, autor, liczba stron)
kubek (kolor)
W następnym kroku powinien spytać o szczegóły paczki np. w przypadku książki powinien spytać o tytuł, autora oraz liczbę stron.

Po podaniu wymaganych parametrów system stworzy paczkę. Paczka posiada informacje o numerze paczki, dacie nadania, kod odbioru, oraz element wysyłany (np. buty). Podczas tworzenia paczki system powinien wygenerować kod odbioru, numer paczki oraz ustawić informacje o dacie nadania. Numer paczki powinien zostać wyświetlony osobie wysyłającej, aby wiedziała jaki numer został nadany.

Paczkomat powinien przechowywać informację o wszystkich przechowywanych obecnie paczkach. Paczkomat może przechować maksymalnie 5 paczek. Jeśli nie ma miejsca w paczkomacie, poinformuj, że nie można nadać przesyłki, tuż przed spytaniem o to co chcesz nadać.

Jeśli wybierzesz opcję "odbierz paczkę", system powinien zapytać o numer paczki, po podaniu poprawnego numeru paczki system powinien spytać się o kod paczki, po podaniu poprawnego kodu paczki, paczka powinna zostać wydana. Wyświetl informację np. "Oto twoja paczka: buty". W momencie odbioru paczki, powinna zostać usunięta z systemu.

Jak widzisz, różni się to od prawdziwego paczkomatu. Przede wszystkim nadając nie przychodzimy z gotową paczką, lecz to paczkomat ją "tworzy". Po drugie, odbierający paczkę, przychodzi do tego samego paczkomatu, aby ją odebrać :) Więc jest to trochę skrytka, w którą wkładamy rzeczy, i może je odebrać każda osoba posiadająca numer paczki oraz kod odbioru. Istotą jest to, że docelowo mogłoby to być cokolwiek, w naszym programie ograniczyliśmy do 4 elementów (słuchawki, buty, książka oraz kubek).

Napisz w podejściu TDD. Zdefiniuj wyjątki. Skorzystaj z typów generycznych. */