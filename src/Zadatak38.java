public class Zadatak38 {
    public static void main(String[] args) {

        //Zadatak 38 - Napraviti jednocifreni niz (od 1 do 9), zatim potrebno je napraviti drugi niz
//koji ce sadrzati prva tri parna broja prvog niza

        int[] niz1 = new int[9]; //Deklarisemo niz od 9 clanova
        for (int i = 0; i < niz1.length; i++) {
            niz1[i] = (i+1); //Posto u zadatku glasi da se ubace brojevi od 1 do 9
            //mogu da iskoristim 'i' da ubacim te brojeve u niz
        }

        //1 2 3 4 5 6 7 8 9

        int[] niz2 = new int[3]; //Novi niz mora da ima 3 clana
        int j = 0;
        for (int i = 0; i < niz1.length; i++) { //Svaki put kad moram da prodjem kroz niz, moram da koristim petlju
            if (niz1[i]%2==0) { //Trazim parne brojeve da ubacim u drugi niz
                niz2[j] = niz1[i]; //index leve strane mora da se razlikuje od indexa desne strane
                // inace ce da se brojevi u drugom nizu ubace
                //na istu poziciju kao u prvom nizu ovako:
                //1 2 3 4 5 6 7 8 9
                //0 2 0 4 0 6 0 8 0
                //zato uvodim promenljivu 'j' koja ce krenuti od 0 i povecati se samo kada se pronadje
                //broj deljiv sa 2
                j++;
            }
            if (j > 2) { //Bez ovog uslova program ce nastaviti da trazi brojeve deljive sa 2
                //i trazice da ih ubaci u drugi niz iako je drugi niz popunjen
                break;
            }
        }

        System.out.println("Prvi niz:");
        for (int i = 0; i < niz1.length; i++) {
            System.out.println(niz1[i]);
        }
        System.out.println("Drugi niz");
        for (int i = 0; i < niz2.length; i++) {
            System.out.println(niz2[i]);
        }

    }
}
