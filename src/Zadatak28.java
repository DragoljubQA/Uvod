import java.util.Scanner;

public class Zadatak28 {
    public static void main(String[] args) {

//Zadatak 28 - Korisnik unosi brojeve preko skenera i potrebno je racunati sumu dok korisnik ne unese negativan broj

        Scanner sc = new Scanner(System.in);

        /*int x = 0;
        int suma = 0;
        while (x >= 0) {
            suma = suma + x;
            System.out.println("Unesite broj");
            x = sc.nextInt();
        }
        System.out.println("Suma je " + suma);*/

        int x;
        int suma = 0;
        while (true) {
            System.out.println("Unesite broj");
            x = sc.nextInt();
            if (x < 0) {
                break;
            }
            suma = suma + x;
        }
        System.out.println("Suma je " + suma);

    }
}
