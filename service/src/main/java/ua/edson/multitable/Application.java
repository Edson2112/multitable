package ua.edson.multitable;

// Вывести таблицу умножения (Подсказка: Внутри цикла нужен будет ещё один цикл.
// System.out.print - вывод без перевода строки, System.out.println вывод с переводом строки)

// Умножаем числа 2 3 4 5 6 7 8 9. На 0 нельзя

//  import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        for (int value1 = 1; value1 <= 10; value1++) {

            for (int i = 1; i <= 10; i++) {

                int sum = value1 * i;
                System.out.print(value1 + " * " + i + " = " + sum + "       ");
            }
            System.out.println();
        }
    }
}

//    Ещё вариант.
//    Таблица Умножения для чисел от 2 до 9 с Вводом числа с клавиатуры.
//
//        package ua.edson.multitable;
//
//        import java.util.Scanner;
//
//public class Application {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int value1 = scanner.nextInt();
//
//        while (value1 < 2 || value1 > 9) {
//            System.out.println("Введите целое число от 2 до 9 ");
//            value1 = scanner.nextInt();
//        }
//
//        for (int i = 1; i <= 10; i++) {
//
//            int sum = value1 * i;
//            System.out.println(value1 + " * " + i + " = " + sum);
//        }
//    }
//}
