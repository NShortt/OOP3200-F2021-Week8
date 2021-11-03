import java.util.Scanner;

/**
 * @author Nicholas Shortt
 * @studentID 100630003
 * @date November 02, 2021
 */
public class Program
{
    /**
     * This function returns the square of the value parameter
     * @param value a floating point number to be squared
     * @return the square of value
     */
    public static float square(float value)
    {
        return value * value;
    }

    /**
     * The entry point for our program
     * @param args an array of  command line parameters
     */
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");

        float valueToSquare = 5;
        float squaredValue = square(valueToSquare);

        // example of output
        System.out.println("The squared value is: " + squaredValue);

        // Step 1: for input we need to create a Scanner object
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // Step 2: use the Scanner to get the "next" line of data in this case a String value
        String name = inputObject.nextLine();

        System.out.print("Enter your age: ");
        int age = inputObject.nextInt();

        Person person = new Person(name, age);
        person.SaysHello();
    }
}
