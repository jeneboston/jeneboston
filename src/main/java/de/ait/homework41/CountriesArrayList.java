package de.ait.homework41;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountriesArrayList {
    private static List<String> countriesList = new ArrayList<>();

    private static final Logger LOGGER = LoggerFactory.getLogger(CountriesArrayList.class);

    public static void main(String[] args) {
        String usa = "США";
        countriesList.add(usa);
        LOGGER.info("Добавлена новая страна {}", usa);

        countriesList.add("Великобритания");
        countriesList.add("Франция");
        countriesList.add("Чехия");
        countriesList.add("Германия");
        countriesList.add("Франция");

        System.out.println(" ");
        showAllCountries();
        removeDuplicates();
        showAllCountries();
    }

    private static void showAllCountries() {
        System.out.println("Размеры countriesList: " + countriesList.size());
        System.out.println(" ");

        for (String country : countriesList) {
            System.out.println(country);
        }
    }

    private static void removeDuplicates() {
        Set<String> uniqueCountries = new HashSet<>(countriesList);
        countriesList = new ArrayList<>(uniqueCountries);

        System.out.println(" ");
        System.out.println("Дубликаты были удалены: ");
        System.out.println(" ");
    }
}