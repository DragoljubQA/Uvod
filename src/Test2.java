import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

//2. Napraviti program koji, koristeci WHILE petlju, racuna proizvod unetih brojeva sve dok korisnik ne unese 0

        Scanner sc = new Scanner(System.in);

        int proizvod = 1;
        int x = 1;
        while (x!=0) {
            System.out.println("Unesite broj");
            x = sc.nextInt();
            if (x == 0) {
                break;
            }
            proizvod = proizvod * x;
        }

        if (proizvod == 1) {
            System.out.println("Proizvod je 0");
        } else {
            System.out.println("Proizvod je " + proizvod);
        }



    }
}
