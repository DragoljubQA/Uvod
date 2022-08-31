import java.util.ArrayList;

public class Zadatak54A {
    public static void main(String[] args) {

        //Zadatak 54) Kreirati niz, zatim u drugoj metodi kreirati drugi niz koji sadrzi sve parne brojeve prvog niza

        int[] niz1 = {3,6,9,12,18,101,102,99,4};
        int[] niz3 = {2,4,6,11,201,999,100};

        stampanje(parniNiz(niz1));
        System.out.println("----------");
        stampanje(parniNiz(niz3));

        /*int sumaPrvogNiza = lista(niz1);
        int sumaDrugogNiza = lista(niz3);

        if (sumaPrvogNiza > sumaDrugogNiza) {
            System.out.println("Prvi niz ima vecu sumu");
        } else if () {

        }*/


    }

    public static int[] parniNiz(int[] nizIzMainMetode) {
        int brojac = 0; //brojac koji mi pomaze da prebrojim parne brojeve
        for (int i = 0; i < nizIzMainMetode.length; i++) {
            if (nizIzMainMetode[i]%2==0) {
                brojac = brojac + 1;
            }
        }

        // 0 6 0 12 18 0 102 0 4
        int[] niz2 = new int[brojac];
        int j = 0;
        for (int i = 0; i < nizIzMainMetode.length; i++) {
            if (nizIzMainMetode[i]%2==0) {
                niz2[j] = nizIzMainMetode[i];
                j++;
            }
        }
        return niz2;
    }

    public static void stampanje(int[] nizZaStampu) {
        for (int i = 0; i < nizZaStampu.length; i++) {
            System.out.println(nizZaStampu[i]);
        }
    }

    //-----------------------
    //Kada bismo niz prebacili u niz i trazili sumu:
    //note: Metoda vraca citavu listu, ne vraca sumu
    //Ako zelimo da vrati sumu onda treba da promenimo da se vraca int
    //i za return staviti return suma;

    public static ArrayList lista(int[] nizIzMainMetode) {
        ArrayList<Integer> novaLista = new ArrayList<Integer>();

        for (int i = 0; i < nizIzMainMetode.length; i++) {
            if (nizIzMainMetode[i]%2==0) {
                novaLista.add(nizIzMainMetode[i]);
            }
        }

        int suma = 0;
        for (int i = 0; i < novaLista.size(); i++) {
            suma = suma + novaLista.get(i);
        }

        return novaLista;
    }

}
