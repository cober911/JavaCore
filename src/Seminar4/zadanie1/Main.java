package Seminar4.zadanie1;

import java.util.List;

/**
 * Задание: Класс «Проверка логина и пароля».
 * 1. Создать статический метод который принимает на вход три параметра: login,
 * password и confirmPassword.
 * 2. Длина login должна быть меньше 20 символов. Если login не соответствует
 * этому требованию, необходимо выбросить WrongLoginException.
 * 3. Длина password должна быть не меньше 20 символов. Также password и confirmPassword
 * должны быть равны. Если password не соответствует этим требованиям, необ-
 * ходимо выбросить WrongPasswordException.
 * 4. WrongPasswordException и WrongLoginException – пользовательские клас-
 * сы исключения с двумя конструкторами –- один по умолчанию, второй прини-
 * мает параметры исключения (неверные данные) и возвращает пользователю в
 * виде «ожидалось/фактически».
 * 5. В основном классе программы необходимо по-разному обработать исключения.
 * 6. Метод возвращает true, если значения верны или false в противном случае.
 */
public class Main {
    public static void main(String[] args) throws _Exception.WrongLoginException, _Exception.WrongPasswordException {
        List<String> creds = new fileReader().newRead();
        fileWriter fileWriter = new fileWriter();
        fileWriter.newWrite(creds);

        boolean result = LoginPassAut.proverka(creds);
        System.out.println(result);
    }
}
