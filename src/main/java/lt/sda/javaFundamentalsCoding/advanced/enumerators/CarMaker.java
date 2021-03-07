package lt.sda.javaFundamentalsCoding.advanced.enumerators;

import lt.sda.javaFundamentalsCoding.advanced.inheritance.abstract_example.Car;

public enum CarMaker {
    BMW("bumeris", 1850),
    VOLVO("Senas Geras Volvo", 1988),
    MB("Mercedes Benz", 2021);

    final String fullName;
    final int establishedYear;

    CarMaker(String fullName, int establishedYear) {
        this.fullName = fullName;
        this.establishedYear = establishedYear;
    }
}
