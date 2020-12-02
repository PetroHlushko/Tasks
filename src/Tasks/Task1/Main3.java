package Tasks.Task1;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число 'n'");
                int n=scanner.nextInt();
                if(n%2==0) {
                    System.out.println(n+" - парне число");
                } else {
                    System.out.println(n+" - непарне число");
                }
            }
        }
