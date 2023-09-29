package ru.netology;

import java.util.Objects;

public class Contact {
    protected String name;
    protected String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String setName(String nameReplace) {
        this.name = nameReplace;
        return name + " " + number;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - " + number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public boolean equals(Object obj) {
        Contact c = (Contact) obj;
        return name.equals(c.name) && number.equals(c.number);
    }
}
