package com.epam.homework.hw1;

public class Dog extends PredatoryAnimal {

    private String name;
    private boolean isWild;
    private boolean canBiteHuman;

    public Dog(String type, boolean isBig, boolean isBird, String name, boolean isWild, boolean canBiteHuman) {
        super(type, isBig, isBird);
        this.name = name;
        this.isWild = isWild;
        this.canBiteHuman = canBiteHuman;
    }

    public void bark() {
        System.out.println("i can bark");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isCanBiteHuman() {
        return canBiteHuman;
    }

    public void setCanBiteHuman(boolean canBiteHuman) {
        this.canBiteHuman = canBiteHuman;
    }
}
