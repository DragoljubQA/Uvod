import java.util.Scanner;

public class Zadatak23 {
    public static void main(String[] args) {

        //Zadatak 23) Napisati program gde korisnik (djak) unosi poslednjih 5 ocena,
// ako ima sve petice program vrati poruku "Odlican djak",
// ako nema sve petice vraca poruku "Nije odlican djak"

        Scanner sc = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Unesite ocenu");
            int ocena = sc.nextInt();
            if (ocena > 5 || ocena < 1) {
                System.out.println("Uneli ste neodgovarajuci unos");
                break;
            }
            suma = suma + ocena;

        }

        if (suma == 25) {
            System.out.println("Odlican djak");
        } else {
            System.out.println("Nije odlican djak");
        }

    }
}
