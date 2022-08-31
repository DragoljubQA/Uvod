import java.util.Scanner;

public class Zadatak51 {
    public static void main(String[] args) {

        //Zadatak 51) Preko skenera uneti 4 broja u niz.
        // Ako je barem jedan broj negativan uraditi sumu svih brojeva,
        // u suprotnom pomnoziti sve brojeve.
        // U main metodi samo pozvati metodu koja prikazuje resenje

        provera();

    }

    public static void provera() {
        Scanner sc = new Scanner(System.in);

        int[] niz = new int[4];

        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesite broj");
            niz[i] = sc.nextInt();
        }

        int suma = 0;
        int proizvod = 1;

        //Netacan nacin
        /*for (int i = 0; i < niz.length; i++) {
            if (niz[i] > 0) {
                proizvod = proizvod * niz[i];
            } else {
                suma = suma + niz[i];
            }
        }*/

        //Prvi nacin
        /*if (niz[0] > 0 && niz[1] > 0 && niz[2] > 0 && niz[3] > 0) {
            for (int i = 0; i < niz.length; i++) {
                proizvod = proizvod * niz[i];
            }
        } else {
            for (int i = 0; i < niz.length; i++) {
                suma = suma + niz[i];
            }
        }*/

        //Drugi nacin
        /*int brojac = 0;
        boolean provera = false;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > 0) {

            } else {
                brojac = brojac + 1;
            }
        }
        if (brojac==0) {
            provera = true;
        } else {
            provera = false;
        }

        if (provera) {
            for (int i = 0; i < niz.length; i++) {
                proizvod = proizvod * niz[i];
            }
        } else {
            for (int i = 0; i < niz.length; i++) {
                suma = suma + niz[i];
            }
        }*/

        //Treci nacin
        boolean provera = true;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < 0) {
                provera = false;
                break;
            }
        }

        if (provera) {
            for (int i = 0; i < niz.length; i++) {
                proizvod = proizvod * niz[i];
            }
        } else {
            for (int i = 0; i < niz.length; i++) {
                suma = suma + niz[i];
            }
        }

        System.out.println("Suma je " + suma);
        System.out.println("Proizvod je " + proizvod);
    }
}
