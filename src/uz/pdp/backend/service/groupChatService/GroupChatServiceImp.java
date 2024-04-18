package uz.pdp.backend.service.groupChatService;

import uz.pdp.backend.models.GroupChat;
import uz.pdp.backend.models.User;

import java.util.ArrayList;
import java.util.List;

public class GroupChatServiceImp implements GroupChatService {
    private List<GroupChat> groupChats;
    private List<User> usersInGroup;
    private static GroupChatServiceImp groupChatServiceImp;

    private GroupChatServiceImp() {
        this.groupChats = new ArrayList<>();
        this.usersInGroup = new ArrayList<>();
    }

    public static GroupChatServiceImp getInstance() {
        if (groupChatServiceImp == null) {
            groupChatServiceImp = new GroupChatServiceImp();
        }

        return groupChatServiceImp;
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

    @Override
    public void createGroup(String title, int numberOfUsers) {

    }

    @Override
    public void addUser(String id) {

    }

    @Override
    public void deleteUser(String id) {

    }
}
