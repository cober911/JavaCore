package Seminar4.seminar;

import java.util.List;

public class LoginPass {
    List<String> creds = new fileReader().newRead();
    LoginPass _Exception = new LoginPass();


    public static boolean proverka(String login, String password, String confirmPassword){
        if (login.length() > 20)

        if (password.length() >20 && !password.equals(confirmPassword))


        return false;
        return false;
    }

}
