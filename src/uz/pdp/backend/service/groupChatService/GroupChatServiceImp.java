package uz.pdp.backend.service.groupChatService;

import uz.pdp.backend.models.GroupChat;
import uz.pdp.backend.models.User;
import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImp;

import java.util.ArrayList;
import java.util.List;

public class GroupChatServiceImp implements GroupChatService {
    private List<GroupChat> groupChats;
    private static GroupChatServiceImp groupChatServiceImp;
    private UserServiceImp userServiceImp = UserServiceImp.getInstance();
    private UserService userService = UserServiceImp.getInstance();

    private GroupChatServiceImp() {
        this.groupChats = new ArrayList<>();
    }

    public static GroupChatServiceImp getInstance() {
        if (groupChatServiceImp == null) {
            groupChatServiceImp = new GroupChatServiceImp();
        }

        return groupChatServiceImp;
    }

    @Override
    public void create(GroupChat groupChat) {
        groupChats.add(groupChat);
    }

    @Override
    public GroupChat get(String id) {
        for (int i = 0; i < groupChats.size(); i++) {
            if (groupChats.get(i).getId().equals(id)) {
                return groupChats.get(i);
            }
        }
        return null;
    }

    @Override
    public ArrayList<GroupChat> getList() {
        return (ArrayList<GroupChat>) groupChats;
    }

    @Override
    public void update(GroupChat newM) {

    }

    @Override
    public GroupChat delete(String id) {
        for (int i = 0; i < groupChats.size(); i++) {
            if (groupChats.get(i).getId().equals(id)) {
                GroupChat temp = groupChats.get(i);
                groupChats.get(i).setDeleted(true);
                return temp;
            }
        }
        return null;
    }

    @Override
    public String createGroup(GroupChat groupChat) {
        groupChats.add(groupChat);
        return groupChat.getId();
    }

    @Override
    public User addUser(String id) {
        return null;
    }

    @Override
    public User deleteUser(String id) {
        return null;
    }

    @Override
    public void showGroupChats() {
        for (GroupChat groupChat : groupChats) {
            if (!groupChat.getDeleted()) {
                System.out.println(groupChat);
            }
        }
    }
}
