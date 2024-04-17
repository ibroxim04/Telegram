package uz.pdp.backend.service.userService;

import uz.pdp.backend.dto.LoginDto;
import uz.pdp.backend.models.User;

import java.util.List;

public class UserServiceImp implements UserService {
    @Override
    public User login(LoginDto login) {
        return null;
    }

    @Override
    public void signUp(User user) {

    }

    @Override
    public void create(User user) {

    }

    @Override
    public User get(String id) {
        return null;
    }

    @Override
    public List<User> getList() {
        return List.of();
    }

    @Override
    public void update(User newM) {

    }

    @Override
    public void delete(String id) {

    }
}
