package Tasks.Task1;
import java.util.Scanner;
public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input password");
        String a = scanner.next();
        switch (a) {
            case "qwerty123": {
                System.out.println("Successful");
                break;
            }

            case "admin": {
                System.out.println("Successful!(admin mode)");
                break;
            }
            default: {
                System.out.println("Wrong password");
                break;
            }

        }
    }
}
