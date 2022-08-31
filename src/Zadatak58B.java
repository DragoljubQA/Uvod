public class Zadatak58B {
    public static void main(String[] args) {

        //Zadatak 58) Napraviti nizove integera i u posebnoj metodi proveriti da li je prosledjen niz palindrom ili ne

        int[] niz1 = {1, 2, 3, 2, 1};
        int[] niz2 = {1, 2, 3, 4, 5};

        System.out.println(palindrom(niz1, povratniNiz(niz1)));
        System.out.println(palindrom(niz2, povratniNiz(niz2)));


    }

    public static int[] povratniNiz(int[] niz) {
        int[] palindrom = new int[niz.length];
        int j = niz.length - 1;
        for (int i = 0; i < niz.length; i++) {
            palindrom[j] = niz[i];
            j--;
        }
        return palindrom;
    }

    public static boolean palindrom(int[] niz1, int[] niz2) {
        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i] != niz2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void stampanje(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }
    }

}
