import java.util.Scanner;

public class Q_CetvrtiCas5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj N");
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 0; i < n ; i++) {
            suma = suma + i;
        }

        System.out.println(suma);
    }
}
