package com.example;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final Foodittenable foodittenable;

    public Lion(Foodittenable foodittenable, String sex) throws Exception {
        this.foodittenable = foodittenable;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public int getKittens() {
        return foodittenable.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return foodittenable.getFood("Хищник");
    }
}
