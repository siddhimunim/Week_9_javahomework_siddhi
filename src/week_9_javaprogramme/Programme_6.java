package week_9_javaprogramme;

import java.util.ArrayList;

/*Write a Java program to retrieve an element (at a specified index) from a given
        array list*/
public class Programme_6 {
    public static void elements() {
        //declare static method //
        //declare arraylist//
        ArrayList<Float> list = new ArrayList<Float>();
        list.add(3.4f);
        list.add(4.4f);
        list.add(37.4f);
        list.add(31.4f);
        list.add(38.4f);

        for (float data : list) {
            System.out.println(data);
        }

        float element = list.get(1);
        System.out.println(" elements : " + element);
        element = list.get(4);
        System.out.println("elements : " + element);

    }

    // main method declare//
    public static void main(String[] args) {
        elements();
    }
}
