import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int liczbaDoSkanowania;

        while (true) {
            liczbaDoSkanowania = scanner.nextInt();
            if (liczbaDoSkanowania == 0) {
                break;
            } else if (liczbaDoSkanowania % 2 == 0) {
                System.out.println("even");
            } else if (liczbaDoSkanowania % 2 != 0) {
                System.out.println("odd");
            }

        }


        // put your code here
    }
}