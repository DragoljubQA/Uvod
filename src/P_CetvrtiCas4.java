public class P_CetvrtiCas4 {
    public static void main(String[] args) {

        int suma = 0;
        for (int i = 0; i <= 10; i++) {
            //0
            //0+1
            //0+1+2
            //0+1+2+3...
            System.out.println("Suma pre dodavanja " + suma);
            System.out.println("Broj za dodavanje je " + i);
            suma = suma + i;
            System.out.println("Suma posle dodavanja " + suma);
            System.out.println("--------------");
        }

        //----------------------

        int mnozenje = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Proizvod pre mnozenja " + mnozenje);
            System.out.println("Broj za mnozenje " + i);
            mnozenje = mnozenje * i;
            System.out.println("Proizvod posle mnozenja " + mnozenje);
            //System.out.println("===========");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
        }


    }
}
