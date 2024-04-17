package uz.pdp.backend.service.privateChatService;

import uz.pdp.backend.models.PrivateChat;

import java.util.ArrayList;
import java.util.List;

public class PrivateChatServiceImp implements PrivateChatService {
    private List<PrivateChat> privateChats;

    public PrivateChatServiceImp() {
        this.privateChats = new ArrayList<>();
    }

    @Override
    public void create(PrivateChat privateChat) {

    }

    @Override
    public PrivateChat get(String id) {
        return null;
    }

    @Override
    public List<PrivateChat> getList() {
        return List.of();
    }

    @Override
    public void update(PrivateChat newM) {

    }

    @Override
    public void delete(String id) {

    }
}
