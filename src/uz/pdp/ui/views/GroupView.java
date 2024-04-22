package uz.pdp.ui.views;

import uz.pdp.backend.models.GroupChat;
import uz.pdp.backend.models.User;
import uz.pdp.backend.models.UserGroup;
import uz.pdp.backend.service.groupChatService.GroupChatService;
import uz.pdp.backend.service.groupChatService.GroupChatServiceImp;
import uz.pdp.backend.service.userGroupService.UserGroupService;
import uz.pdp.backend.service.userGroupService.UserGroupServiceImp;
import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImp;
import uz.pdp.ui.utils.MenuUtils;
import uz.pdp.ui.utils.ScanUtil;

public class GroupView {
    private static User curUser;
    private static GroupChatService groupChatService = GroupChatServiceImp.getInstance();
    private static UserService userService = UserServiceImp.getInstance();
    private static UserGroupService userGroupService = new UserGroupServiceImp();

    public static void groupMenu(User user) {
        curUser = user;
        while (true) {
            int menu = MenuUtils.menu(MenuUtils.GROUP);
            switch (menu) {
                case 1 -> {
                    createGroup();
                }
                case 2 -> {
                    showGroups();
                }
                case 3 -> {
                    openGroup();
                }
                case 4 -> {
                    changeGroup();
                }
                case 5 -> {
                    deleteGroup();
                }
                case 0 -> {
                    curUser = null;
                    return;
                }
                default -> {
                    System.out.println("Wrong number!");
                }
            }
        }
    }

    private static void changeGroup() {
    }

    private static void deleteGroup() {
    }

    private static void openGroup() {
    }

    private static void showGroups() {
    }

    private static void createGroup() {
    }
}
