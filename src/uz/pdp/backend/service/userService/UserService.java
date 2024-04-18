package uz.pdp.backend.service.userService;

import uz.pdp.backend.dto.LoginDto;
import uz.pdp.backend.models.User;
import uz.pdp.backend.service.BaseService;

public interface UserService extends BaseService<User> {
    User login(LoginDto login);

    void signUp(User user);
    void showUsers(User user);
}
