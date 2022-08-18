public class Zadatak24 {
    public static void main(String[] args) {

        //Zadatak 24) Koristeci FOR petlju napisati program koji ce izracunati sumu brojeva od 25 do 1000
//Koristeci WHILE petlju odstampati resenje prethodne sume 3 puta
//Koristeci DO WHILE petlju odstampati "Kraj programa" 4 puta

        int suma = 0;
        for (int i = 25; i <= 1000 ; i++) {
            suma = suma + i;
        }

        int i = 0;
        while (i < 3) {
            System.out.println("Suma je " + suma);
            i++;
        }

        int j = 0;
        do {
            System.out.println("Kraj programa");
            j++;
        } while (j < 4);


    }
}
