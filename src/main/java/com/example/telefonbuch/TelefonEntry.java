package com.example.telefonbuch;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TelefonEntry {

    private final StringProperty lastName = new SimpleStringProperty();
    private final StringProperty firstName = new SimpleStringProperty();
    private final StringProperty number = new SimpleStringProperty();

    private final List<StringProperty> parameterList = new ArrayList<>();

    public TelefonEntry(String name, String firstname, String number) {
        this.lastName.setValue(name);
        parameterList.add(this.lastName);

        this.firstName.setValue(firstname);
        parameterList.add(this.firstName);

        this.number.setValue(number);
        parameterList.add(this.number);
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
        str = str.toLowerCase();
        for (StringProperty s : parameterList) {
            if (s.getValue().toLowerCase().contains(str)) {return true;}
        }
        return false;
    }
}