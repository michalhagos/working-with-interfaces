package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // create a list of people
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Zachary", "Westly", 31));
        myFamily.add(new Person("Elisha", "Aslan", 14));
        myFamily.add(new Person("Ian", "Auston", 16));
        myFamily.add(new Person("Zephaniah", "Hughes", 9));
        myFamily.add(new Person("Ezra", "Aiden", 17));

        // print the list before sorting
        System.out.println("--- Before Sorting ---");
        for (Person person : myFamily) {
            System.out.println(person);
        }

        // now this works because Person implements Comparable
        // Java knows to use our compareTo method to sort by lastName because of the comparable value
        Collections.sort(myFamily);

        // print the list after sorting
        System.out.println("\n***Sorted By Last Name ***");
        for (Person person : myFamily) {
            System.out.println(person);
        }
    }
}