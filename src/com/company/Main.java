package com.company;

import java.awt.List;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> ListA = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type ListA that will be divided into A and B");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Please, first type a list A:");
        ListA.add(scan.next());
        ListA.add(scan.next());
        ListA.add(scan.next());
        ListA.add(scan.next());
        ListA.add(scan.next());
        Iterator<String> iteratorA = ListA.iterator();
        while (iteratorA.hasNext()) {
            System.out.println(iteratorA.next());
        }
        TimeUnit.SECONDS.sleep(1);
        ArrayList<String> ListB = new ArrayList<>();
        System.out.println("Please type a list B");
        ListB.add(scan.next());
        ListB.add(scan.next());
        ListB.add(scan.next());
        ListB.add(scan.next());
        ListB.add(scan.next());
        Iterator<String> iteratorB = ListB.iterator();
        while (iteratorB.hasNext()) {
            System.out.println(iteratorB.next());
        }
        //ListA.addAll(ListB);

        ArrayList<String> ListC = new ArrayList<>();
        System.out.println("List C:");
        Collections.reverse(ListB);
        //Iterator<String> iteratorC = ListC.iterator();
        for (int i = 0; i < ListA.size(); i++) {
            ListC.add(ListA.get(i));
            ListC.add(ListB.get(i));
            //Iterator<String> iterator = ListC.iterator();
            //Collections.addAll(ListC);
            System.out.println(ListC.get(i));

        }
        //while (iteratorC.hasNext()) {
            //System.out.println(iteratorC.next());
            //while (iteratorC.hasNext()) {
            //System.out.println(s);
            //System.out.println(iteratorC.next());

            System.out.println("Sorted:");
            ListC.sort(Comparator.comparing(String::length));
            ListC.forEach(System.out::println);

            //Comparator<String> byLength = new Comparator<String>() {
            //          @Override
            //        public int compare(String a1, String a2) {
            //          return a1.length() - a2.length();
            //    }
            //};
            //Collections.sort(ListC, byLength);
            //System.out.println("Sorted");
            //System.out.println(ListC);
        }
    }
