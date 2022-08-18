public class Zadatak18 {
    public static void main(String[] args) {

        //Zadatak 18) Napisati program koji ce pomnoziti sve brojeve izmedju 30 i 45 koji su deljivi sa 3

        int mnozenje = 1;

        for (int i = 30; i <= 45; i++) {
            if (i%3==0) {
                mnozenje = mnozenje * i;
            }
        }

        System.out.println(mnozenje);


    }
}
