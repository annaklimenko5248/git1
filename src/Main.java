import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scn.nextInt();
        System.out.print("Enter b: ");
        int b = scn.nextInt();
        System.out.println("1. Sum\n2. Minus\n");
        System.out.println("3. Convert dollars to rubbles");
        int input = scn.nextInt();
        switch (input) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> Sustem.out.println(Convert.convertUsdToRub(a,b);

        }
        System.out.println("Good bye!");
    }
}
