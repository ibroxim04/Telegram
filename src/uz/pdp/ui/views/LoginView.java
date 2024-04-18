package uz.pdp.ui.views;

import uz.pdp.backend.dto.LoginDto;
import uz.pdp.backend.enums.Role;
import uz.pdp.backend.models.User;
import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImp;
import uz.pdp.ui.utils.ScanUtil;

public class LoginView {
    private static UserService userService = UserServiceImp.getInstance();

    public static User login() {
        System.out.println("Enter login info:");
        String username = ScanUtil.scanString("Username: ");
        String password = ScanUtil.scanString("Password: ");
        return userService.login(new LoginDto(username, password));
    }

    public static void signUp() {
        String name = ScanUtil.scanString("Enter your name: ");
        Integer age = ScanUtil.scanInt("Enter your age: ");
        String username = ScanUtil.scanString("Enter your username: ");
        String password = ScanUtil.scanString("Enter your password: ");
        userService.signUp(new User(name,age,username,password, Role.USER));
        System.out.println("Signed up successfully!");
    }
}