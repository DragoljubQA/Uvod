public class Zadatak16 {
    public static void main(String[] args) {

        //Zadatak 16) Izracunati koliko ima trocifrenih brojeva deljivih sa 5

        int brojac = 0;
        for (int i = 100; i < 1000; i++) {
            if (i%5==0) {
                System.out.println(i);
                brojac = brojac + 1;
            }
        }

        System.out.println("Trocifrenih brojeva deljivih sa 5 ima " + brojac);

    }
}
