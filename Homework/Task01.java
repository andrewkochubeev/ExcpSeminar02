package Homework;

import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя
// ввод дробного числа (типа float), и возвращает введенное
// значение. Ввод текста вместо числа не должно приводить к
// падению приложения, вместо этого, необходимо повторно
// запросить у пользователя ввод данных.

public class Task01 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(inputFloat());
    }

    public static float inputFloat() {
        float number;
        System.out.println("Введите число:");
        while (true) {
            try {
                number = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введено некорректное число, повторите ввод");
            }
        }
        return number;
    }
}
