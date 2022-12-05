package com.codewithAmit;

public class StudentObjectCloning implements Cloneable {
    int id;
    String name;
    float percentage;

    StudentObjectCloning(int id, String name, float percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}




