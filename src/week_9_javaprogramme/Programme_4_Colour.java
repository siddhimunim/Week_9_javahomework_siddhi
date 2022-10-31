package week_9_javaprogramme;

import java.util.ArrayList;

/* Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.*/
public class Programme_4_Colour {
    // declare instance method//
    public void colourName(){
        ArrayList<String > colourList = new ArrayList();
        colourList.add("Blue");
        colourList.add("Orange");
        colourList.add("White");
        colourList.add("Black");
        colourList.add("Red");
        for( String colour : colourList ){    //useing for each loop//
            System.out.println(colour);
        }

    }
     // main method declare

    public static void main(String[] args) {
        Programme_4_Colour obj = new Programme_4_Colour();
        obj.colourName();
    }





}
