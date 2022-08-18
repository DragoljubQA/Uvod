public class Zadatak36 {
    public static void main(String[] args) {

        //Zadatak 36) Kreirati dva niza i prikazati koji niz ima vecu sumu

        int[] niz1 = {1,2,4,67,432};
        int[] niz2 = {99,1000};

        //int suma1 = niz1[0] + niz1[1] + niz1[2] + niz1[3] + niz1[4];
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i < niz1.length; i++) {
            suma1 = suma1 + niz1[i];
        }

        for (int i = 0; i < niz2.length; i++) {
            suma2 = suma2 + niz2[i];
        }

        System.out.println("Suma prvog niza je " + suma1);
        System.out.println("Suma drugog niza je " + suma2);

        if (suma1 > suma2) {
            System.out.println("Suma prvog niza je veca");
        } else if (suma2 > suma1) {
            System.out.println("Suma drugog niza je veca");
        } else {
            System.out.println("Sume oba niza su jednake");
        }

    }
}
