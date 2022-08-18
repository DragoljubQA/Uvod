import java.util.Scanner;

public class Zadatak22 {
    public static void main(String[] args) {

        //Zadatak 22) Preko skenera uneti broj N i broj M.
        // Potrebno je naci aritmeticku sredinu izmedju ta dva broja.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite N vrednost");
        int N = sc.nextInt();
        System.out.println("Unesite M vrednost");
        int M = sc.nextInt();
        int suma = 0;
        double brojac = 0;

        /*int min, max;
        if (N < M) {
            min = N;
            max = M;
        } else if (N > M) {
            min = M;
            max = N;
        }*/

        if (N < M) {
            for (int i = N; i <= M; i++) {
                suma = suma + i;
                brojac = brojac + 1;
            }
        } else if (N > M) {
            for (int i = M; i <= N; i++) {
                suma = suma + i;
                brojac = brojac + 1;
            }
        } else {
            System.out.println("Brojevi N i M su jednaki");
        }
        System.out.println("Aritmeticka sredina je " + (suma/brojac));

    }
}
