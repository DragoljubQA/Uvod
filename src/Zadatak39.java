public class Zadatak39 {
    public static void main(String[] args) {

        //Zadatak 39 - Napraviti niz i prikazati njegov najveci i najmanji clan

        //Da bih nasao najvecu vrednost ovog niza morao bih da uporedim svaki broj sa svakim
        //Pa onda uzmem da mi je 7 max broj i uporedim ga sa -2, 7 je i dalje veci pa ostaje max
        //Onda uporedim sa 16 i 16 je veci broj pa onda 16 postaje max
        //Ali nakon toga ne moram da krenem poredjenje ispocetka jer ako je 7 najveci broj pre 16
        //onda ce sigurno i 16 biti veci od tih brojeva
        //Nastavim dalje 16 > -10, 16 > 0, i dodjem da 16 nije veci od 99, znaci 99 postaje max
        //isto tako ne moram da se vracam na pocetak niza jer ako je 16 bio najveci broj do tada
        //i 99 ce biti najveci broj. I za kraj ostaje samo provera 99 > 5

        //Isti princip mogu da ponovim da trazim najmanju vrednost, uzmem da je 7 najmanja vrednost
        //i poredim sa narednim brojem

        int[] niz = {7, -2, 16, -10, 0, 99, 5};
        int max = niz[0];
        int min = niz[0];

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
            if (niz[i] < min) {
                min = niz[i];
            }
        }

        System.out.println("Najveci broj je " + max);
        System.out.println("Najmanji broj je " + min);

        /*int broj = niz[0];

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > broj) {
                broj = niz[i];
            }
        }
        System.out.println("Najveci broj je " + broj);
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < broj) {
                broj = niz[i];
            }
        }
        System.out.println("Najmanji broj je " + broj);*/








    }
}
