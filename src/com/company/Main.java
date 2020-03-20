package com.company;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> languages = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type languages that will be divided into A and B");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Please, first type a list A:");
        languages.add(scan.next());
        languages.add(scan.next());
        languages.add(scan.next());
        languages.add(scan.next());
        languages.add(scan.next());
        //System.out.println("List A: " + languages);
        for (String language : languages) {
            System.out.println(language);
        }
        TimeUnit.SECONDS.sleep(1);
        ArrayList<String> languages2 = new ArrayList<>();
        System.out.println("Please type a list B");
        languages2.add(scan.next());
        languages2.add(scan.next());
        languages2.add(scan.next());
        languages2.add(scan.next());
        languages2.add(scan.next());
        for (String s : languages2) {
            System.out.println(s);
        }
        languages.addAll(languages2);
        //languages.addAll(languages2);

        ArrayList<String> languages3 = new ArrayList<>(languages);
        Collections.sort(languages);
        System.out.println("Sort" + languages3);
        Collections.reverse(languages);
        //printList(languages2);
        //printList(languages3);
        //Collections.sort(languages);
        //Collections.reverse(languages2);
        //while (lang.hasNext())
        Iterator<String> iterator3 = languages.iterator();
        for (int i = 0; i < languages.size(); i++) {
            //languages.addAll(languages2);
            //languages3.addAll(languages);
            }
            //Iterator<String> lang3 = languages3.iterator3();
            while (iterator3.hasNext()) {
                System.out.println(iterator3.next());
            }
        }

        //  System.out.println(lang.next());

        private static void printList (ArrayList < ? > list){
            for (Object a : list) {
                System.out.println(a);
            }
        }
    }




    //private static void printList1(ArrayList<?> list) {
      //  for (int i = 0; i < list.size(); i++) {
        //    System.out.println("A" + i + " - " + list.get(i));
        //}
    //}

    //private static void printList2(ArrayList<?> list) {
      ///  for (int i = 5; i < list.size(); i--) {
    ///System.out.println("B" + i + " - " + list.get(i));
       /// }
    ///}
