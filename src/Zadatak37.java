public class Zadatak37 {
    public static void main(String[] args) {

        //Zadatak 37) Kreirati niz od 10 clanova i prikazati koliko parnih brojeva ima u nizu

        int[] niz = new int[10];
        niz[0] = 10;
        niz[1] = 11;
        niz[2] = 111;
        niz[3] = 19;
        niz[4] = 21;
        niz[5] = 31;
        niz[6] = 22;
        niz[7] = 19;
        niz[8] = 0;
        niz[9] = 2;

        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]%2==0 && niz[i]!=0) {
                brojac = brojac + 1;
            }
        }

        System.out.println("Niz ima " + brojac + " parnih brojeva");

    }
}
