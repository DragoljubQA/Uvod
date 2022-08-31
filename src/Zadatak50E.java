public class Zadatak50E {
    public static void main(String[] args) {

        //Zadatak 50) Korisnik unosi visinu igraca prve petorke domaceg tima i protivnickog tima.
        // Treba prikazati koji tim ima najviseg igraca, najnizeg igraca i koji tim ima veci prosek u visini

        double[] niz1 = {195, 202, 199.5, 187.9, 202.4};
        double[] niz2 = {181.5, 195.8, 203.6, 200.1, 191};

        for (int i = 0; i < resenje(niz1).length; i++) {
            System.out.println(resenje(niz1)[i]);
        }

        for (int i = 0; i < resenje(niz2).length; i++) {
            System.out.println(resenje(niz2)[i]);
        }

        if (resenje(niz1)[0] > resenje(niz2)[0]) {
            System.out.println("Prvi tim ima najviseg igraca");
        } else if (resenje(niz1)[0] < resenje(niz2)[0]) {
            System.out.println("Drugi tim ima najviseg igraca");
        } else {
            System.out.println("Oba tima imaju iste visine najviseg igraca");
        }

        if (resenje(niz1)[1] > resenje(niz2)[1]) {
            System.out.println("Drugi tim ima najnizeg igraca");
        } else if (resenje(niz1)[1] < resenje(niz2)[1]) {
            System.out.println("Prvi tim ima najnizeg igraca");
        } else {
            System.out.println("Oba tima imaju iste visine najnizeg igraca");
        }

        if (resenje(niz1)[2] > resenje(niz2)[2]) {
            System.out.println("Prvi tim ima veci prosek visine");
        } else if (resenje(niz1)[0] < resenje(niz2)[0]) {
            System.out.println("Drugi tim ima veci prosek visine");
        } else {
            System.out.println("Oba tima imaju isti prosek visine igraca");
        }

    }

    public static double[] resenje(double[] tim) {
        double suma = 0;
        double brojac = 0;
        double max = tim[0];
        double min = tim[0];
        for (int i = 0; i < tim.length; i++) {
            suma = suma + tim[i];
            if (tim[i] > max) {
                max = tim[i];
            }
            if (tim[i] < min) {
                min = tim[i];
            }
            brojac = brojac + 1;
        }
        double prosek = suma/brojac;
        double[] niz = {max, min, prosek};
        return niz;
    }
}
