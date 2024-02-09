package Seminar4.seminar;

public class _Exception{

    class WrongLoginException extends Exception{
        public WrongLoginException(String message) {
            super(message);
            System.out.println("Логин введен не корректно.");
        }
    }

    class WrongPasswordException extends Exception{
        public WrongPasswordException(String message) {
            super(message);
            System.out.println("Пассворд введен не корректно.");
        }
    }
}
