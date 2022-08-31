public class Zadatak59 {
    public static void main(String[] args) {

        int[] niz1 = {1,2,3};
        int[] niz2 = {1,2,3};

        int x;
        if (niz1.length == niz2.length) {
            x = niz1.length;
        } else if (niz1.length > niz2.length) {
            x = niz1.length;
        } else {
            x = niz2.length;
        }

        int[] niz3 = new int[x];
        for (int i = 0; i < niz3.length; i++) {
            niz3[i] = niz1[i] + niz2[i];
        }

        stampanje(niz3);

    }

    public static void stampanje(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }
    }
}
