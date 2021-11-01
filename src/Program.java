public class Program
{
    public static float square(float value)
    {
        return value * value;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, World!");

        float valueToSquare = 5;
        float squaredValue = square(valueToSquare);;

        System.out.println("The squared value is: " + squaredValue);

        Person person = new Person("Nick", 23);
        person.SaysHello();
    }
}
