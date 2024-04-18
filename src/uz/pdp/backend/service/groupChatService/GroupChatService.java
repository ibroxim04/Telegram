package uz.pdp.backend.service.groupChatService;

import uz.pdp.backend.models.GroupChat;
import uz.pdp.backend.models.User;
import uz.pdp.backend.service.BaseService;

public interface GroupChatService extends BaseService<GroupChat> {
    void createGroup(String title, int numberOfUsers);

    User addUser(String id);

    User deleteUser(String id);
}
