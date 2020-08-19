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
        int pierwsza = 0;
        int druga = 0;

        int czegoSzukasz = scanner.nextInt();
        int obokCzegoToJest = scanner.nextInt();

        for (int i = 0; i < tablicaDoZadania.length; i++) {
            if (tablicaDoZadania[i] == czegoSzukasz) {
                pierwsza = i;
            }
            if (tablicaDoZadania[i] == obokCzegoToJest) {
                druga = i;
            }

        }
        if (pierwsza - druga < 2 && pierwsza - druga > -2) {
            System.out.println(true);

        } else {
            System.out.println(false);

        }

    }


}
