import java.util.ArrayList;

public class Z_OsmiCas2 {
    public static void main(String[] args) {

        ArrayList<String> koCeMiDociNaRodjendan = new ArrayList<>();
        ArrayList<String> drugalista = new ArrayList<>();

        koCeMiDociNaRodjendan.add("Milos");
        koCeMiDociNaRodjendan.add("Sara");
        koCeMiDociNaRodjendan.add("Tamara");

        /*for (int i = 0; i < koCeMiDociNaRodjendan.size(); i++) {
            System.out.println(koCeMiDociNaRodjendan.get(i));
        }*/

        stampanje(koCeMiDociNaRodjendan);

        koCeMiDociNaRodjendan.remove("Milos");
        koCeMiDociNaRodjendan.add("Marko");

        /*for (int i = 0; i < koCeMiDociNaRodjendan.size(); i++) {
            System.out.println(koCeMiDociNaRodjendan.get(i));
        }*/

        stampanje(koCeMiDociNaRodjendan);

        koCeMiDociNaRodjendan.remove(0);
        koCeMiDociNaRodjendan.add("Strahinja");
        koCeMiDociNaRodjendan.add("Marija");

        //------------

        System.out.println("Spisak ljudi koji ce doci:");

        /*for (int i = 0; i < koCeMiDociNaRodjendan.size(); i++) {
            System.out.println(koCeMiDociNaRodjendan.get(i));
        }*/

        stampanje(koCeMiDociNaRodjendan);

        //--------------

        drugalista.add("Primer 1");

        stampanje(drugalista);


    }

    public static void stampanje(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
