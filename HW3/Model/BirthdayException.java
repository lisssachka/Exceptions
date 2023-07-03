package Lesson3.HW3.Model;

public class BirthdayException extends Exception {

    String inputString;

    public BirthdayException(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String getMessage() {
        return "Ошибка при вводе даты '" + inputString + "', требуемый формат 'дд.мм.гггг'.\n";
    }
}
