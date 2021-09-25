package eu.senla.atm;

import java.util.Scanner;

public class ATMMenu {

    private int balance = 500;
    private Scanner input = new Scanner(System.in);

    public void getItemMenu() {
        printMenu();
        Scanner input = new Scanner(System.in);

        switch (input.nextInt()) {
            case 1:
                checkBalance();
                break;
            case 2:
                getCash();
                break;
            case 3:
                putMoney();
                break;
            case 4:
                returnCard();
                break;
        }
    }

    public void printMenu() {
        System.out.print("1. Check balance");
        System.out.print("2. Withdraw funds from the account");
        System.out.println("3. Top up balance");
        System.out.println("4. Return card");
    }

    public void checkBalance() {
        System.out.println("The balance of your personal account is: "+ balance +" you go to the main menu ");
        getItemMenu();
    }

    public void getCash() {
        System.out.println(" How much do you want to rent?");
        int moneyFromATM = input.nextInt();
        if (moneyFromATM <= balance) {
            System.out.println("You getting " + moneyFromATM);
            balance = balance - moneyFromATM;
            getItemMenu();
        }
        System.out.println(" Too little money on the card");
        getItemMenu();
    }

    public void putMoney() {
        System.out.println(" Enter the top-up amount ");
        int moneyToATM = input.nextInt();
        balance = balance + moneyToATM;
        System.out.println("Your personal account balance is equal to " + balance);
        getItemMenu();
    }

    public void returnCard() {
        System.out.println("Take your card ");
    }
}
