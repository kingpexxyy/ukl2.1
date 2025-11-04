package ukl;
import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan bilangan bulat positif: ");
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("bilangan harus positif!");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
            System.out.println("faktorial dari " + n + " adalah: " + faktorial);
        }

        input.close();
    }
}
