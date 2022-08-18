public class U_SestiCas1 {
    public static void main(String[] args) {

        int niz1[]; //Deklarisanje niza
        int[] niz2;

        //5 2 13 44
        //index[0], index[1], index[2], index[3]
        //Duzina niza je - 4
        //Poslednji index je - 3

        //Index je pozicija clana u nizu i uvek krece od 0
        //Index ne moze da se preskoci u kreiranju niza. Ne moze imati clanove 0,1,3,4

        int niz3[] = new int[3]; //Deklarisanje niza
        niz3[0] = 1; //Inicijalizacija niza na indexu 0
        niz3[1] = 4;
        niz3[2] = 6;
        //niz3[4] = 11;

        for (int i = 0; i < niz3.length; i++) {
            System.out.println(niz3[i]);
        }

        int niz4[] = {2,5,76,0,11};
        System.out.println("Duzina niza 4 je " + niz4.length);

        for (int i = 0; i < niz4.length; i++) {
            System.out.println((i+1) + ". clan niza je " + niz4[i]);
        }

        //-------------

        int niz5[] = new int[100];

        for (int i = 0; i < niz5.length; i++) {
            niz5[i] = i+1;
            System.out.println((i+1)+". clan niza je " + niz5[i]);
        }



    }
}
