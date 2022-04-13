package com.company.coderslab;

import java.util.ArrayList;
import java.util.List;

public class Main03 {
    public static void main(String[] args) {

        List<City> myCity = initialize();

        List<City> subList = myCity.subList(1,3);
        System.out.println(subList);



    }

    public static List<City> initialize() {
        List<City> citiesList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            citiesList.add(new City("Name"+i, 1000*i));
        }
        return citiesList;
    }

    public static List<City> firstSubList(List<City> list, int start, int end ) {
        List<City> newSubList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i > start && i < end) {
                newSubList.add(list.get(i));
            }
        }
        return newSubList;
    }
}
