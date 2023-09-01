package Homework;

public class Task02 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };// добавил инициализацию массива
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) { // добавил дополнительную проверку на исключение выхода за пределы
                                                     // массива
            System.out.println("Catching exception: " + e);
        }

    }
}
