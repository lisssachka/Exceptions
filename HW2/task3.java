package Lesson2.HW2;

public class task3 {
    //    public static void main(String[] args) throws Exception {
//
//        int a = 90;
//        int b = 3;
//        division(a,b);
//        printSum(23, 234);
//        try {
//            int[] abc = {1, 2};
//            abc[3] = 9;
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//    }
//
//
//    public static void printSum(Integer a, Integer b) {
//
//        System.out.println(a + b);
//    }
//
//    public static void division(double firstNum, double secondNum){
//        if(secondNum ==  0) throw new ArithmeticException("На ноль делить нельзя!");
//        double result = firstNum/secondNum;
//        System.out.printf("Результат деления %f на %f равен %f.\n", firstNum, secondNum, result);
//    }
    public static void main(String[] args) {
        int a = 90;
        int b = 3;
        printSum(23, 234);
        int[] abc = {1, 2};
        try {
            System.out.println(a / b);
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("На 0 делить нельзя");
        } catch(IndexOutOfBoundsException ex){
            System.out.println("Вы вышли за пределы массива");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }


}
