import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        long wynik;
        if (m==0)
        {
            wynik=1;
        }
        else
        {  wynik = n;
            for (int i = 1; i < m; i++) {
                wynik = wynik * n;

            }}

        return wynik;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}