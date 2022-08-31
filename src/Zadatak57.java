public class Zadatak57 {
    public static void main(String[] args) {

        int niz1[] = {1, 2, 3};

        String niz2[] = new String[niz1.length];

        for (int i = 0; i < niz1.length; i++) {
            niz2[i] = String.valueOf(niz1[i]);
        }

        stampanje(niz2);

    }

    public static void stampanje(String[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }
    }
}
