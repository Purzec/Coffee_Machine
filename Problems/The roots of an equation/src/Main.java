import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a,b,c,d;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        d=scanner.nextInt();

        for (int x =0 ; x <1000;x++)
        {
            if((a*x*x*x)+(b*x*x)+(c*x)+d==0)
            {
                System.out.println(x);
            }
        }
    }
}