package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int stanWody = 400;
    static int stanMleka = 540;
    static int stanNasionKawy = 120;
    static int stanKubkow = 9;
    static int gotowkaWAutomacie = 550;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        boolean dziala = true;
        while (dziala) {
            System.out.println("Write action (buy, fill, take,remaining, exit): ");
            String czynnosc = scanner.next();

            switch (czynnosc) {
                case "buy":
                    buy();

                    break;

                case "take":
                    take();
                    break;

                case "fill":
                    fill();
                    break;

                case "exit":
                    dziala = false;
                    break;

                case "remaining":
                    stanMaszyny();
                    break;

                default:

                    System.out.println("podano zla wartosc");
                    break;


            }


        }


    }

    public static void stanMaszyny() {

        System.out.println("The coffee machine has:\n" +
                stanWody + " of water\n" +
                stanMleka + " of milk\n" +
                stanNasionKawy + " of coffee beans\n" +
                stanKubkow + " of disposable cups\n" +
                gotowkaWAutomacie + " of money\n");


    }

    public static void fill() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add: \n");
        int ileDodacWody = scanner.nextInt();
        stanWody = stanWody + ileDodacWody;
        System.out.println("Write how many ml of milk do you want to add: \n");
        int ileDodacMleka = scanner.nextInt();
        stanMleka = stanMleka + ileDodacMleka;
        System.out.println("Write how many grams of coffee beans do you want to add: \n");
        int ileDodacNasionKawy = scanner.nextInt();
        stanNasionKawy = stanNasionKawy + ileDodacNasionKawy;
        System.out.println("Write how many disposable cups of coffee do you want to add: \n");
        int ileDodacKubkow = scanner.nextInt();
        stanKubkow = stanKubkow + ileDodacKubkow;


    }

    public static void take() {

        System.out.println(" I gave you $" + gotowkaWAutomacie);
        gotowkaWAutomacie = 0;


    }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        Scanner scanner = new Scanner(System.in);
        String wybor = scanner.next();
        switch (wybor) {
            case "1":
                if (stanKubkow < 1) {
                    System.out.println("Sorry, not enough cup!");
                } else if (stanWody < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (stanNasionKawy < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else {
                    stanKubkow = stanKubkow - 1;
                    stanWody = stanWody - 250;
                    stanNasionKawy = stanNasionKawy - 16;
                    gotowkaWAutomacie = gotowkaWAutomacie + 4;
                    System.out.println("I have enough resources, making you a coffee!");
                }

                break;

            case "2":
                if (stanKubkow < 1) {
                    System.out.println("Sorry, not enough cup!");
                } else if (stanWody < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (stanNasionKawy < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (stanMleka < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else {
                    stanKubkow = stanKubkow - 1;
                    stanWody = stanWody - 350;
                    stanMleka = stanMleka - 75;
                    stanNasionKawy = stanNasionKawy - 20;
                    gotowkaWAutomacie = gotowkaWAutomacie + 7;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;

            case "3":
                if (stanKubkow < 1) {
                    System.out.println("Sorry, not enough cup!");
                } else if (stanWody < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (stanNasionKawy < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (stanMleka < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else {
                    stanKubkow = stanKubkow - 1;
                    stanWody = stanWody - 200;
                    stanMleka = stanMleka - 100;
                    stanNasionKawy = stanNasionKawy - 12;
                    gotowkaWAutomacie = gotowkaWAutomacie + 6;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;

            case "back":
                break;

            default:
                System.out.println("zly wybor");
                break;

        }


    }


}

