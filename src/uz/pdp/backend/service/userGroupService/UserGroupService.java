package uz.pdp.backend.service.userGroupService;

import uz.pdp.backend.models.UserGroup;
import uz.pdp.backend.service.BaseService;

import java.util.List;

public interface UserGroupService extends BaseService<UserGroup> {
    List<UserGroup> getListByUserId(String userId);

    List<UserGroup> getListByGroupId(String groupId);
}
