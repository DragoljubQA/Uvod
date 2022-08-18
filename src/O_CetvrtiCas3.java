import java.util.Scanner;

public class O_CetvrtiCas3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Unesite " + (i+1) + ". broj");
            int x = sc.nextInt();

            if (x==0) {
                System.out.println("Bingo!");
                break;
            }
        }

        System.out.println("Kraj programa");


    }
}
