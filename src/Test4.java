import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

//4. Napisati program koji racuna potrosnju goriva. Korisnik unosi distancu, tip vozila i tip goriva,
        //a program ispisuje koliko ce goriva biti potroseno i koja je ukupna cena.
        //Motor trosi 5 litara na 100 km
        //Automobil trosi 9 litara na 100 km
        //Kamion trosi 15 litara na 100 km
        //Tipovi goriva su:
        //Benzin kosta 170 dinara po litru
        //Dizel kosta 190 dinara po litru
        //Zadatak raditi kroz switch i pokriti samo happy flow uz default

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tip vozila (Motor, Automobil, Kamion)");
        String vozilo = sc.next();

        System.out.println("Unesite predjenu distancu u kilometrima");
        double distanca = sc.nextDouble();

        System.out.println("Unesite tip goriva (benzin ili dizel)");
        String gorivo = sc.next();

        int cenaBenzina = 170;
        int cenaDizela = 190;
        double potrosnja = 0;

        switch (vozilo) {
            case "Motor":
                if (gorivo.equals("benzin")) {
                    potrosnja = 0.05 * distanca * cenaBenzina;
                } else if (gorivo.equals("dizel")) {
                    potrosnja = 0.05 * distanca * cenaDizela;
                }
                break;

            case "Automobil":
                if (gorivo.equals("benzin")) {
                    potrosnja = 0.09 * distanca * cenaBenzina;
                } else if (gorivo.equals("dizel")) {
                    potrosnja = 0.09 * distanca * cenaDizela;
                }
                break;

            case "Kamion":
                if (gorivo.equals("benzin")) {
                    potrosnja = 0.15 * distanca * cenaBenzina;
                } else if (gorivo.equals("dizel")) {
                    potrosnja = 0.15 * distanca * cenaDizela;
                }
                break;

            default:
                System.out.println("Niste uneli validan podatak");
                break;
        }

        System.out.println("Potrosnja je " + potrosnja + " rsd");



    }
}
