package uz.pdp.ui.views;

import uz.pdp.backend.models.User;
import uz.pdp.backend.service.groupChatService.GroupChatService;
import uz.pdp.backend.service.groupChatService.GroupChatServiceImp;
import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImp;
import uz.pdp.ui.utils.MenuUtils;
import uz.pdp.ui.utils.ScanUtil;

public class ChangeGroupView {
    private static User curUser;
    private static GroupChatService groupChatService = GroupChatServiceImp.getInstance();
    private static UserService userService = UserServiceImp.getInstance();

    public static void changeGroupMenu(User user) {
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
        groupChatService.getList();
        System.out.print("Enter the user you want to delete by ID: ");
        String id = ScanUtil.strScanner.nextLine();
        groupChatService.deleteUser(id);
    }

    private static void addUser() {
        userService.getList();
        System.out.println("Enter the user you want to add by ID: ");
        String id = ScanUtil.strScanner.nextLine();
        groupChatService.addUser(id);
    }
}
