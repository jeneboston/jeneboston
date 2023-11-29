/*
package de.ait.collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class CollectionMap {
    private static final Logger logger = LogManager.getLogger(CollectionMap.class);

    public static void main(String[] args) {
        Map<String, String> phones = new HashMap<>();
        phones.put("123", "iphone 14");
        phones.put("124", "iphone 12");
        phones.put("125", "Samsung S21");

        System.out.println(phones.get("123"));
        System.out.println(phones.get("124"));
        System.out.println(phones.get("125"));

        for (String phoneKey : phones.keySet()) {
            System.out.println(phones.get(phoneKey));
        }

        for (Map.Entry<String, String> phoneMap : phones.entrySet()) {
            System.out.println(phoneMap.getKey() + " " + phoneMap.getValue());
        }

        Iterator<Map.Entry<String, String>> iteratorPhone = phones.entrySet().iterator();
        while (iteratorPhone.hasNext()) {
            Map.Entry<String, String> entry = iteratorPhone.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        phones.forEach((key, value) -> System.out.println(key + " " + value));

        phones.put("126", "Samsung S21");
        System.out.println(phones.get("126"));

        phones.put(null, "Samsung S28");
        System.out.println(phones.get("126"));
        System.out.println(phones.get(null));

        phones.put("123", "Iphone 15");
        System.out.println(phones.get("123"));

        System.out.println(phones.size());
        System.out.println(phones);

        // Вызов метода doSomething
        doSomething();
    }

    private static void doSomething() {
        logger.info("Это информационное сообщение.");
        logger.error("Это сообщение об ошибке.");
    }
}*/
