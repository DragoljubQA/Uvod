public class Zadatak35 {
    public static void main(String[] args) {

        //Zadatak 35) Kreirati dva niza i prikazati koji niz ima vise clanova

        int[] niz1 = {1,2,4,67,432};
        int[] niz2 = {99,1000};

        if (niz1.length > niz2.length) {
            System.out.println("Prvi niz ima vise clanova");
        } else if (niz2.length > niz1.length) {
            System.out.println("Drugi niz ima vise clanova");
        } else {
            System.out.println("Nizovi imaju isti broj clanova");
        }



    }
}
