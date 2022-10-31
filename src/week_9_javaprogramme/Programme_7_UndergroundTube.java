package week_9_javaprogramme;

import java.util.ArrayList;

/*Write a Java program to test an array list is empty or not. Define array list with
         underground tube names*/
public class Programme_7_UndergroundTube {

    //declare static method//
    public static void underground() {
        ArrayList<String> tubeList = new ArrayList<>();
        tubeList.add("Backeloo");
        tubeList.add("Jublee");
        tubeList.add("Metropoletn");
        tubeList.add("Picadally");
        tubeList.add("Central");
        System.out.println("ArrayList of tubename ");
        //for each loop//
        for(String tube    : tubeList){
            System.out.println(tube + " ");
        }
        if( tubeList.isEmpty()){
            System.out.println( "This arraylist is emplty " );

        }else{
            System.out.println( "This arraylist is not empty");
        }

    }
    //declare main method//
    public static void main(String[] args) {
        underground();
    }
}
