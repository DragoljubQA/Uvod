import java.util.Scanner;

public class Zadatak27 {
    public static void main(String[] args) {

        //Zadatak 27 - Prikazati aritmeticku sredinu od 1 do N - Koristiti WHILE

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj N");
        int N = sc.nextInt();

        int suma = 0;
        int i = 1;
        while (i < N) {
            suma = suma + i;
            i++;
        }
        double art = (N-1) * 1.0;
        System.out.println("Aritmeticka sredina je "+suma/art);


    }
}
