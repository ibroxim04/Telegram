package uz.pdp.backend.service.messageService;

import uz.pdp.backend.models.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageServiceImp implements MessageService {
    private List<Message> messageList;
    private static MessageServiceImp messageServiceImp;

    private MessageServiceImp() {
        this.messageList = new ArrayList<>();
    }

    public static MessageServiceImp getInstance() {
        if (messageServiceImp == null) {
            messageServiceImp = new MessageServiceImp();
        }

        return messageServiceImp;
    }

    @Override
    public boolean sendMessage(String message) {
        return false;
    }

    @Override
    public void create(Message message) {

    }

    @Override
    public Message get(String id) {
        return null;
    }

    @Override
    public List<Message> getList() {
        return List.of();
    }

    @Override
    public void update(Message newM) {

    }

    @Override
    public void delete(String id) {

    }
}
