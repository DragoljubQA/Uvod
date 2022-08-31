public class Zadatak58A {
    public static void main(String[] args) {

        //Zadatak 58) Napraviti nizove integera i u posebnoj metodi proveriti da li je prosledjen niz palindrom ili ne

        int[] niz1 = {1, 2, 3, 2, 1};
        int[] niz2 = {1, 2, 3, 4, 5};

        System.out.println(palindrom(niz1));
        System.out.println(palindrom(niz2));


    }

    public static boolean palindrom(int[] niz) {
        boolean provera = false;
        int brojac = 0;
        int j = niz.length-1;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == niz[j]) {
                brojac = brojac + 1;
            }
            j--;
        }
        if (brojac == niz.length) {
            provera = true;
        }
        return provera;
    }
}
