import uz.pdp.backend.enums.Role;
import uz.pdp.backend.models.User;
import uz.pdp.ui.utils.MenuUtils;
import uz.pdp.ui.views.LoginView;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Telegram app!");

        while (true) {
            int menu = MenuUtils.menu(MenuUtils.LOGIN);
            switch (menu) {
                case 1 -> {
                    User loginUser = LoginView.login();
                    if (loginUser != null) {
                        if (loginUser.getStatus().equals(Role.USER)) {

                        } else if (loginUser.getStatus().equals(Role.ADMIN)) {

                        } else {
                            System.out.println("You have something wrong!");
                        }
                    } else {
                        System.out.println("User not found or incorrect password");
                    }
                }
                case 2 -> {

                }
                case 0 -> {
                    System.out.println("Good bye!");
                    System.exit(0);
                }
            }
        }
    }
}