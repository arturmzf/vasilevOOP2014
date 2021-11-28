package chapter01;

/**
 * @Date: 28.11.2021
 * @Author: Artur Muzafarov
 */

public class Program0109CharsAndInts {
    public static void main(String[] args) {
        // Кодовое число
        int number;
        // Исходные буквы для кодирования
        char symbA = 'A', symbB = 'ы';
        // Буквы после декодирования
        char SymbA, SymbB;
        // Вычисление кода
        number = ((int)symbB<<16)+((int)symbA);
        // Вывод исходных данных и кода
        System.out.println("Исходные буквы: \'" + symbA + "\' и \'" + symbB + "\'.");
        System.out.println("Кодовое число: " + number);
        // Декодирование
        SymbB = (char)(number>>>16);
        SymbA = (char)(number^((int)SymbB<<16));
        // Вывод результата декодирования
        System.out.println("Обратное преобразование:");
        System.out.println("Буквы \'" + SymbA + "\' и \'" + SymbB + "\'.");
    }
}
