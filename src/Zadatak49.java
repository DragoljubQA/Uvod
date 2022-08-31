import java.util.Scanner;

public class Zadatak49 {
    public static void main(String[] args) {

        //Zadatak 49) Napraviti program koji proverava ispravnost PIN-a. PIN smeta najvise 3 puta da unesete.
        // Provera ispravnosti pina se radi u posebnoj metodi. U main metodi se unosi pin

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pin");

        for (int i = 0; i < 3; i++) {
            if (proveraPina(sc.nextInt())) {
                System.out.println("Uspesno unet PIN");
                break;
            } else {
                System.out.println("Netacan PIN, pokusajte ponovo");
            }
        }

    }

    public static boolean proveraPina(int unetPin) {
        boolean provera;

        int pin = 6391;

        if (unetPin == pin) {
            provera = true;
        } else {
            provera = false;
        }

        return provera;

    }

}
