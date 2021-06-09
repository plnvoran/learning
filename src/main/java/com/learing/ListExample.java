package com.learing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        // Iterable -> Collection ->
        // List -> ArrayList    - поддерживает дублирование элементов, поддерживает порядок
        //      -> LinkedList
        // Set  -> HashSet
        // Queue -> LinkedList

        // Map -> HashMap
        //     -> LinkedHashMap

        ArrayList<String> myList = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        System.out.println(myList.get(0));

        printAllElements(myList);
        printAllElements(myList2);
    }

    static void printAllElements(ArrayList<String> list) {

    }

}
