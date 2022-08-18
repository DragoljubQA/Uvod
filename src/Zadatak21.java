import java.util.Scanner;

public class Zadatak21 {
    public static void main(String[] args) {

        //Zadatak 21) Preko skenera uneti 5 brojeva, program treba da prikaze na kraju koji je
        // najveci i koji je najmanji broj. Ako su najmanji i najveci broj jednaki, potrebno je ispisati
        // "Max i min su jednaki"

        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.println("Unesite broj");
            int x = sc.nextInt();
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
        }

        System.out.println("Minimum je " + min);
        System.out.println("Maksimum je " + max);

        if (max == min) {
            System.out.println("Max i min su jednaki");
        }


    }
}
