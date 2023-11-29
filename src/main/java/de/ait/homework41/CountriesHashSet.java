package de.ait.homework41;

import java.util.HashSet;
import java.util.Set;

public class CountriesHashSet {
    private static Set<String> countriesSet = new HashSet<>();

    public static void main(String[] args) {
        countriesSet.add("США");
        countriesSet.add("Великобритания");
        countriesSet.add("Германия");
        countriesSet.add("Чехия");
        countriesSet.add("Германия");
        countriesSet.add("Франция");

        showAllCountries();
    }

    private static void showAllCountries() {
        System.out.println("Размеры countriesList: " + countriesSet.size());
        System.out.println(" ");

        for (String country : countriesSet) {
            System.out.println(country);
        }
    }
}
