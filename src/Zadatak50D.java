import java.util.Scanner;

public class Zadatak50D {
    public static void main(String[] args) {

        //Zadatak 50) Korisnik unosi visinu igraca prve petorke domaceg tima i protivnickog tima.
        // Treba prikazati koji tim ima najviseg igraca, najnizeg igraca i koji tim ima veci prosek u visini

        Scanner sc = new Scanner(System.in);

        double max1 = Integer.MIN_VALUE;
        double min1 = Integer.MAX_VALUE;

        double max2 = Integer.MIN_VALUE;
        double min2 = Integer.MAX_VALUE;

        double suma1 = 0;
        double suma2 = 0;

        int brojac1 = 0;
        int brojac2 = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Unesite " + (i+1) + " clana prvog tima");
            double x = sc.nextDouble();
            suma1 = suma1 + x;
            if (x > max1) {
                max1 = x;
            }
            if (x < min1) {
                min1 = x;
            }
            brojac1 = brojac1 + 1;
        }
        double prosek1 = suma1/brojac1;

        for (int i = 0; i < 3; i++) {
            System.out.println("Unesite " + (i+1) + " clana prvog tima");
            double x = sc.nextDouble();
            suma2 = suma2 + x;
            if (x > max2) {
                max2 = x;
            }
            if (x < min2) {
                min2 = x;
            }
            brojac2 = brojac2 + 1;
        }
        double prosek2 = suma2/brojac2;

        najvisi(max1, max2);
        najnizi(min1, min2);
        prosek(prosek1, prosek2);

        provera(max1, max2, "najvisi");
        provera(min1, min2, "najnizi");
        provera(prosek1, prosek2, "prosek");

    }

    public static void provera(double x, double y, String operacija) {
        if (x > y) {
            if (operacija.equals("najvisi")) {
                System.out.println("Prvi tim ima najviseg igraca");
            } else if (operacija.equals("najnizi")) {
                System.out.println("Drugi tim ima najnizeg igraca");
            } else if (operacija.equals("prosek")) {
                System.out.println("Prvi tim ima najvisi prosek igraca");
            } else {
                System.out.println("Pogresno uneta operacija");
            }
        } else if (x < y) {
            if (operacija.equals("najvisi")) {
                System.out.println("Drugi tim ima najviseg igraca");
            } else if (operacija.equals("najnizi")) {
                System.out.println("Prvi tim ima najnizeg igraca");
            } else if (operacija.equals("prosek")) {
                System.out.println("Drugi tim ima najvisi prosek igraca");
            } else {
                System.out.println("Pogresno uneta operacija");
            }
        } else {
            if (operacija.equals("najvisi")) {
                System.out.println("Oba tima imaju iste visine najviseg igraca");
            } else if (operacija.equals("najnizi")) {
                System.out.println("Oba tima imaju iste visine najnizeg igraca");
            } else if (operacija.equals("prosek")) {
                System.out.println("Oba tima imaju isti prosek visine igraca");
            } else {
                System.out.println("Pogresno uneta operacija");
            }
        }
    }

    public static void najvisi(double x, double y) {
        if (x > y) {
            System.out.println("Prvi tim ima najviseg igraca");
        } else if (x < y) {
            System.out.println("Drugi tim ima najviseg igraca");
        } else {
            System.out.println("Oba tima imaju istu visinu najviseg igraca");
        }
    }

    public static void najnizi(double x, double y) {
        if (x > y) {
            System.out.println("Drugi tim ima najnizeg igraca");
        } else if (x < y) {
            System.out.println("Prvi tim ima najnizeg igraca");
        } else {
            System.out.println("Oba tima imaju istu visinu najnizeg igraca");
        }
    }

    public static void prosek(double x, double y) {
        if (x > y) {
            System.out.println("Prvi tim ima najvisi prosek igraca");
        } else if (x < y) {
            System.out.println("Drugi tim ima najvisi prosek igraca");
        } else {
            System.out.println("Oba tima imaju isti prosek visine igraca");
        }
    }
}
