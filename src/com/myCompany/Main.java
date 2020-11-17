package com.myCompany;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("На складе есть следующие детали:");
        Set <String> carDitailsSet = new HashSet<>();
        carDitailsSet.add("шаровая");
        carDitailsSet.add("амортизатор");
        carDitailsSet.add("ступица");
        carDitailsSet.add("колодка");
        carDitailsSet.add("пружина");
        carDitailsSet.add("дрыгатель");

        Iterator<String> stringIterator = carDitailsSet.iterator();

        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

        System.out.println("Проверим есть ли пружина на складе: " + carDitailsSet.contains("пружина"));

        System.out.println("------------------------\nПеревезли все детали на другой склад и пронумеровали: ");
        Set<Integer> carDitailsIntSet = new LinkedHashSet<>();
        carDitailsIntSet.add(1);
        carDitailsIntSet.add(2);
        carDitailsIntSet.add(3);
        carDitailsIntSet.add(4);
        carDitailsIntSet.add(5);
        carDitailsIntSet.add(6);
        carDitailsIntSet.add(7);

        Iterator<Integer> integerIterator = carDitailsIntSet.iterator();

        while (integerIterator.hasNext()){
            System.out.println("Деталь №" + integerIterator.next());
        }

        System.out.println("Проверим есть ли детально №8 на складе: " + carDitailsIntSet.contains(8));


    }
}
