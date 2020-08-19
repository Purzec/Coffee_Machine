import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        double ile= scanner.nextInt();

        int procent=scanner.nextInt();
        float rzeczywista= (float) (procent*0.01);

        double koniec = scanner.nextInt();
        double koncowyPitos;
        int lata=0;
        if(koniec==ile)
        {

        }
        else
        {
            do {
                lata++;
                koncowyPitos=ile + ile*rzeczywista;
                ile=ile+ ile*rzeczywista;
            }while (koncowyPitos<koniec);
        }


        System.out.println(lata);

    }
}