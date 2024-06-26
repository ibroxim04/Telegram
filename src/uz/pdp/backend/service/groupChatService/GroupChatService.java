package uz.pdp.backend.service.groupChatService;

import uz.pdp.backend.models.GroupChat;
import uz.pdp.backend.models.User;
import uz.pdp.backend.service.BaseService;

public interface GroupChatService extends BaseService<GroupChat> {
    String createGroup(GroupChat groupChat);

    User addUser(String id);

    User deleteUser(String id);
    void showGroupChats();
}
