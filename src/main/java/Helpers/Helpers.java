package Helpers;

import java.util.Scanner;

public class Helpers {

    public static String getStringFromUser () {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int getIntFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
