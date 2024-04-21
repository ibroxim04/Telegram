package uz.pdp.ui.utils;

import java.util.Scanner;

public interface ScanUtil {
    Scanner scannerStr = new Scanner(System.in);
    Scanner scannerInt = new Scanner(System.in);
      static String strScanner(String hint) {
        System.out.print(hint);
        return scannerStr.nextLine();
     }

     static int intScanner(String message) {
        System.out.print(message);
        while (!scannerInt.hasNextInt()) {
            System.out.print("\u001B[31m\t Invalid format! \n Please enter an integer\u001B[0m: ");
            scannerInt.next();
        }
        return scannerInt.nextInt();
    }
}
