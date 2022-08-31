import java.util.ArrayList;

public class Zadatak54B {
    public static void main(String[] args) {

        //Napisati program koji ce proveriti da li lista ima paran broj

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(3);
        lista1.add(5);
        lista1.add(7);

        lista2.add(11); // false // false
        lista2.add(15); // false // false
        lista2.add(16); // true // true
        lista2.add(21); // ne gleda zbog break-a // false

        System.out.println("Da li lista1 ima barem jedan paran broj?");
        System.out.println(provera1(lista1));

        System.out.println("Da li lista2 ima barem jedan paran broj?");
        System.out.println(provera1(lista2));


    }

    public static boolean provera1(ArrayList<Integer> lista) {

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)%2==0) {
                return true;
            }
        }
        return false;
    }

    public static boolean provera2(ArrayList<Integer> lista) {

        boolean paranBroj = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)%2==0) {
                paranBroj = true;
                break;
            }
        }
        return paranBroj;
    }


}
