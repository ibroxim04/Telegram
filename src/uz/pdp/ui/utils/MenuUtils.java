package uz.pdp.ui.utils;

public interface MenuUtils {
    String LOGIN = "Login menu: \n1. Login \n2. Sign up \n0. Exit";

    static int menu(String menu) {
        System.out.println(menu);
        return ScanUtil.scanInt("Choose: ");
    }
}
