package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests
{

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main(String args[])
    {
        // Use main to test your methods
        System.out.println(returnStringUntilQ("ubiquitous"));
    }

    public static void printHelloWorld()
    {
        System.out.println("Hello World");
    }

    public static Object returnPrimitiveBooleanTrue()
    {
        return true;
    }

    public static Object returnPrimitiveInt1729()
    {
        int myNum = (Integer) 1729;
        return myNum;
    }

    public static Object returnPrimitiveDoubleThreePointOneFour()
    {
        Double myDouble = (Double) 3.14;
        return myDouble;
    }

    public static Object returnPrimitiveCharZ()
    {
        Character mychar = (Character) 'Z';
        return mychar;
    }

    public static void printSumOf1Upto10UsingForLoop()
    {

        for(int i = 1; i < 9; i++)
        {
            System.out.println(1 + i);
        }
    }

    public static void printSumOf1Upto10000UsingForLoop()
    {

        for(int i = 1; i < 10000; i++)
        {
            System.out.println(1 + i);
        }
    }

    public static boolean isOdd(int n)
    {
        return (n % 2 == 1);
    }

    public static boolean isMultipleOfThree(int n)
    {
        return (n % 3 == 0);
    }

    public static boolean isOddAndIsMultipleOfThree(int n)
    {
        return (n % 2 == 1 && n % 3 == 0);
    }

    public static String repeatStringXTimes(String input, int times)
    {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        String newStr = "";
        if(times <= 0)
        {
            return "";
        }
        else
        {
            for(int i = 1; i <= times; i++)
            {
                newStr += input;
            }
        }
        return newStr;
    }

    public static String returnStringUntilQ(String input)
    {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".
        String substringQ;
        if (!input.contains("q")) {
            return"";
        }
        else {
            int indexQ = input.indexOf("q");
            substringQ = input.substring(0, indexQ);
        }
        return substringQ;
    }

    public static Person declareAndReturnPersonNamedAda()
    {
        Person myPerson = new Person("Ada");
        return myPerson;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon()
    {
        Person myPerson = new Person("Alan Turing");
        myPerson.setCity("London");
        return myPerson;
    }

    public static boolean isFromLondon(Person person)
    {
        return (person.getCity() == "London");
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces()
    {
        ArrayList<Place> myArrayOfPlaces = new ArrayList<Place>();
        Place london = new Place("London");
        myArrayOfPlaces.add(london);
        Place newYork = new Place("New York");
        myArrayOfPlaces.add(newYork);
        Place Chicago = new Place("Chicago");
        myArrayOfPlaces.add(Chicago);

        return myArrayOfPlaces;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper()
    {
        // The HashMap should have key-value pairs of:
        // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
        // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
        HashMap<String, Person> myHashMap = new HashMap<String, Person>();
        Person alan = declareAndReturnPersonNamedAlanTuringFromLondon();
        Person grace = new Person("Grace Hopper");
        grace.setCity("Arlington");
        myHashMap.put("Alan Turing", alan);
        myHashMap.put("Grace Hopper", grace);
        return myHashMap;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people)
    {
            people.get("Alan Turning").setCity("Princeton");

    }


    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers()
    {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers()
    {

    }
}
