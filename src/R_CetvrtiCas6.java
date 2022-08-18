import java.util.Scanner;

public class R_CetvrtiCas6 {
    public static void main(String[] args) {

        //Uneti 5 brojeva preko skenera i pronaci najveci
        Scanner sc = new Scanner(System.in);
        //1 2 9 3 4
        int max = 0;
        for (int i = 0; i <5; i++) {
            System.out.println("Unesite " + (i+1) + ". broj");
            int x = sc.nextInt();
            if (x > max) {
                max = x;
            }

        }

        System.out.println("Max je " + max);


    }
}
