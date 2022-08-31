import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        //1. Napraviti program koji nalazi najveci broj u listi i vraca informaciju da li je taj najveci broj paran

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(6);
        lista.add(13);
        lista.add(16);
        lista.add(3);
        lista.add(11);

        int max = lista.get(0);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > max) {
                max = lista.get(i);
            }
        }
        System.out.println("Maksimalan broj je " + max);
        if (max%2==0) {
            System.out.println("Maksimalan broj je paran");
        } else {
            System.out.println("Maksimalan broj nije paran");
        }



    }
}
