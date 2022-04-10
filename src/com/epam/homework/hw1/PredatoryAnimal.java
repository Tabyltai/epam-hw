package com.epam.homework.hw1;

public class PredatoryAnimal extends Animal {

    public PredatoryAnimal(String type, boolean isBig, boolean isBird) {
        this.type = type;
        this.isBig = isBig;
        this.isBird = isBird;
    }

    protected String type;
    protected boolean isBig;
    private boolean isBird;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBig() {
        return isBig;
    }

    public void setBig(boolean big) {
        isBig = big;
    }

    @Override
    public void eat() {
        System.out.println("This animal eat meat");
    }

    public boolean isBird() {
        return isBird;
    }

    public void setBird(boolean bird) {
        isBird = bird;
    }
}
