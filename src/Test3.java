import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        //3. Napraviti program koji racuna koliko puta se neki broj pojavljuje u nizu. Korisnik preko skenera unese koji broj zeli da prebroji u nizu. Proveru vrsiti u posebnoj metodi

        Scanner sc = new Scanner(System.in);

        int[] niz = {1,2,3,1,2,4,1,2,4,1};

        System.out.println("Unesite broj koji zelite da proverite");
        int broj = sc.nextInt();

        System.out.println("Broj u nizu se ponavlja " + brojac(niz, broj) + " puta");


    }

    public static int brojac(int[] niz, int a) {
        int x = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == a) {
                x = x + 1;
            }
        }

        return x;
    }
}
