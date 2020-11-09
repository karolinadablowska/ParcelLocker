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

                        break;
                    case SEND:
                        System.out.println("Your'e sending a package........");
                        System.out.println("Please wait........");
                        System.out.println("What do you want to send?");
                        int optionOfSending;
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
                                    yourPackage.addPackageBook();
                                    System.out.println(yourPackage.toString());

                                    break;
                                case 2:
                                    System.out.println("A cup?");
                                    yourPackage.addPackageCup();
                                    break;
                                case 3:
                                    System.out.println("A headphone?");
                                    yourPackage.addPackageHeadphone();
                                    break;
                                case 4:
                                    System.out.println("A shoe?");
                                    System.out.println("A headphone?");
                                    yourPackage.addPackageShoe();
                                    break;
                            }


                        } while (optionOfSending != STOP_PROGRAM);



            break;
                    case VIEW:
                    yourPackage.toString();

                }
            } while (option != STOP_PROGRAM);
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