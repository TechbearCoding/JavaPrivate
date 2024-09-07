package org.example;

public class Student {

    private String name;
    private String lastName;

    public Student(String name, String lastName) {
        setName(name);
        setLastName(lastName);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudent() {
        return name + " " + lastName;
    }
}
