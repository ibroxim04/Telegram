package uz.pdp.backend.service.groupChatService;

import uz.pdp.backend.models.GroupChat;

import java.util.ArrayList;
import java.util.List;

public class GroupChatServiceImp implements GroupChatService {
    private List<GroupChat> groupChats;

    public GroupChatServiceImp() {
        this.groupChats = new ArrayList<>();
    }

    @Override
    public void create(GroupChat groupChat) {

    }

    @Override
    public GroupChat get(String id) {
        return null;
    }

    @Override
    public List<GroupChat> getList() {
        return List.of();
    }

    @Override
    public void update(GroupChat newM) {

    }

    @Override
    public void delete(String id) {

    }
}
