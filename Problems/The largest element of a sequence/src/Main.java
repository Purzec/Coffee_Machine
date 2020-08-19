import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num;
        int najwieksza = 0;
        do {
            num = scanner.nextInt();
            if (najwieksza < num) {
                najwieksza = num;
            }
        } while (num != 0);
        System.out.println(najwieksza);
    }
}