package calculate;

import java.util.Scanner;
//calculator class extends to main//
public class Main extends Calculator {        //declare main method //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number :");
        int a = scanner.nextInt();
        System.out.println("Enter second Number :");
        int b = scanner.nextInt();
        System.out.println(" please enter one of symbol");
        char symbol = scanner.next().charAt(0);
        Calculator obj = new Calculator();
        obj.calculateResult(a, b, symbol);

        System.out.println("Would you like to countinue ?");
        char count = scanner.next().charAt(0);
        while
             (count == 'y' || count == 'Y') {
                System.out.println("Enter the first number: ");
                a = scanner.nextInt();
                System.out.println("Enter the second number: ");
                b = scanner.nextInt();
                System.out.println("Please enter one of symbol +,-,*,/: ");
                symbol = scanner.next().charAt(0);
                Calculator obj1 = new Calculator();
                obj1.calculateResult(a, b, symbol);

                System.out.println("Would you like to countinue ?");
                count = scanner.next().charAt(0);
            }

            while (count == 'n' || count == 'N') {
                System.out.println("Thank you for using calculator ");
                System.exit(0);

            }

            scanner.close();

    }
}