import java.util.Scanner;

public class Zadatak25 {
    public static void main(String[] args) {

        //Zadatak 25) Koristeci WHILE petlju napisati program gde ce korisnik neprestano
        // unositi brojeve sve dok ne unese 0. Kada korisnik unese 0 tada se program zatvara
        // i ispisuje "Kraj programa"

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Unesite broj");
        int x = sc.nextInt();*/
        int x = 1;
        while (x != 0) {
            System.out.println("Unesite broj");
            x = sc.nextInt();
        }
        System.out.println("Kraj programa");

        //-------------Drugi nacin

        int a = 1;
        while (a != 0) {
            System.out.println("Unesite broj");
            x = sc.nextInt();
            if (x == 0) {
                break;
            }
        }
        System.out.println("Kraj programa");

        //--------------Treci nacin

        while (true) {
            System.out.println("Unesite broj");
            x = sc.nextInt();
            if (x == 0) {
                break;
            }
        }
        System.out.println("Kraj programa");

    }
}
