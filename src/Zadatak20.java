import java.util.Scanner;

public class Zadatak20 {
    public static void main(String[] args) {

        //Zadatak 20) Preko skenera uneti broj N koliko ce se puta petlja izvrsiti.
        // Unutar petlje korisnik unosi broj. Ako unese broj koji je deljiv sa 4 onda izlazi iz petlje.
        // Ako je unet broj deljiv sa 100 onda ne treba da se izadje iz petlje.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj N");
        int N = sc.nextInt();

        for (int i = 0; i < N ; i++) {
            System.out.println("Unesite broj");
            int x = sc.nextInt();
            if (x%4==0 && x%100!=0) {
                break;
            }
        }

        System.out.println("Kraj programa");
    }
}
