package Lesson1.Seminar1;

public class homework1_2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{15, 10, 12};
        int[] arr2 = new int[]{5, 5, 3};
        int[] newArr = divisionOfArrays(arr1, arr2);
        System.out.println("Первый массив: ");
        printArray(arr1);
        System.out.println("Второй массив: ");
        printArray(arr2);
        System.out.println("Результат: ");
        printArray(newArr);

    }

    public static int[] divisionOfArrays(int[] arr1, int[] arr2) throws RuntimeException {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны!");
        } else {
            int[] result = new int[arr1.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = arr1[i] / arr2[i];
            }
            return result;
        }
    }

    public static void printArray(int[] arr) {
        for (Integer n : arr) {
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
}


