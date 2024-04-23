package uz.pdp.backend.service.userGroupService;

import uz.pdp.backend.models.GroupChat;
import uz.pdp.backend.models.User;
import uz.pdp.backend.models.UserGroup;
import uz.pdp.backend.service.BaseService;

import java.util.List;

public interface UserGroupService extends BaseService<UserGroup> {
    List<GroupChat> getListByUserId(String userId);

    List<User> getListByGroupId(String groupId);
}
