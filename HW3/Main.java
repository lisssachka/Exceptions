package Lesson3.HW3;

import Lesson3.HW3.Presenter.Presenter;
import Lesson3.HW3.View.ConsoleView;
import Lesson3.HW3.View.View;

public class Main {
    public static void main(String[] args) {
        Presenter<View> program = new Presenter<View>(new ConsoleView());
        program.start();
    }
}