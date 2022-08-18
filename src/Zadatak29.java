import java.util.Scanner;

public class Zadatak29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String validUsername = "User";
        String validPassword = "Password123";
        boolean valid = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("Unesite username");
            String username = sc.next();
            System.out.println("Unesite password");
            String password = sc.next();

            if (password.equals(validPassword)) {
                if (username.equals(validUsername)) {
                    valid = true;
                    break;
                }
            } else {
                break;
            }
        }

        if (valid) {
            System.out.println("Uspesno ste se ulogovali");
        } else {
            System.out.println("Neuspesno logovanje");
        }

        System.out.println("Kraj programa");

    }
}
