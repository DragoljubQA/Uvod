public class Z_OsmiCas3 {
    public static void main(String[] args) {

        int x = 5;
        int y = 6;

        sabiranje(x, y); //Prosledjujem vrednosti 5 i 6 koje su prethodno inicijalizovane u x i y
        sabiranje(2, 5); //Prosledjujem vrednosti 2 i 5
        sabiranje(x, 8); //Prosledjujem prethodno inicijalizovanu vrednost 5 i broj 8

        mnozenje(x,y);
        //Pozivanje metode mnozenje sam ja zapravo izracunao mnozenje brojeva x i y
        //Ali nije vidljivo resenje jer unutar te metode nemam stampanje
        System.out.println(mnozenje(x, y));
        //Mogu da odstampam drugu metodu i onda da vidim njenu vrednost

        //Drugim recima za stampanje metode:
        //Stampaj mi vrednost metode 'mnozenje()' kada toj metodi prosledim vrednosti x i y



    }

    public static void sabiranje(int a, int b) {
        //Koje god vrednosti da prosledim, ova metoda ce ih gledati kao 'a' i 'b'
        //Bilo da prosledim x i y, ili x i 8, ili 1 i 9, oni ce biti korisceni kao 'a' i 'b'
        //NAZIV VREDNOSTI KOJE PROSLEDJUJETE NE MORAJU BITI ISTOG NAZIVA U PARAMETRU!!!
        //Preporuka je da ne budu istog naziva

        int c = a + b;
        System.out.println("Sabiranje brojeva " + a + " i " + b + " je " + c);
    }

    public static int mnozenje(int a, int b) {
        int c = a * b;
        return c;
    }

}
