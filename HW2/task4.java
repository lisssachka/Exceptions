package Lesson2.HW2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = sc.nextLine();
        while (text.isEmpty()) {
            System.out.println("Пустую строку вводить нельзя! Повторите ввод: ");
            text = sc.nextLine();
        }
    }
}
