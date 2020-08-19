
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String wprowadzaneLiczby = scanner.nextLine();


        String[] tablicaOddzielona = wprowadzaneLiczby.split(" ");
        String[] nowaTablica = new String[tablicaOddzielona.length];
        String bufor;
        int nowaLokalizacja;


        int oIlePrzesunac = scanner.nextInt();

        for (int i = 0; i < tablicaOddzielona.length; i++) {
            bufor = tablicaOddzielona[i];
            nowaLokalizacja = i + oIlePrzesunac;
            if (nowaLokalizacja >= tablicaOddzielona.length) {
                nowaLokalizacja = (i + oIlePrzesunac) % tablicaOddzielona.length;
                nowaTablica[nowaLokalizacja] = bufor;
            } else {
                nowaTablica[nowaLokalizacja] = bufor;
            }


        }
        for (int i = 0; i < nowaTablica.length; i++) {
            System.out.print(nowaTablica[i] + " ");
        }
    }
}