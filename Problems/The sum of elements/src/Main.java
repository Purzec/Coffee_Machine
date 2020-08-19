import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num;
        int suma = 0;
        do {
            num = scanner.nextInt();
            suma = suma + num;
        } while (num != 0);
        System.out.println(suma);
    }
}
