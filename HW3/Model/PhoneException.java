package Lesson3.HW3.Model;

public class PhoneException extends Exception {
    String inputString;

    public PhoneException(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String getMessage() {
        return "Не получилось преобразовать " + inputString + " в телефонный номер, (нужный формат телефона 11 цифр без разделителей 81234567890)\n";
    }
}