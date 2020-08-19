import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long wynik = 1l;
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        int liczbaWykonan = b - a;
        for (int i = 0; i < liczbaWykonan; i++, a++) {
            wynik = (wynik) * a;

        }
        System.out.println(wynik);
    }
}