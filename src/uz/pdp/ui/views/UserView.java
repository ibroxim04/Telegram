package uz.pdp.ui.views;

import uz.pdp.backend.models.User;
import uz.pdp.ui.utils.MenuUtils;

public class UserView {
    private static User curUser;

    public static void profile(User user) {
        curUser = user;
        if (curUser != null) {
            while (true) {
                int menu = MenuUtils.menu(MenuUtils.USER);
                switch (menu) {
                    case 1 -> {
                        ChatView.chatMenu(curUser);
                    }
                    case 2 -> {
                        GroupView.groupMenu(curUser);
                    }
                    case 0 -> {
                        curUser = null;
                        System.out.println("Logged out");
                        return;
                    }
                    default -> {
                        System.out.println("Wrong number!");
                    }
                }
            }
        } else {
            System.out.println("User not found!");
        }
    }
}
