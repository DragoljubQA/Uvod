import java.util.Scanner;

public class T_PetiCas2 {
    public static void main(String[] args) {

        //Korisnici unose sirinu i duzinu terase od paleta koju zele da izgrade
        //nas program treba da im nacrta terasu

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite sirinu");
        int sirina = sc.nextInt();
        System.out.println("Unesite duzinu");
        int duzina = sc.nextInt();

        String paleta = "#";
        for (int i = 0; i < duzina; i++) {
            for (int j = 0; j < sirina; j++) {
                System.out.print(paleta);
            }
            System.out.println();
        }

    }
}
