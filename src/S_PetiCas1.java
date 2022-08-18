public class S_PetiCas1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            //telo petlje
            System.out.println("Ispis iz for petlje");
        }
        //Koristimo FOR kada unapred znamo koliko puta zelimo da se izvrsi neka akcija

        //----------------

        int i = 0;
        while (i < 5) {
            //telo petlje
            System.out.println("Ispis iz while petlje");
            i++;
        }
        //Koristimo WHILE kada unapred ne znamo koliko puta zelimo da se izvrsi neka akcija

        //----------------

        int j = 0;
        do {
            //telo petlje
            System.out.println("Ispis iz do while petlje");
            j++;
        } while (j < 5);
        //Koristimo DO WHILE kada zelimo da se akcija uvek izvrsi BAREM jednom


    }
}
