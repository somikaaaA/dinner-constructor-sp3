package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> dishesByType = new HashMap<>();
    Random random = new Random();

    void addDish(String type, String dishName){
        ArrayList<String> dishesForType= new ArrayList<>();
        dishesForType.add(dishName);
        dishesByType.put(type, dishesForType);
    }

    ArrayList<String> generateCombo (ArrayList<String> types){
        ArrayList<String> combination = new ArrayList<>();
        for (String type : types){
            ArrayList<String> dishesType = dishesByType.get(type);
            int numberOfTypesOfDishes = dishesType.size();
            int index = random.nextInt(numberOfTypesOfDishes);
            String dishForCombo = dishesType.get(index);
            combination.add(dishForCombo);
        }
        return combination;
    }
}
