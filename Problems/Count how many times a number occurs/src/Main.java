import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int lenght = scanner.nextInt();
        int[] tablicaDoZadania = new int[lenght];
        for (int i = 0; i < tablicaDoZadania.length; i++) {
            tablicaDoZadania[i] = scanner.nextInt();
        }


        int czegoSzukasz = scanner.nextInt();
        int counter = 0;
        for (int poszukiwanaLiczba : tablicaDoZadania) {
            if (poszukiwanaLiczba == czegoSzukasz) {
                counter++;
            }

        }

        System.out.println(counter);


    }
}