package Homework;


public class Task03 {
    public static void main(String[] args) /*throws Exception*/ {// убрал данный код т.к. обработка исключений выполняется внутри метода
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   }  
//    catch (NullPointerException ex) { нет необходимости в данной проверке, т.к. отсуствуют ссылочные переменные
//        System.out.println("Указатель не может указывать на null!");
//    } 
    catch(ArithmeticException e){ // добавил данное исключение т.к. есть деление
        System.out.println("Деление на 0!");
    }
   catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }catch (Throwable ex) { // вынес более общее исключение вниз
       System.out.println("Что-то пошло не так...");
   }
}
public static void printSum(Integer a, Integer b){ // убрал "throws FileNotFoundException" т.к. нет работы с файлами 
   System.out.println(a + b);
}

}
