package uz.pdp.ui.views;

import uz.pdp.backend.models.User;
import uz.pdp.ui.utils.MenuUtils;

public class GroupView {
    private static User curUser;

    public static void groupMenu(User user) {
        curUser = user;
        int menu = MenuUtils.menu(MenuUtils.GROUP);
    }
}
