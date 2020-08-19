import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int x1,x2,y1,y2;
        Scanner scanner = new Scanner(System.in);


        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        if((x1==x2||y1==y2)||(Math.abs(x1-x2)==Math.abs(y1-y2)))
        {
            System.out.println("YES");

        }
        else
        {
            System.out.println("NO");
        }






    }
}