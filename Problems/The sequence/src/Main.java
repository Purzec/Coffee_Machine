import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int liczbaPetli;

        int counter=0;
        liczbaPetli = scanner.nextInt();

        for (int numerPetli = 0 ; numerPetli <= liczbaPetli; numerPetli++) {
            for (int drukowanieCyfr = 0; drukowanieCyfr < numerPetli; drukowanieCyfr++) {

                if (counter < liczbaPetli)
                    System.out.print(numerPetli + " ");
                counter++;
            }
        }
    }
}