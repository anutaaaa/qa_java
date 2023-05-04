package com.example;

import java.util.List;

public class LionMadagascar extends Lion {
    public LionMadagascar(Foodittenable foodittenable) throws Exception {
        super(foodittenable, "Самец");
    }

    public List<String> getFriends() {
        return List.of("Марти, Глория, Мелмон");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
