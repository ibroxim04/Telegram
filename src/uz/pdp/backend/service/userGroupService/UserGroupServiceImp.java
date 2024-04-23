package uz.pdp.backend.service.userGroupService;

import uz.pdp.backend.models.GroupChat;
import uz.pdp.backend.models.User;
import uz.pdp.backend.models.UserGroup;
import uz.pdp.backend.service.groupChatService.GroupChatService;
import uz.pdp.backend.service.groupChatService.GroupChatServiceImp;
import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImp;

import java.util.ArrayList;
import java.util.List;

public class UserGroupServiceImp implements UserGroupService {
    private static UserGroupService userGroupService;
    private static GroupChatService groupChatService = GroupChatServiceImp.getInstance();
    private static UserService userService = UserServiceImp.getInstance();
    private List<UserGroup> userGroups;

    private UserGroupServiceImp() {
        this.userGroups = userGroups = new ArrayList<>();
    }

    public static UserGroupService getInstance() {
        if (userGroupService == null) {
            userGroupService = new UserGroupServiceImp();
        }

        return userGroupService;
    }

    @Override
    public void create(UserGroup userGroup) {
        userGroups.add(userGroup);
    }

    @Override
    public UserGroup get(String id) {
        for (UserGroup userGroup : userGroups) {
            if (userGroup.getId().equals(id)) {
                return userGroup;
            }
        }
        return null;
    }

    @Override
    public List<UserGroup> getList() {
        return userGroups;
    }

    @Override
    public void update(UserGroup newM) {

    }

    @Override
    public UserGroup delete(String id) {
        return null;
    }

    @Override
    public List<GroupChat> getListByUserId(String userId) {
        List<String> groupIds = new ArrayList<>();
        List<GroupChat> groups = new ArrayList<>();

        for (UserGroup userGroup : userGroups) {
            if (userGroup.getUserId().equals(userId)) {
                groupIds.add(userGroup.getGroupId());
            }
        }

        for (GroupChat groupChat : groupChatService.getList()) {
            for (String groupId : groupIds) {
                if (groupChat.getId().equals(groupId)) {
                    groups.add(groupChat);
                }
            }
        }

        return groups;
    }

    @Override
    public List<User> getListByGroupId(String groupId) {
        List<User> users = new ArrayList<>();
        List<String> userIds = new ArrayList<>();

        for (UserGroup userGroup : userGroups) {
            if (userGroup.getGroupId().equals(groupId)) {
                userIds.add(userGroup.getUserId());
            }
        }

        for (User user : userService.getList()) {
            for (String userId : userIds) {
                if (user.getId().equals(userId)) {
                    users.add(user);
                }
            }
        }

        return users;
    }
}
