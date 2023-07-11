package Authentication;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class Authentication {
    public static String authenticate(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password");
        String role = (String) session.getAttribute("role");

        if (username == null || password == null || role == null) {
            return "not authenticated";
        }
        if (role.equals("admin")) {
            if (username.equals("admin") && password.equals("admin")) {
                return "admin";
            }
        }
        if (role.equals("voter")) {
//            TODO
        }
        return "not authenticated";
    }
}
