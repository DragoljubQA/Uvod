public class Zadatak55 {
    public static void main(String[] args) {

        //Proveriti u nizu od kojih brojeva je koji broj veci

        int[] niz = {6, 4, 2, 9, 3, 1};
        // i   j     0  1  2  3  4  5

        // 0 - 0
        // 0 - 1
        // 0 - 2
        // 0 - 3
        // 0 - 4
        // 0 - 5

        // 1 - 0
        // 1 - 1
        // 1 - 2
        // 1 - 3
        // 1 - 4
        // 1 - 5

        //.....

        for (int i = 0; i < niz.length; i++) { //Koliko puta cu proci kroz niz
            for (int j = 0; j < niz.length; j++) { //Prolazim kroz niz
                if (niz[i] > niz[j]) {
                    System.out.println("Broj " + niz[i] + " je veci od broja " + niz[j]);
                }
            }
            System.out.println("------------");
        }

    }
}
