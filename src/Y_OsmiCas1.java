public class Y_OsmiCas1 {
    public static void main(String[] args) {

        System.out.println("Ispis iz main metode");
        ispis1();
        //ispis2();
        //Ispis 2 ne moze da se izvrsi jer metoda nije static
        ispis3();
        System.out.println(ispis3());
        ispis4();
        ispis5();
        //U ovom slucaju ispis5() ima vrednost 6 i mozemo koristiti metodu ako nam zatreba ova vrednost

    }

    //Da bi metoda bila vidljiva unutar main metode
    //Mora biti static

    public static void ispis1() {
        System.out.println("Ispis iz druge metode");
    }
    //----> void
    //<----> non-void

    public void ispis2() {
        System.out.println("Ispis iz non-static metode");
        //Ovaj ispis nece da se izvrsi jer metoda nije static
    }

    String ispis3a = "Ispis 3";
    //Metoda ispis3() ima identicnu vrednost kao string ispis3a
    public static String ispis3() {
        return "Ispis 3";
        //Kada imamo non-void metodu, obavezno moramo da imamo neki return podatak
        //Return podatak mora biti istog tipa kao metoda (u ovom slucaju String)
    }

    public static String ispis4() {
        String a = "Ispis iz metode 4";
        return a;
    }

    public static int ispis5() {
        int x = 5;
        int y = 1;
        return x + y;
    }

}
