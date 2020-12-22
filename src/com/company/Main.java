package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

public class Main {

    public static void main(String[] args) {

        // var shirt = new Shirt(
        //         ClothingSize.L,
        //         19.99,
        //         3);
        // displayItemDetails(shirt);

        // var hat = new Hat(
        //         ClothingSize.M,
        //         29.99,
        //         1);
        // displayItemDetails(hat);

        // a list is an interface -> any class that implements this interface is garunteed to have these methods
        
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        List<ClothingItem> items = new ArrayList<>();
        items.add(new Hat(
            ClothingSize.M,
            29.99,
            1));
        items.add(new Shirt(
            ClothingSize.L,
            19.99,
            3));
        for (ClothingItem item : items) {
            displayItemDetails(item);
        }
    }

    private static void displayItemDetails(ClothingItem item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}