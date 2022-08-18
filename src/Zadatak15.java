public class Zadatak15 {
    public static void main(String[] args) {

        //Zadatak 15) Prikazati sve dvocifrene brojeve koji su deljivi sa 3

        int brojac = 0;

        for (int i = 10; i < 100; i++) {
            if (i%3==0) {
                System.out.println(i);
                brojac = brojac + 1;
                //drugi nacin kako da se dodaje vrednost brojacu
                //brojac+=1;
                System.out.println("Trenutna vrednost brojaca je " + brojac);
            }
        }

        System.out.println("Dvocifrenih brojeva deljivih sa 3 ima " + brojac);

    }
}
