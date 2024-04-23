package data_structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TheList {

    public static void main(String[] args){

        List students = new ArrayList();

        students.add("Ihimbru");
        students.add("Kanyimi");
        students.add("Peter");
        students.remove(1);
        System.out.println(students);

        for(Object s : students){

            System.out.println(s);
        }














        List lang = new ArrayList();
        lang.add("Java");
        lang.add("python");
        lang.add("dart");
        lang.add("kotlin");

        System.out.println(lang);  //print out elements of lang list

        for(Object l : lang){
            System.out.println(l);  //looping through the list and printing out its elements
        }

        List<Integer> ages = new ArrayList<>();
        ages.add(22);
        ages.add(21);
        ages.add(20);
        ages.add(19);
        ages.remove(0);
        //ages.add("s"); cannot go cos i've declared the type explicitly

        System.out.println(ages.contains(22));



        List<String> names = List.of("Kanyimi", "Unji");   //size is fixed once declared hence can't add elements


        List<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Pear");
        fruits.add("Apple");

        fruits.remove("Banana");
        fruits.remove(2);

        for(Object f : fruits){
            System.out.println(f);
        }
        List<Integer> marks = new ArrayList<>();
        marks.add(50);
        marks.add(100);
        marks.add(75);
        marks.add(55);
        marks.add(765);
        marks.add(45);
        marks.add(89);

        for (int mark: marks
             ) {
            System.out.println(mark);

        }

        
    }




}
