package week_9_javaprogramme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


    public class Programme_10{

  // declare main method //
        public static void main(String[] args) {

       // using hashmap logic//
            HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();


            List<String> zone1 = new ArrayList<String>();
            zone1.add("Central Line");
            zone1.add("Elizabeth Line");
            zone1.add("Jubilee Line");


            List<String> zone2 = new ArrayList<String>();
           zone2.add("Central Line");
            zone2.add("Bakerloo Line");
           zone2.add("Victoria Line");


            List<String> zone3 = new ArrayList<String>();
            zone3.add("Central Line");
            zone3.add("Elizabeth Line");


            List<String> zone4= new ArrayList<String>();
           zone4.add("Central Line");
            zone4.add("Piccadilly Line");


            List<String> zone5 = new ArrayList<String>();
            zone5.add("Central Line");
            zone5.add("Northern Line");


            List<String> zone6 = new ArrayList<String>();
            zone6.add("Bakerloo Line");
            zone6.add("Northern Line");


            List<String> zone7 = new ArrayList<String>();
            zone7.add("Bakerloo Line");
            zone7.add("Elizabeth Line");


            List<String> zone8 = new ArrayList<String>();
            zone8.add("Central Line");
            zone8.add("Elizabeth Line");
            zone8.add("Circle Line");


            List<String> zone9 = new ArrayList<String>();
            zone9.add("Bakerloo Line");
            zone9.add("Jubilee Line");

            List<String> zone10 = new ArrayList<String>();
            zone10.add("Bakerloo Line");
            zone10.add("Circle Line");


            List<String> zone11 = new ArrayList<String>();
            zone11.add("Bakerloo Line");
            zone11.add("Piccadilly Line");

            List<String> zone12 = new ArrayList<String>();
            zone12.add("Bakerloo Line");
            zone12.add("Jubilee Line");
            zone12.add("Circle Line");


            hashMap.put("Bond Street", zone1);
            hashMap.put("Oxford Circus", zone2);
            hashMap.put("Tottenham Court Road", zone3);
            hashMap.put("Holborn",zone4);
            hashMap.put("Bank", zone5);
            hashMap.put("Elephant & Castle", zone6);
            hashMap.put("Paddington", zone7);
            hashMap.put("Liverpool Street",zone8);
            hashMap.put("Waterloo",zone9);
            hashMap.put("Embankment", zone10);
            hashMap.put("Piccadilly Circus", zone11);
            hashMap.put("Baker Street", zone12);

            System.out.println("Fetching Stations and corresponding [Multiple] Line pass through stations \n");

            for( Map.Entry<String, List<String>> entry : hashMap.entrySet() )
            {
                String key = entry.getKey();
                List<String> values = entry.getValue();

                System.out.print("Station is  = " + key);
                System.out.println(" , Line Pass through this station is  = " + values );
            }
        }
    }

