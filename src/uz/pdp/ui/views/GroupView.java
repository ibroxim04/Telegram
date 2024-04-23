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

public class GroupView {
    private static User curUser;
    private static GroupChatService groupChatService = GroupChatServiceImp.getInstance();
    private static UserService userService = UserServiceImp.getInstance();
    private static UserGroupService userGroupService = UserGroupServiceImp.getInstance();

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
        showGroups();
        String groupId = ScanUtil.strScanner("Choose the group to change: ");
        for (GroupChat groupChat : groupChatService.getList()) {
            if (groupChat.getId().equals(groupId)) {
                ChangeGroupView.changeGroupMenu(curUser, groupChat);
            }
        }
    }

    private static void deleteGroup() {
        showGroups();
        String id = ScanUtil.strScanner("Enter the Id of the group you want to delete: ");
        GroupChat delete = groupChatService.delete(id);
        if (delete == null) {
            System.out.println("Something went wrong!");
        } else {
            System.out.println("Group deleted!");
        }
    }

    private static void openGroup() {
        showGroups();
        String id = ScanUtil.strScanner("Enter the Id of the group you want to open: ");
        for (GroupChat groupChat : groupChatService.getList()) {
            if (groupChat.getId().equals(id)) {
                GroupMessageView.groupMessageMenu(groupChat);
                break;
            }
        }
    }

    private static void showGroups() {
        for (GroupChat groupChat : userGroupService.getListByUserId(curUser.getId())) {
            System.out.println(groupChat);
        }
    }

    private static void createGroup() {
        String name = ScanUtil.strScanner("Enter the name of the group: ");
        String groupId = groupChatService.createGroup(new GroupChat(name, curUser.getId()));
        userGroupService.getList().add(new UserGroup(curUser.getId(),groupId));
        AddView.addMenu(curUser,groupChatService.get(groupId));
    }
}
