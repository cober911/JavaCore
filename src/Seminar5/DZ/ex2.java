package Seminar5.DZ;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

/* Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3], и представляют собой, например,
   состояния ячеек поля для игры в крестикинолики, где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле
   с ноликом, 3 – резервное значение. Такое предположение позволит хранить в одном числе типа int всё поле 3х3.
   Записать в файл 9 значений так, чтобы они заняли три байта.*/

public class ex2 {
    public static void main(String[] args) {
        // Создание массива, представляющего состояние поля для игры в крестики-нолики
        int[] gameField = {1, 0, 2, 2, 1, 0, 0, 0, 2}; // Пример поля для игры

        try {
            // Создание потока для записи данных в файл
            FileOutputStream fileOutputStream = new FileOutputStream("gamefield.bin");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            DataOutputStream outputStream = new DataOutputStream(bufferedOutputStream);

            // Запись значений поля в файл
            for (int i = 0; i < gameField.length; i++) {
                // Печать текущего значения, которое будет записано в файл
                System.out.println("Запись значения " + gameField[i] + " в файл...");

                // Запись текущего значения в файл в виде байта
                outputStream.writeByte((byte) gameField[i]);
            }

            // Очистка буфера и убедимся, что все данные записаны в файл
            outputStream.flush();

            // Закрытие потоков
            outputStream.close();
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
