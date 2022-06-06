package bai_tap_06_06_2022.service;

import bai_tap_06_06_2022.exception.NotFoundEmployeeException;

public interface Service {
    void add();

    void display();

    void remove();

    void search() throws NotFoundEmployeeException;
}
