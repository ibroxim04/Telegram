package uz.pdp.ui.views;

import uz.pdp.backend.models.PrivateChat;
import uz.pdp.backend.models.User;
import uz.pdp.backend.service.privateChatService.PrivateChatService;
import uz.pdp.backend.service.privateChatService.PrivateChatServiceImp;
import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImp;
import uz.pdp.ui.utils.MenuUtils;
import uz.pdp.ui.utils.ScanUtil;

public class ChatView {
    private static User curUser;
    private static PrivateChatService privateChatService = PrivateChatServiceImp.getInstance();
    private static UserService userService = UserServiceImp.getInstance();

    public static void chatMenu(User user) {
        curUser = user;
        while (true) {
            int menu = MenuUtils.menu(MenuUtils.CHAT);
            switch (menu) {
                case 1 -> {
                    createChat();
                }
                case 2 -> {
                    showChats();
                }
                case 3 -> {
                    openChat();
                }
                case 4 -> {
                    deleteChat();
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

    private static void deleteChat() {
        showChats();
        String chat = ScanUtil.strScanner("Choose chat to delete by ID: ");
        PrivateChat delete = privateChatService.delete(chat);
        if (delete != null) {
            System.out.println("Deleted successfully!");
        } else {
            System.out.println("Not deleted, something went wrong!");
        }
    }

    private static void openChat() {
        showChats();
        String chat = ScanUtil.strScanner("Choose the chat by ID: ");
        PrivateChat privateChat = privateChatService.get(chat);
        ChatMessageView.chatMessageMenu(privateChat);
    }

    private static void showChats() {
        for (PrivateChat privateChat : privateChatService.getList()) {
            if (curUser.getId().equals(privateChat.getFromId()) || curUser.getId().equals(privateChat.getToId())) {
                System.out.println(privateChat);
            }
        }
    }

    private static void createChat() {
        userService.showUsers();
        String toId = ScanUtil.strScanner("Which user do you want to write? Enter ID: ");
        User toUser = null;
        for (User user : userService.getList()) {
            if (user.getId().equals(toId)) {
                toUser = user;
                break;
            }
        }
        privateChatService.create(new PrivateChat(toUser.getUserName(),curUser.getId(),toUser.getId()));
    }
}
