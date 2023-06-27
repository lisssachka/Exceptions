package Lesson1.Seminar1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Выберите, что вы хотите сделать: \n" +
                    "1 - деление двух чисел \n" +
                    "2 - узнать день недели по номеру \n" +
                    "3 - запись в файл \n");
            int userAnswer = scan.nextInt();

            if (userAnswer == 1) {
                System.out.println("Введите первое число: ");
                int num1 = scan.nextInt();
                System.out.println("Введите второе число: ");
                int num2 = scan.nextInt();
                int result = divide(num1, num2);
                System.out.printf("Результат %d", result);

            } else if (userAnswer == 2) {
                System.out.println("Введите номер дня недели");
                int index = scan.nextInt();
                weekNumber(index);

            } else if (userAnswer == 3) {

                System.out.println("Введите название файла, в который вы хотите записать: ");
                String file = scan.nextLine();
                System.out.println("Введите текст: ");
                String text = scan.nextLine();
                writeFile(file, text);

            } else {
                System.out.println("Такой операции нет ");
            }

        } catch (ArithmeticException e) {
            System.out.println("На 0 делить нельзя!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы ввели недопустимое значение!");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл!");
        }

        scan.close();

    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static void writeFile(String pathToFile, String text) throws IOException {
        Path path = Paths.get(pathToFile);
        BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
        bufferedWriter.write(text);
        bufferedWriter.close();
    }

    public static void weekNumber(int index) throws ArrayIndexOutOfBoundsException {
        String[] week = new String[]
                {"Понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        System.out.printf(index + " день недели " + week[index]);
    }


}