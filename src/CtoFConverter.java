import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.println("Enter the temperature in Celsius:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid temperature in Celsius:");
            scanner.next(); //
        }
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
