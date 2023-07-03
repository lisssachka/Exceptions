package Lesson3.HW3.Model;

public class FIOException extends Exception {

    String inputString;

    public FIOException(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String getMessage() {
        return "Неправильный формат ФИО '" + inputString + "'. ФИО могут состоять только из букв.\n";
    }
}