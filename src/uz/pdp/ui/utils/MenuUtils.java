package uz.pdp.ui.utils;

public interface MenuUtils {
    String LOGIN = "Login menu: \n1. Login \n2. Sign up \n0. Exit";
    String USER = "User menu: \n1. Chat menu \n2. Group menu \n0. Exit";
    String CHAT = "Chat menu: \n1. Create chat \n2. Show chats \n3. Open chat \n4. Delete chat \n0. Exit";
    String GROUP = "Group menu: \n1. Create group \n2. Show groups \n3. Open group chat \n4. Delete group chat \n0. Exit";

    static int menu(String menu) {
        System.out.println(menu);
        return ScanUtil.scanInt("Choose: ");
    }
}
