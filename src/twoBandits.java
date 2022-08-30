import java.util.Scanner;

public class twoBandits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int a1 = a - 1;
        int b1 = b - 1;
        System.out.print(b1 + " " + a1);
    }
}
