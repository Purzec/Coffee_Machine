import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String slowo= scanner.next();
        int poczatek=scanner.nextInt();
        int koniec=scanner.nextInt();

String noweSlowo= slowo.substring(poczatek,koniec+1);
        System.out.println(noweSlowo);
    }
}