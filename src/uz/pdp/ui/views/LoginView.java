package uz.pdp.ui.views;

import uz.pdp.backend.dto.LoginDto;
import uz.pdp.backend.enums.Role;
import uz.pdp.backend.models.User;
import uz.pdp.backend.service.userService.UserService;
import uz.pdp.backend.service.userService.UserServiceImp;
import uz.pdp.ui.utils.ScanUtil;

import java.util.Scanner;

public class LoginView {
    private static UserService userService = UserServiceImp.getInstance();

    public static User login() {
        System.out.println("Enter login info:");
        System.out.print("Username: ");
        String username = ScanUtil.strScanner.nextLine();
        System.out.print("Password: ");
        String password = ScanUtil.strScanner.nextLine();
        return userService.login(new LoginDto(username, password));
    }

    public static void signUp() {
        System.out.println("Enter your name: ");
        String name = ScanUtil.strScanner.nextLine();
        System.out.println("Enter your age: ");
        Integer age = ScanUtil.intScanner.nextInt();
        System.out.println("Enter your username: ");
        String username = ScanUtil.strScanner.nextLine();
        System.out.println("Enter your password: ");
        String password = ScanUtil.strScanner.nextLine();
        userService.signUp(new User(name,age,username,password, Role.USER));
        System.out.println("Signed up successfully!");
    }
}
