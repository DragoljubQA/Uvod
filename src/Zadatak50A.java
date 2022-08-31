public class Zadatak50A {
    public static void main(String[] args) {

        //Zadatak 50) Korisnik unosi visinu igraca prve petorke domaceg tima i protivnickog tima.
        // Treba prikazati koji tim ima najviseg igraca, najnizeg igraca i koji tim ima veci prosek u visini

        double[] niz1 = {195, 202, 199.5, 187.9, 202.4};
        double[] niz2 = {181.5, 195.8, 203.6, 200.1, 191};

        najvisiU1(niz1);
        najvisiU2(niz2);

        najniziU1(niz1);
        najniziU2(niz2);

        prosek1(niz1);
        prosek2(niz2);

        najvisiUoba(niz1, niz2);
        najniziUoba(niz1, niz2);
        prosekUoba(niz1, niz2);


    }

    public static void najvisiU1(double[] prviTim) {
        double max = prviTim[0];
        for (int i = 0; i < prviTim.length; i++) {
            if (prviTim[i] > max) {
                max = prviTim[i];
            }
        }
        System.out.println("Najvisi u prvom timu je " + max);
    }

    public static void najvisiU2(double[] drugiTim) {
        double max = drugiTim[0];
        for (int i = 0; i < drugiTim.length; i++) {
            if (drugiTim[i] > max) {
                max = drugiTim[i];
            }
        }
        System.out.println("Najvisi u drugom timu je " + max);
    }

    public static void najniziU1(double[] prviTim) {
        double min = prviTim[0];
        for (int i = 0; i < prviTim.length; i++) {
            if (prviTim[i] < min) {
                min = prviTim[i];
            }
        }
        System.out.println("Najnizi u prvom timu je " + min);
    }

    public static void najniziU2(double[] drugiTim) {
        double min = drugiTim[0];
        for (int i = 0; i < drugiTim.length; i++) {
            if (drugiTim[i] < min) {
                min = drugiTim[i];
            }
        }
        System.out.println("Najnizi u drugom timu je " + min);
    }

    public static void prosek1(double[] prviTim) {
        double suma = 0;
        for (int i = 0; i < prviTim.length; i++) {
            suma = suma + prviTim[i];
        }
        double prosek = suma/ prviTim.length;
        System.out.println("Prosek prvog tima je " + prosek);
    }

    public static void prosek2(double[] drugiTim) {
        double suma = 0;
        for (int i = 0; i < drugiTim.length; i++) {
            suma = suma + drugiTim[i];
        }
        double prosek = suma/ drugiTim.length;
        System.out.println("Prosek drugog tima je " + prosek);
    }

    public static void najvisiUoba(double[] prviTim, double[] drugiTim) {
        double max1 = prviTim[0];
        for (int i = 0; i < prviTim.length; i++) {
            if (prviTim[i] > max1) {
                max1 = prviTim[i];
            }
        }

        double max2 = drugiTim[0];
        for (int i = 0; i < drugiTim.length; i++) {
            if (drugiTim[i] > max2) {
                max2 = drugiTim[i];
            }
        }

        if (max1 > max2) {
            System.out.println("Prvi tim ima najviseg igraca");
        } else if (max2 > max1) {
            System.out.println("Drugi tim ima najvise igraca");
        } else {
            System.out.println("Oba tima imaju istu visinu najviseg igraca");
        }

    }

    public static void najniziUoba(double[] prviTim, double[] drugiTim) {
        double min1 = prviTim[0];
        for (int i = 0; i < prviTim.length; i++) {
            if (prviTim[i] < min1) {
                min1 = prviTim[i];
            }
        }

        double min2 = drugiTim[0];
        for (int i = 0; i < drugiTim.length; i++) {
            if (prviTim[i] < min2) {
                min2 = prviTim[i];
            }
        }

        if (min1 < min2) {
            System.out.println("Prvi tim ima najnizeg igraca");
        } else if (min2 < min1) {
            System.out.println("Drugi tim ima najnizeg igraca");
        } else {
            System.out.println("Oba tima imaju istu visinu najviseg igraca");
        }

    }

    public static void prosekUoba(double[] prviTim, double[] drugiTim) {
        double suma1 = 0;
        for (int i = 0; i < prviTim.length; i++) {
            suma1 = suma1 + prviTim[i];
        }
        double prosek1 = suma1/ prviTim.length;

        double suma2 = 0;
        for (int i = 0; i < drugiTim.length; i++) {
            suma2 = suma2 + drugiTim[i];
        }
        double prosek2 = suma2/ drugiTim.length;

        if (prosek1 > prosek2) {
            System.out.println("Prvi tim ima veci prosek");
        } else if (prosek2 > prosek1) {
            System.out.println("Drugi tim ima veci prosek");
        } else {
            System.out.println("Oba tima imaju isti prosek");
        }

    }



}
