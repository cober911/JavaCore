package Seminar4;

import java.io.IOException;

public class lekc {
    public static void methodB() {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        methodB();
    }


}
