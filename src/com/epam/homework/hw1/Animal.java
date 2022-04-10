package com.epam.homework.hw1;

public abstract class Animal {

    protected String age;
    protected String color;
    protected boolean gender;

    public abstract void eat();

    public Animal(String age, String color, boolean gender) {
        this.age = age;
        this.color = color;
        this.gender = gender;
    }

    public Animal() {
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
