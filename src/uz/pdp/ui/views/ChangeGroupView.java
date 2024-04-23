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

import java.util.ArrayList;
import java.util.List;

public class ChangeGroupView {
    private static User curUser;
    private static GroupChat curChat;
    private static GroupChatService groupChatService = GroupChatServiceImp.getInstance();
    private static UserService userService = UserServiceImp.getInstance();
    private static UserGroupService userGroupService = UserGroupServiceImp.getInstance();

    public static void changeGroupMenu(User user, GroupChat groupChat) {
        curUser = user;
        while (true) {
            int menu = MenuUtils.menu(MenuUtils.CHANGEGROUP);
            switch (menu) {
                case 1 -> {
                    addUser();
                }
                case 2 -> {
                    deleteUser();
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

    private static void deleteUser() {
        for (User user : userGroupService.getListByGroupId(curChat.getId())) {
            if (!user.equals(curUser)) {
                System.out.println(user);
            }
        }
        String id = ScanUtil.strScanner("Choose the user to delete: ");

        for (int i = 0; i < userGroupService.getList().size(); i++) {
            if (userGroupService.getList().get(i).getUserId().equals(id) && userGroupService.getList().get(i).getGroupId().equals(curChat.getId())) {
                userGroupService.getList().remove(i);
            }
        }
    }

    private static void addUser() {
        userService.showUsers();
        String id = ScanUtil.strScanner("Enter the Id of the user to add: ");
        for (User user : userService.getList()) {
            if (user.getId().equals(id)) {
                userGroupService.getList().add(new UserGroup(id, curChat.getId()));
            }
        }
    }
}
