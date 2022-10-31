package week_9_javaprogramme;

import java.util.HashSet;
import java.util.Set;

/*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
        Show which numbers are between 1 and 10 are in the set.*/
public class Programme_8_Integer {
    public static void number(){
        Set<Integer> num = new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(10);

             System.out.println("Hashset 1 = " + num );
        Set<Integer> num1 = new HashSet<>();
        num1.add(4);
        num1.add(7);
        num1.add(8);
        for( int x : num1){
            if (num.contains(x)){
                System.out.println( x  +  " It is  number is in set");
            }else{
                System.out.println("This number not in set ");
            }
        }
    }
     //declare main method//
    public static void main(String[] args) {
        number();
    }
}
