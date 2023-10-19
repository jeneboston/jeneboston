package de.ait.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        int initialCapacity = 10;
        float loadFactor = 50;

       // Set<String> stringSet = new HashSet<>(initialCapacity,loadFactor);
        Set<String> stringSet = new HashSet<>();

        stringSet.add("Alex1");
        stringSet.add("Anna2");
        stringSet.add("Max");

        for (String name: stringSet)
            System.out.println(name);

        System.out.println("__________________________");

        Iterator<String> interator = stringSet.iterator();
            System.out.println(interator.next());

        System.out.println(stringSet.size());
        System.out.println(stringSet.isEmpty());

        stringSet.remove("Max");
        System.out.println(stringSet.size());

        stringSet.clear();
        System.out.println(stringSet.isEmpty());
    }
}
