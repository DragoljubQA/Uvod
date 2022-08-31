public class Zadatak50C {
    public static void main(String[] args) {

        //Zadatak 50) Korisnik unosi visinu igraca prve petorke domaceg tima i protivnickog tima.
        // Treba prikazati koji tim ima najviseg igraca, najnizeg igraca i koji tim ima veci prosek u visini

        double[] niz1 = {195, 202, 199.5, 187.9, 202.4};
        double[] niz2 = {181.5, 195.8, 203.6, 200.1, 191};

        System.out.println(broj(niz1, "max"));
        System.out.println(broj(niz2, "max"));

        System.out.println(broj(niz1,"min"));
        System.out.println(broj(niz2, "min"));

        //System.out.println(broj(niz1,"uaigfag"));

    }

    public static double broj(double[] tim, String operacija) {
        if (operacija.equals("max")) {
            double broj = tim[0];
            for (int i = 0; i < tim.length; i++) {
                if (tim[i] > broj) {
                    broj = tim[i];
                }
            }
            return broj;
        } else if (operacija.equals("min")) {
            double broj = tim[0];
            for (int i = 0; i < tim.length; i++) {
                if (tim[i] < broj) {
                    broj = tim[i];
                }
            }
            return broj;
        } else {
            System.out.println("Nije uneta dobra operacija");
            return 0;
        }
    }
}
