package bai_tap_06_06_2022.view;

import bai_tap_06_06_2022.exception.NotFoundEmployeeException;
import bai_tap_06_06_2022.personcontroller.Controller;

public class Main {
    public static void main(String[] args) throws NotFoundEmployeeException {
        Controller.displayMainMenu();
    }
}