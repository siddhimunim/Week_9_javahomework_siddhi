package calculate;

public class Calculator {
    // create 4 instance method with perameter//
    public void addition(int a,int b){
        System.out.println("Addition of " + a + " and " + b + " is :"+  (a+b));
    }
    public void substraction(int a, int b){
        System.out.println("Substraction of " + a + " and " + b + "is :" + (a - b));
    }
    public void division(int a, int b){
        System.out.println("Multiplication of " + a + " and " + b + " is :" + (a / b));
    }
    public void multiplication(int a, int b){
        System.out.println("Multiplication of " + a + " and " + b + " is :" + (a * b));
    }
    public void calculateResult(int a,int b,char symbol){

        if(symbol == '+' ){
           addition(a,b);
        }else if (symbol == '-' ) {
            substraction(a,b);
        }else if (symbol == '*' ) {
            multiplication(a,b);
        }else if (symbol == '/'){

            try{
                division(a,b);
                int ans = a/b;
                System.out.println(ans);
            }catch (ArithmeticException e){
                String message = e.getMessage();
                System.out.println(message);
                System.out.println("Exception happened ");
            }

        }else {
            System.out.println("Invalid data");
        }

    }

    }
