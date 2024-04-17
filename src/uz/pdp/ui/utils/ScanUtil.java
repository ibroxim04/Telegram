package uz.pdp.ui.utils;

import java.util.Scanner;

public interface ScanUtil {
    Scanner intScanner = new Scanner(System.in);
    Scanner strScanner = new Scanner(System.in);

    static int scanInt(String hint) {
        System.out.println(hint);
        return intScanner.nextInt();
    }

    static String scanString(String hint) {
        System.out.println(hint);
        return intScanner.nextLine();
    }
}
