import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long pierwszaWartosc = scanner.nextLong();
        String operacja = scanner.next();
        long drugaWartosc = scanner.nextLong();


        switch (operacja) {
            case "+":
                System.out.println(pierwszaWartosc + drugaWartosc);
                break;
            case "-":
                System.out.println(pierwszaWartosc - drugaWartosc);
                break;
            case "/":
                if (drugaWartosc != 0) {
                    System.out.println(pierwszaWartosc / drugaWartosc);
                } else
                    System.out.println("Division by 0!");
                break;

            case "*":
                System.out.println(pierwszaWartosc * drugaWartosc);
                break;

            default:
                System.out.println("Unknown operator");
                break;


        }


    }
}