import java.util.Scanner;

public class Zadatak52 {
    public static void main(String[] args) {

        //Zadatak 52) Napraviti program u kom korisnik unosi brojeve sve dok ne unese broj 1.
        // Zadatak uraditi na 3 nacina za sve 3 petlje.
        // Sve raditi u main metodi

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 1; i--) {
            System.out.println("Unesite broj");
            int x = sc.nextInt();
            System.out.println("Unet broj je " + x);
            if (x == 1) {
                break;
            }
        }

        System.out.println("-------------------------------");

        while (true) {
            System.out.println("Unesite broj");
            int x = sc.nextInt();
            System.out.println("Unet broj je " + x);
            if (x == 1) {
                break;
            }
        }

        System.out.println("-------------------------------");

        int x = 0;
        do {
            System.out.println("Unesite broj");
             x = sc.nextInt();
            System.out.println("Unet broj je " + x);
        } while (x!=1);

    }
}
