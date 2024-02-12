package Seminar5.DZ;

import java.io.FileOutputStream;
import java.io.IOException;

/* Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3], и представляют собой, например,
   состояния ячеек поля для игры в крестикинолики, где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле
   с ноликом, 3 – резервное значение. Такое предположение позволит хранить в одном числе типа int всё поле 3х3.
   Записать в файл 9 значений так, чтобы они заняли три байта.*/

public class ex2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 2, 1, 3, 0, 1};
        try (FileOutputStream fos = new FileOutputStream("bitOperation.txt")) {
            int bitPosition = 0;
            int byteValue = 0;

            for (int j : arr) {
                byteValue |= j << bitPosition;
                bitPosition += 2;

                if (bitPosition >= 8) {
                    fos.write(byteValue);
                    byteValue = 0;
                    bitPosition = 0;
                }
            }
            if (bitPosition > 0) {
                fos.write(byteValue);
            }
            System.out.println("Файл был успешно записан.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
