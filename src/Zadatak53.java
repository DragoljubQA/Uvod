import java.util.Scanner;

public class Zadatak53 {
    public static void main(String[] args) {

        //Zadatak 53) Upisati iz koje drzave je korisnik i ispisati mu u kojoj valuti moze da kupi picu.
        // Raditi preko switch-a, a za resenje pozivati metodu drzave

        Scanner sc = new Scanner(System.in);
        System.out.println("U kojoj drzavi zelite da kupite picu? Srbija, Italija, Japan");
        String drzava = sc.next();

        switch (drzava) {
            case "Srbija":
                srbija();
                break;

            case "Italija":
                italija();
                break;

            case "Japan":
                japan();
                break;

            default:
                System.out.println("Niste uneli odabranu drzavu");
                break;
        }

    }

    public static void srbija() {
        System.out.println("Mozete kupiti u dinarima");
    }

    public static void italija() {
        System.out.println("Mozete kupiti u evrima");
    }

    public static void japan() {
        System.out.println("Mozete kupiti u jenima");
    }
}
