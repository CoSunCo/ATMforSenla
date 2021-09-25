package eu.senla.atm;

import java.io.*;
import java.util.*;

public class BankATM {

    private final Reader inputStreamReader = new InputStreamReader(System.in);
    private final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    private Pin pin;

    public void enterCardNumber() throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        pin = new Pin();
        System.out.println("Enter card details from 16 numbers");

        String name = bufferedReader.readLine();
        if (name.length() != 16) {
            System.out.println("Incorrect number entered, please enter again");
            enterCardNumber();
        }
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stringBuffer.append(chars[i]);
            if ((i + 1) % 4 == 0) {
                stringBuffer.append("-");
            }
        }
        System.out.println(" Your card number :" + stringBuffer.substring(0, 19));

        pin.enterPin();
    }
}

