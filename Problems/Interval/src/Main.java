import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int liczbaDoSprawdzenia = scanner.nextInt();
        if (liczbaDoSprawdzenia > -15 && liczbaDoSprawdzenia <= 12
                || liczbaDoSprawdzenia > 14 && liczbaDoSprawdzenia < 17
                || liczbaDoSprawdzenia >= 19) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }

    }
}