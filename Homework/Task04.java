package Homework;

import java.util.Scanner;

// Разработайте программу, которая
// выбросит Exception, когда пользователь
// вводит пустую строку. Пользователю должно
// показаться сообщение, что пустые строки
// вводить нельзя.

public class Task04 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        while (true){
            try {
                
                if (scanner.nextLine().equals("")){
                    throw new Exception();
                }
                break;
            }
            catch(Exception e){
                System.out.println("Пустые строки вводить нельзя! Повторите ввод");
            }
        }
    }
}
