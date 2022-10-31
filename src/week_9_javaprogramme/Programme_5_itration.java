package week_9_javaprogramme;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*Write a Java program to iterate through all elements in an array list using
        Iteration */
public class Programme_5_itration {
    public static void iterateElements(){
        // using hasset logic//
        Set<String> cityName = new HashSet<String>();
        cityName.add("Coventry");
        cityName.add("Birmingham");
        cityName.add("london");
        cityName.add("Manchester");
        cityName.add("Liverpool");
        Iterator city = cityName.iterator();
        while(city.hasNext()){
            System.out.println(city.next());
        }
    }
   //main method declare//

    public static void main(String[] args) {
        iterateElements();
    }

}
