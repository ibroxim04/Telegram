package uz.pdp.ui.views;

import uz.pdp.backend.models.GroupChat;
import uz.pdp.backend.models.User;
import uz.pdp.backend.models.UserGroup;
import uz.pdp.backend.service.userGroupService.UserGroupService;
import uz.pdp.backend.service.userGroupService.UserGroupServiceImp;
import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImp;
import uz.pdp.ui.utils.MenuUtils;
import uz.pdp.ui.utils.ScanUtil;

public class AddView {
    private static User curUser;
    private static GroupChat curChat;
    private static UserService userService = UserServiceImp.getInstance();
    private static UserGroupService userGroupService = UserGroupServiceImp.getInstance();

    public static void addMenu(User user, GroupChat groupChat) {
        curUser = user;
        curChat = groupChat;
        while (true) {
            int menu = MenuUtils.menu(MenuUtils.ADDUSER);
            switch (menu) {
                case 1 -> {
                    addUser();
                }
                case 0-> {
                    return;
                }
            }
        }
    }
    private static void addUser() {
        showUsers(curUser);
        String id = ScanUtil.strScanner("Choose the user to add: ");
        userGroupService.getList().add(new UserGroup(id, curChat.getId()));
        System.out.println("User added!");
    }
    private static void showUsers(User user) {
        for (User user1 : userService.getList()) {
            if (!user1.equals(user)) {
                System.out.println(user1);
            }
        }
    }
}
