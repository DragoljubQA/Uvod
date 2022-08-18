import java.util.Scanner;

public class V_SestiCas2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        String spisakNamirnica[] = {"", ""};
        do {
            System.out.println("Unesite namirnice");
            spisakNamirnica[i] = sc.next();
            i++;
        } while (!spisakNamirnica[i].equals("Kraj"));

        System.out.println("Izasli ste iz prodavnice");
        System.out.println("Kupili ste:");

        for (int j = 0; j < spisakNamirnica.length; j++) {
            System.out.println(spisakNamirnica[j]);
        }

    }
}
