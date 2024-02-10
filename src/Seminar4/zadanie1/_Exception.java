package Seminar4.zadanie1;

public class _Exception{

    static class WrongLoginException extends Exception{
        public WrongLoginException(String message) {
            super(message);
        }
    }

    static class WrongPasswordException extends Exception{
        public WrongPasswordException(String message) {
            super(message);
        }
    }
}
