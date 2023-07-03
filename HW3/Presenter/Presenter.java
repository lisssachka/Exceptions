package Lesson3.HW3.Presenter;

import Lesson3.HW3.Model.DataCheck;
import Lesson3.HW3.Model.ParsingDataStringException;
import Lesson3.HW3.View.View;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Presenter<V extends View> {

    private DataCheck model;
    private V view;

    public Presenter(V v) {
        view = v;
    }

    public void start() {
        boolean wokring = true;
        do {
            String input = view.getInput(
                    "Введите данные через пробел (ФИО Дату рождения(dd.mm.yyyy) Номер Телефона(11 цифр) Пол(f,m), или Exit:");
            if (input.equals("Exit") || input.equals("exit")) {
                break;
            } else {
                String[] splitedInput = input.replaceAll("\\s+", " ").split(" ");

                int inputDataCount = checkInputDataCount(splitedInput.length);
                if (inputDataCount == -1) {
                    view.printOutput("Слишком мало данных!(должно быть " + DataCheck.dataCount
                            + " разделённых пробелом ' ': ФИО Номер Телефона Дата Рождения Пол)\n");
                } else if (inputDataCount == 0) {
                    view.printOutput("Слишком много данных!(должно быть " + DataCheck.dataCount
                            + " разделённых пробелом ' ': ФИО Номер Телефона Дата Рождения Пол)\n");
                } else {
                    try {
                        model = new DataCheck();
                        model.CheckData(splitedInput);
                        writePersonData(model);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ParsingDataStringException e) {
                        view.printOutput(e.getMessage());
                    }
                }
            }
        } while (wokring);
    }

    private int checkInputDataCount(int inputDataCount) {
        if (inputDataCount < DataCheck.dataCount) {
            return -1;
        } else if (inputDataCount > DataCheck.dataCount) {
            return 0;
        } else {
            return inputDataCount;
        }
    }

    private void writePersonData(DataCheck data) throws IOException {
        File filepath = new File(data.getLastName());
        try (FileWriter fw = new FileWriter(filepath, true)) {
            fw.append(data.toString() + "\n");
        } catch (IOException e) {
            throw e;
        }
    }

}
