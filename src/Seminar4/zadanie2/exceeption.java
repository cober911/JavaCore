package Seminar4.zadanie2;

public class exceeption{
    public static class ClientException extends RuntimeException{
        public ClientException(String message) {
            super(message);
        }
    }

    public static class ProductException extends Exception{
        public ProductException(String message) {
            super(message);
        }

        public static class QuantityException extends Exception{
            public QuantityException(String message) {
                super(message);
            }
        }
    }
}
