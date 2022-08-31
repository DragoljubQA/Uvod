public class Zadatak50B {
    public static void main(String[] args) {

        //Zadatak 50) Korisnik unosi visinu igraca prve petorke domaceg tima i protivnickog tima.
        // Treba prikazati koji tim ima najviseg igraca, najnizeg igraca i koji tim ima veci prosek u visini

        double[] niz1 = {195, 202, 199.5, 187.9, 202.4};
        double[] niz2 = {181.5, 195.8, 203.6, 200.1, 191};

        System.out.println(najvisi(niz1)); //Vrednost metode najviseg je - 202.4
        System.out.println(najvisi(niz2)); //Vrednost metode najviseg je - 203.6 i prethodna vrednost se 'pregazila'

        System.out.println(najnizi(niz1));
        System.out.println(najnizi(niz2));

        System.out.println(prosek(niz1));
        System.out.println(prosek(niz2));

        double najvisiU1 = najvisi(niz1); //Zato sto je prethodna vrednost metode najviseg pregazena, tu vrednost smo
        //zapamtili u ovu promenljivu
        double najvisiU2 = najvisi(niz2);

        double najniziU1 = najnizi(niz1);
        double najniziU2 = najnizi(niz2);

        double prosek1 = prosek(niz1);
        double prosek2 = prosek(niz2);

        if (najvisiU1 > najvisiU2) {
            System.out.println("Prvi tim ima najviseg igraca");
        } else if (najvisiU1 < najvisiU2) {
            System.out.println("Drugi tim ima najviseg igraca");
        } else {
            System.out.println("Oba tima imaju najviseg igraca");
        }

        if (najniziU1 < najniziU2) {
            System.out.println("Prvi tim ima najnizeg igraca");
        } else if (najniziU2 < najniziU1) {
            System.out.println("Drugi tim ima najnizeg igraca");
        }

        if (prosek1 > prosek2) {
            System.out.println("Prvi tim ima najvisi prosek");
        } else if (prosek1 < prosek2) {
            System.out.println("Drugi tim ima najvisi prosek");
        } else {
            System.out.println("Oba tima imaju isti prosek");
        }

    }

    public static double najvisi(double[] tim) {
        double max = tim[0];
        for (int i = 0; i < tim.length; i++) {
            if (tim[i] > max) {
                max = tim[i];
            }
        }
        return max;
    }

    public static double najnizi(double[] tim) {
        double min = tim[0];
        for (int i = 0; i < tim.length; i++) {
            if (tim[i] < min) {
                min = tim[i];
            }
        }
        return min;
    }

    public static double prosek(double[] tim) {
        double suma = 0;
        for (int i = 0; i < tim.length; i++) {
            suma = suma + tim[i];
        }
        double prosek = suma/ tim.length;
        return prosek;
    }

}