package Lesson2.HW2;
import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
 у пользователя ввод данных.
 */
public class task1 {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число: ");
            if (sc.hasNextFloat()) {
                float number = sc.nextFloat();
                System.out.println("Вы ввели число " + number);
                flag = false;
            } else {
                System.out.println("Неверный ввод! Введите число");
            }
        }
    }
}