package com.example.telefonbuch;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TelefonEntry {

    private final StringProperty lastName = new SimpleStringProperty();
    private final StringProperty firstName = new SimpleStringProperty();
    private final StringProperty number = new SimpleStringProperty();

    public TelefonEntry(String name, String surname, String number) {
        this.lastName.setValue(name);
        this.firstName.setValue(surname);
        this.number.setValue(number);
    }

    public String getLastName() {
        return lastName.getValue();
    }

    public String getFirstName() {
        return firstName.getValue();
    }

    public String getNumber() {
        return number.getValue();
    }

    public void setLastName(String newValue) {
        lastName.setValue(newValue);
    }

    public void setFirstName(String newValue) {
        firstName.setValue(newValue);
    }

    public void setNumber(String newValue) {
        number.setValue(newValue);
    }

    public boolean match(String str) {
        return false;
    }
}
