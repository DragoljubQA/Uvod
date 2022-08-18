import java.util.Scanner;

public class Zadatak32 {
    public static void main(String[] args) {

        //Zadatak 32 - Unositi brojeve sve dok se ne unesu dva ista broja za redom

        Scanner sc = new Scanner(System.in);

        int broj = Integer.MAX_VALUE;
        int prethodniBroj;
        do {
            prethodniBroj = broj;
            System.out.println("Unesite broj");
            broj = sc.nextInt();
        } while (prethodniBroj != broj);

        System.out.println("Kraj programa");

    }
}
