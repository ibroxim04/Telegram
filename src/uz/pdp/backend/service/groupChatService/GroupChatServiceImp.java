package uz.pdp.backend.service.groupChatService;

import uz.pdp.backend.models.GroupChat;
import uz.pdp.backend.models.User;
import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImp;
import uz.pdp.ui.utils.ScanUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupChatServiceImp implements GroupChatService {
    private List<GroupChat> groupChats;
    private List<User> usersInGroup;
    private static GroupChatServiceImp groupChatServiceImp;
    private UserServiceImp userServiceImp = UserServiceImp.getInstance();
    private UserService userService = UserServiceImp.getInstance();

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
    public void createGroup() {
    }

    @Override
    public User addUser(String id) {
        for (int i = 0; i < userServiceImp.getUserList().size(); i++) {
            if (userServiceImp.getUserList().get(i).getId().equals(id)) {
                usersInGroup.add(userServiceImp.getUserList().get(i));
                return userServiceImp.getUserList().get(i);
            }
        }

        return null;
    }

    @Override
    public User deleteUser(String id) {
        for (int i = 0; i < usersInGroup.size(); i++) {
            if (usersInGroup.get(i).getId().equals(id)) {
                User temp = usersInGroup.get(i);
                usersInGroup.remove(i);
                return temp;
            }
        }

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
