package uz.pdp.backend.service.groupChatService;

import uz.pdp.backend.models.GroupChat;
import uz.pdp.backend.service.BaseService;

public interface GroupChatService extends BaseService<GroupChat> {
    void createGroup(String title, int numberOfUsers);

    void addUser(String id);

    void deleteUser(String id);
}
