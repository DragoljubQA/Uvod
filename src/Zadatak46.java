import java.util.Scanner;

public class Zadatak46 {
    public static void main(String[] args) {

        //Zadatak 46) U main metodi preko skenera uneti ime korisnika i godiste rodjenja.
        // U drugoj metodi stampati ime uz dobrodoslicu i da li moze da polaze za vozacku dozvolu.
        // Samo izmedju 18-65 mogu da polazu za vozacku dozvolu

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime");
        String ime = sc.next();

        System.out.println("Unesite godiste");
        int godiste = sc.nextInt();

        System.out.println("Dobrodosli/a " + ime);

        //-----------------

        // 1. nacin
        prosledjivanjeGodina(godiste); //Metodi za izracunavanje godina prosledjujem godiste (ako prosledim 2000. godiste, resenje ove metode ce biti 2022 - 2000 = 22)
        //sto znaci da VREDNOST prethodne linije koda je 22
        proveraGodina(prosledjivanjeGodina(godiste)); //Resenje prethodne metode prosledjujem metodi za proveru da li
        //korisnik ima 18 godina (odnosno prosledjujem broj 22)
        System.out.println(proveraGodina(prosledjivanjeGodina(godiste))); //Stampam resenje true (jer 22 > 18)

        //2. nacin
        int x = prosledjivanjeGodina(godiste); //Metodi za izracunavanje godina prosledjujem godiste i to resenje
        //cu zapamtiti pod promenljivu x
        boolean y = proveraGodina(x); //Metodi za proveru da li korisnik ima 18 godina prosledjujem promenljivu x
        //i resenje cu zapamtiti pod promenljivu y
        System.out.println(y); //Stampam resenje

        //Pokrenuo sam stampu jer ove metode nemaju u njima system out print
        //Odstampao sam boolean metodu, ona zahteva da joj se prosledi neki integer
        //Taj integer koji sam prosledio je iz druge metode 'prosledjivanjeGodina'
        //I toj metodi je potrebno prosledjivanje nekog integera
        //Koji sam prosledio iz skenera


    }

    public static int prosledjivanjeGodina(int godinaRodjenja) {
        int x;
        x = 2022 - godinaRodjenja;
        return x;
    }

    public static boolean proveraGodina(int godine) {

        boolean provera;

        if (godine >= 18) {
            provera = true;
            return provera;
        } else {
            provera = false;
            return provera;
        }

    }

}
