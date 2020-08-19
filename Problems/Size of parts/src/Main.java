import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here


        int rozmiarPetli;

        Scanner scanner = new Scanner(System.in);
        rozmiarPetli = scanner.nextInt();
        int zaDuze = 0, zaMale = 0, idealne = 0, rozmiar = 0;
        for (int i = 0; i < rozmiarPetli; i++) {


            rozmiar = scanner.nextInt();
            if (rozmiar == 0) {
                idealne++;

            } else if (rozmiar > 0) {
                zaDuze++;

            } else if (rozmiar < 0) {
                zaMale++;

            }


        }
        System.out.println(idealne + " " + zaDuze + " " + zaMale);


    }

}
