package eu.senla.atm;

import java.io.IOException;

public class UI {

    public static void main(String[] args) throws IOException {
        BankATM bankATM = new BankATM();
        bankATM.enterCardNumber();
    }
}
