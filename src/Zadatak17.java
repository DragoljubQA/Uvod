public class Zadatak17 {
    public static void main(String[] args) {

        //Zadatak 17) Napisati program koji ce sabrati sve parne brojeve od 0 do 20

        int suma = 0;

        for (int i = 0; i < 20; i++) {
            if (i%2==0) {
                suma = suma + i;
            }
        }

        //Nakon petlje vrednost sume je 90
        System.out.println(suma);


    }
}
