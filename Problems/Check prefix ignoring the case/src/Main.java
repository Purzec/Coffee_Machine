import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String slowoDoSprawdzenia = scanner.next();

        String slowoDoSprawdzenia2 = slowoDoSprawdzenia.toLowerCase();

        if(slowoDoSprawdzenia2.startsWith("j"))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}