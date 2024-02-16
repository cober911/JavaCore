package Seminar5.Seminar;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {

//    Создать массив из 9 цифр и записать его в файл, используя поток вывода
    public static void massOut() throws FileNotFoundException {
        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try(FileOutputStream outputStream = new FileOutputStream("outStream.txt")) {
            for (int vol: mas) {
                outputStream.write(String.valueOf(vol).getBytes());
                if (vol< mas.length) {
                    outputStream.write(',');
                    outputStream.write(' ');
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    Создать массив целых чисел и заполнить его информацией из файла, записанного в предыдущем задании.
    public static void massIn() throws IOException {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("outStream.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                String [] numbers = line.split(", ");
                for (String number: numbers) {
                    list.add(Integer.parseInt(number));
                }
            }
        }
//        int[] mas = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            mas[i] = list.get(i);
            System.out.println(list);
//        }
    }
//    Прочитать данные из файла с числами, предполагая, что разделитель – это число 0.
    public static void inputSplit() throws IOException {
        List<List<Integer>> numbersList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("outStream.txt"))) {
            List<Integer> currentNumbers = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("0");
                for (String part : parts) {
                    if (!part.isEmpty()) {
                        List<Integer> numbers = parseNumbers(part.trim());
                        numbersList.add(numbers);
                    }
                }
            }
        }

        // Вывод прочитанных чисел для проверки
        for (List<Integer> numbers : numbersList) {
            System.out.print("New set of numbers: ");
            for (int number : numbers) {
                System.out.printf("%d ", number);
            }
        }
    }

    public static List<Integer> parseNumbers(String numbersStr) {
        List<Integer> numbers = new ArrayList<>();
        String[] numberStrArray = numbersStr.split(",\\s*");
        for (String numStr : numberStrArray) {
            if (!numStr.isEmpty()) {
                numbers.add(Integer.parseInt(numStr.trim()));
            }
        }
        return numbers;
    }

//    Написать программу заменяющую указанный символ в текстовом файле на пробел, сохраняющую получившийся текст в новый файл.

    public static void main(String[] args) throws IOException {
//        massOut();
//        massIn();
//        inputSplit();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вводите символы, дя выхода q");
        char c;
        do {
            c = (char) br.read();
            System.out.printf("%c ", c);
        }while (c !='q');


    }
}
