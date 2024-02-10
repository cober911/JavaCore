package Seminar4.zadanie1;

import java.util.List;

public class LoginPassAut {

    public static boolean proverka(List<String> creds) {
        try {
            String login = creds.get(0);
            String password = creds.get(1);
            String confirmPassword = creds.get(2);
            if (login.length() > 20) {
                throw new _Exception.WrongLoginException("Логин больше 20 символов");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new _Exception.WrongPasswordException("Пароль больше 20 символов или не совпадает с подтверждением");
            }

            System.out.println("Логин и пароль корректны");
            return true; // Возвращаем true, если выполнение завершено успешно
        } catch (_Exception.WrongLoginException | _Exception.WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false; // Возвращаем false, если было выброшено исключение
        }
    }



}
