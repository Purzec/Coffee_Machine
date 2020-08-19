import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int liczba = scanner.nextInt();
        boolean wekend = scanner.nextBoolean();

        boolean result = ((liczba >= 10) && (liczba <= 20) && wekend == false) || ((liczba >= 15) && (liczba <= 25) && wekend == true);
        System.out.println(result);
    }
}