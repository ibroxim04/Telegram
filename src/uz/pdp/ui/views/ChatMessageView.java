package uz.pdp.ui.views;

import uz.pdp.backend.models.Message;
import uz.pdp.backend.models.PrivateChat;
import uz.pdp.backend.service.messageService.MessageService;
import uz.pdp.backend.service.messageService.MessageServiceImp;
import uz.pdp.ui.utils.MenuUtils;
import uz.pdp.ui.utils.ScanUtil;

public class ChatMessageView {
    private static PrivateChat curChat;
    private static MessageService messageService = MessageServiceImp.getInstance();

    public static void chatMessageMenu(PrivateChat chat) {
        curChat = chat;
        if (curChat != null) {
            while (true) {
                int menu = MenuUtils.menu(MenuUtils.MESSAGE);
                switch (menu) {
                    case 1 -> {
                        sendMessage();
                    }
                    case 2 -> {
                        readMessages();
                    }
                    case 0 -> {
                        curChat = null;
                        return;
                    }
                    default -> {
                        System.out.println("Wrong number!");
                    }
                }
            }
        } else {
            System.out.println("Chat not found!");
        }
    }

    private static void readMessages() {
        messageService.readMessages();
    }

    private static void sendMessage() {
        String message = ScanUtil.strScanner("Enter the message: ");
        messageService.sendMessage(new Message(message, curChat.getFromId(), curChat.getId()));
        System.out.println("Sent!");
    }
}
