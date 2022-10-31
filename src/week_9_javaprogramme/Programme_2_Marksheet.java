package week_9_javaprogramme;

import java.util.Scanner;

/*Re write the student mark sheet programme using if else and while loop*/
public class Programme_2_Marksheet {
    public static void main(String[]args) {
          //scanner declaration for enter input//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name  :");
        String name = scanner.nextLine();
        System.out.println("Enter your roll no :");
        int no = scanner.nextInt();
        System.out.println("Enter maths mark ");
       int maths = scanner.nextInt();
        System.out.println("Enter science mark ");
        int science = scanner.nextInt();
        System.out.println("Enter english mark ");
        int english = scanner.nextInt();
        int total = maths + science + english;
        double percentage = (total * 100) / 300;


        System.out.println("__________________________________");
        System.out.println("|                                |");
        System.out.println("|          Mark Sheet            |");
        System.out.println("|________________________________| ");
        System.out.println("|     Name     :" + name + "              |");
        System.out.println("|   Roll No    :" + no + "                | ");
        System.out.println("|________________________________|");
        System.out.println("|   Subjects   :  Marks          |");
        System.out.println("|________________________________|");
        System.out.println("|   Math       :  " + maths + "             | ");
        System.out.println("|   Science    : " + science + "              |");
        System.out.println("|   English    :  " + english + "             |");
        while (maths < 0 || maths > 100 || science < 0 || science > 100 || english < 0 || english > 100) {
            System.out.println("Invalid marks");
            System.exit(0);
        }
        while (maths < 35 || science < 35 || english < 35) {
            System.out.println("|   Result     : Fail            |");
            System.out.println("|________________________________|");
            System.exit(0);


            System.out.println("|________________________________|");
            System.out.println("|   Total      :  " + total + "            |");
            System.out.println("|________________________________|");
            System.out.println("|   Percentag  :  " + percentage + "           |");





                System.out.println("|   Result     : Fail            |");
                System.out.println("|________________________________|");
                System.exit(0);
                if (percentage >= 80) {
                    System.out.println("|   Result     : Pass            |");
                    System.out.println("|   Grade    :     A+           |");
                } else if (percentage >= 60) {
                    System.out.println("|   Result     :  Pass          |");
                    System.out.println("|   Grade      :  A             |");
                } else if (percentage >= 50) {
                    System.out.println("|   Result     :  Pass          |");
                    System.out.println("|   Grade      :  B             |");
                } else if (percentage >= 35) {
                    System.out.println("|   Result     :  Pass          |");
                    System.out.println("|   Grade      :  C             |");
                } else {
                    System.out.println("|   Result     :  Fail          | ");
                    System.out.println("|   Grade      :   N/A           |");
                }
                System.out.println("__________________________________");

            }


        }
    }


