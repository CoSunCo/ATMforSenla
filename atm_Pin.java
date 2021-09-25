package eu.senla.atm;

import java.rmi.StubNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Pin {

    private final int[] correctPin = {1, 2, 3, 4};
    private ATMMenu menu;
    private Scanner input = new Scanner(System.in);
    private int count = 0;

    public void enterPin() {
        int[] pin = new int[4];
        System.out.println("Enter PIN (1,2,3,4)");

        String s = String.valueOf(input.nextInt());
        char[] chars = s.toCharArray();
        if (chars.length != 4) {
            System.out.println("Wrong pin entered");
        }
        for (int i = 0; i < chars.length; i++) {
            pin[i] = Character.getNumericValue(chars[i]);
        }
        checkPin(pin);
    }

    public void checkPin(int[] pin) {
        if (Arrays.equals(pin, correctPin)) {
            menu = new ATMMenu();
            menu.getItemMenu();
        } else {
            System.out.println(" Incorrect PIN-code input, re-enter the PIN-code ");
            count++;
            if (count == 3) {
                menu.returnCard();
            }
            enterPin();
        }
    }
}
