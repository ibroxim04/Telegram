package uz.pdp.ui.views;

import uz.pdp.backend.models.GroupChat;
import uz.pdp.backend.models.User;
import uz.pdp.backend.service.groupChatService.GroupChatService;
import uz.pdp.backend.service.groupChatService.GroupChatServiceImp;
import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImp;
import uz.pdp.ui.utils.MenuUtils;
import uz.pdp.ui.utils.ScanUtil;

public class GroupView {
    private static User curUser;
    private static GroupChatService groupChatService = GroupChatServiceImp.getInstance();
    private static UserService userService = UserServiceImp.getInstance();

    public static void groupMenu(User user) {
        curUser = user;
        while (true) {
            int menu = MenuUtils.menu(MenuUtils.GROUP);
            switch (menu) {
                case  1 ->{
                    createGroup();
                }
                case  2 ->{
                    showGroups();
                }
                case  3 ->{
                    openGroup();
                }
                case  4 ->{
                    changeGroup();
                }
                case  5 ->{
                    deleteGroup();
                }
                case  0 ->{
                    curUser = null;
                    return;
                }
                default ->{
                    System.out.println("Wrong number!");
                }
            }
        }
    }

    private static void changeGroup() {
        ChangeGroupView.changeGroupMenu(curUser);
    }

    private static void deleteGroup() {
        showGroups();
        System.out.print("Enter the ID of the group you want to delete: ");
        String id = ScanUtil.strScanner.nextLine();
        groupChatService.delete(id);
    }

    private static void openGroup() {
        showGroups();
        System.out.print("Enter the ID of the group: ");
        String id = ScanUtil.strScanner.nextLine();
        GroupChat groupChat = groupChatService.get(id);
        GroupMessageView.groupMessageMenu(groupChat);
    }

    private static void showGroups() {
        groupChatService.getList();
    }

    private static void createGroup() {
        System.out.print("Enter the title of the group: ");
        String title = ScanUtil.strScanner.nextLine();
        System.out.println("Enter the number of users: ");
        int numberOfUsers = ScanUtil.intScanner.nextInt();
        groupChatService.createGroup(title,numberOfUsers);
    }
}
