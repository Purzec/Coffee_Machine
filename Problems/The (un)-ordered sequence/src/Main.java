import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here



        Scanner scanner = new Scanner(System.in);

        int liczbaBedacaPorownywana = scanner.nextInt();
        int liczbaDoPorownania;
        boolean stan = true;
        boolean rosnacy = false;
        boolean malejacy = false;

        while (true) {
            liczbaDoPorownania = scanner.nextInt();
            if (liczbaDoPorownania == 0) {
                break;
            } else if (liczbaBedacaPorownywana < liczbaDoPorownania) {

                rosnacy = true;

            } else if (liczbaBedacaPorownywana > liczbaDoPorownania) {

                malejacy = true;
            }
            liczbaBedacaPorownywana = liczbaDoPorownania;

        }

        if (malejacy == true && rosnacy == true) {
            System.out.println("false");

        } else {
            System.out.println("true");
        }
    }
}