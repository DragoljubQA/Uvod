public class Test5 {
    public static void main(String[] args) {

        //5. Kreirati vise nizova brojeva
        //Proveriti da li je suma parnih brojeva veca od sume neparnih brojeva za svaki niz
        //U main metodi samo definisati nizove i pozivati ostale metode

        int[] niz1 = {8,4,5,8,34,73,2,54,12,7,89};
        int[] niz2 = {1232,5,89,55,78,90,111};

        System.out.println(provera(sumaParnih(niz1), sumaNeparnih(niz1)));
        System.out.println(provera(sumaParnih(niz2), sumaNeparnih(niz2)));

    }

    public static int sumaParnih(int[] niz) {
        int suma = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]%2==0) {
                suma = suma + niz[i];
            }
        }
        System.out.println("Suma parnih je " + suma);
        return suma;
    }

    public static int sumaNeparnih(int[] niz) {
        int suma = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]%2!=0) {
                suma = suma + niz[i];
            }
        }
        System.out.println("Suma neparnih je " + suma);
        return suma;
    }

    public static boolean provera(int a, int b) {
        if (a > b) {
            return true;
        } else {
            return false;
        }
    }

}
