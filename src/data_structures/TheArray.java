package data_structures;

import java.util.Arrays;

public class TheArray {

    public static void main(String[] args){

        String[] courses = new String[13];

        courses[0] = "Machine learning";
        courses[1] = "Intelligent agents";
        courses[2] = "Embedded systems design";
        courses[3] = "Data analytics and mining";
        courses[4] = "Advanced Computer Networks";
        courses[5] = "Embedded Operating Systems";
        courses[6] = "Computer security";
        courses[9] = "Research project";
        courses[10] = "Computer vision";

        for(Object course : courses){
            System.out.println(course);

        }







        String[] fruits = new String[5];

        //assigning elements to the array
        fruits[0] = "Banana";  //The first index of an array is 0
        fruits[1] = "Apple";
        fruits[2] = "Mango";
        fruits[3] = "Pear";

        System.out.println(Arrays.toString(fruits));

        //updating element 2 of the array which is Fruit[1]
        fruits[1] = "Orange";

        //looping through array
        for (int i = 0; i < fruits.length ; i++) {
            System.out.println(i);
        }

        //enhancede for loop
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        Arrays.stream(fruits).forEach(System.out::println);

        String[] arr = new String[5];

        arr[0] = "Kboy";
        arr[1] = "Baba";
        System.out.println(Arrays.toString(arr));

        String[] StringArr = new String[6];
        int[] IntArr = {1,2,3,4,5};



    }
}
