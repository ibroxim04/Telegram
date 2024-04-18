package uz.pdp.ui.views;

import uz.pdp.backend.models.User;
import uz.pdp.backend.service.privateChatService.PrivateChatService;
import uz.pdp.backend.service.privateChatService.PrivateChatServiceImp;
import uz.pdp.ui.utils.MenuUtils;

public class ChatView {
    private static User curUser;
    private static PrivateChatService privateChatService = PrivateChatServiceImp.getInstance();

    public static void chatMenu(User user) {
        curUser = user;
        while (true) {
            int menu = MenuUtils.menu(MenuUtils.CHAT);
            switch (menu) {
                case 1 ->{
                    createChat();
                }
                case 2 ->{
                    showChats();
                }
                case 3 ->{
                    openChat();
                }
                case 4 ->{
                    deleteChat();
                }
                case 0 ->{
                    curUser = null;
                    return;
                }
            }
        }
    }

    private static void deleteChat() {

    }

    private static void openChat() {

    }

    private static void showChats() {

    }

    private static void createChat() {

    }
}
