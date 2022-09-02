package Helpers;

import java.util.Scanner;

public class UserInputHelpers {

    static Scanner scanner = new Scanner(System.in);

    public static String getStringFromUser() {
        return scanner.next();
    }

    public static int getIntFromUser() {
        return scanner.nextInt();
    }
}
