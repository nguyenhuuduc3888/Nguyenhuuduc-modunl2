package bai_tap_06_06_2022.service_six;

import bai_tap_06_06_2022.exception_six.NotFoundEmployeeException;

public interface Service {
    void add();

    void display();

    void remove();

    void search() throws NotFoundEmployeeException;
}
