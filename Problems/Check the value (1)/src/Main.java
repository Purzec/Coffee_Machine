import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int liczba = scanner.nextInt();

        boolean result =  liczba> 0 && liczba <10;

        System.out.println(result);
    }
}