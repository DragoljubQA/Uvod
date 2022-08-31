import java.util.ArrayList;

public class Zadatak48 {
    public static void main(String[] args) {

        //Zadatak 48) Kreirati metodu za dodavanje clanova u listu,
        // kreirati metodu za oduzimanje clanova iz liste, kreirati metodu za stampanje liste.
        // U main metodi napraviti niz podataka i prosledjivati ovim metodama podatke iz niza

        int[] niz = {12,44,56,89,900};
        ArrayList listaPodataka = new ArrayList();

        System.out.println("Prvo stampanje");
        stampanje(listaPodataka);

        dodavanje(listaPodataka, niz[0]);

        System.out.println("Drugo stampanje");
        stampanje(listaPodataka);

        dodavanje(listaPodataka, niz[niz.length-1]);

        System.out.println("Trece stampanje");
        stampanje(listaPodataka);

        oduzimanje(listaPodataka, 0);

        System.out.println("Cetvrto stampanje");
        stampanje(listaPodataka);


    }

    public static void dodavanje(ArrayList lista1, int element) {
        lista1.add(element);
    }

    public static void oduzimanje(ArrayList lista2, int element) {
        lista2.remove(element);
    }

    public static void stampanje(ArrayList lista3) {
        for (int i = 0; i < lista3.size(); i++) {
            System.out.println(lista3.get(i));
        }
    }

}
