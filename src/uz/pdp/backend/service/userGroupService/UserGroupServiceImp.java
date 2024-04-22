package uz.pdp.backend.service.userGroupService;

import uz.pdp.backend.models.UserGroup;

import java.util.List;

public class UserGroupServiceImp implements UserGroupService {
    private List<UserGroup> userGroups;

    @Override
    public void create(UserGroup userGroup) {

    }

    @Override
    public UserGroup get(String id) {
        return null;
    }

    @Override
    public List<UserGroup> getList() {
        return List.of();
    }

    @Override
    public void update(UserGroup newM) {

    }

    @Override
    public UserGroup delete(String id) {
        return null;
    }

    @Override
    public List<UserGroup> getListByUserId(String userId) {
        return List.of();
    }

    @Override
    public List<UserGroup> getListByGroupId(String groupId) {
        return List.of();
    }
}
