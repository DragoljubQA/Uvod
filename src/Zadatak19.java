import java.util.Scanner;

public class Zadatak19 {
    public static void main(String[] args) {

        //Zadatak 19) Napisati program koji ce sabirati neparne brojeve do broja N koji se unosi preko skenera

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj N");
        int N = sc.nextInt();
        int suma = 0;
        for (int i = 0 ; i < N; i++) {
            if (i%2!=0) {
                suma = suma + i;
            }
        }
        System.out.println(suma);

    }
}
