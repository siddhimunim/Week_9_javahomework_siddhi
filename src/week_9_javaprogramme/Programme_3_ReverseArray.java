package week_9_javaprogramme;
/*Write a Java program to reverse an array of integer values*/
public class Programme_3_ReverseArray {
    //declare method//
    public static void reverseMethod(){
        // intialize array//
        int [] array = new int[]{ 1,2,3,4,5};
        System.out.println("original array ");
        for (int i =0 ; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
         // for loop through array in reverse order//
        System.out.println("Array in reverse order ");
           for (int i = array.length - 1; i>= 0 ; i --){
               System.out.println(array[i] + " ");
           }
    }
   //declare main method//
    public static void main(String[] args) {
        reverseMethod();   //call static method//
    }
}
