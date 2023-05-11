import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scn.nextInt();
        System.out.print("Enter b: ");
        int b = scn.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Convert dollars to rubbles");
        int input = scn.nextInt();
        switch (input){
            case 1 -> System.out.println(calc.addition(a,b));
            case 2 -> System.out.println(calc.subtraction(a,b));
            case 3 -> System.out.println(calc.division(a,b));
            case 4 -> System.out.println(calc.multiplication(a,b));
            case 5 -> System.out.println(Converter.convertDollarsToRubbles(a,b));
        }
        System.out.println("Good bye!");
    }
}
