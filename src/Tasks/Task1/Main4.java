package Tasks.Task1;
import java.util.Scanner;
public class Main4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число m");
        int m = scanner.nextInt();
        System.out.println("Введіть число n");
        int n = scanner.nextInt();
        int a = 10;
        if (a - n > a - m){
            System.out.println(m+" - є блище до 10");
        }
        else if (a - n == a - m){
            System.out.println(n+" і "+n+ " однаково близько до 10");
        }else{
            System.out.println(n+" - є блище до 10");
        }
    }
}
