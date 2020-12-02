package Tasks.Task1;
import java.util.Scanner;
public class Main2 {

    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        System.out.println("Input c");
        int c = scanner.nextInt();
        int D = (int) (Math.pow(b,2)-4*a*c);
        System.out.println(D);
        if (D > 0){
            double x1 = (-b+Math.sqrt(D))/2*a;
            double x2 = (-b-Math.sqrt(D))/2*a;
            System.out.println("X1 = " + x1 + " X2 = " + x2);
        }
        else if (D == 0){
            double x = (-b+Math.sqrt(D))/2*a;
            System.out.println("X = " + x);
        }
        else{
            System.out.println("Немає дійсних коренів");
        }
    }
}
