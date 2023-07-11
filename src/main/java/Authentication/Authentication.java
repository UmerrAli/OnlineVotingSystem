package Authentication;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class Authentication {
    public static boolean authenticate(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password");
        String role = (String) session.getAttribute("role");
        if(role.equals("admin")){
            return (username.equals("admin")&&password.equals("admin"));
        }
        else if(role.equals("voter")){
//            TODO
        }
            return false;
    }
}
