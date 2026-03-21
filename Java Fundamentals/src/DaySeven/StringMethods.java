package DaySeven;
import java.util.*;

public class StringMethods {
    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "Let Us Learn Java";

        System.out.println("Original/ first String: " + s1);

        System.out.println("Length of string: " + s1.length());//calculate length of string (count space also)

        System.out.println("Uppercase: " + s1.toUpperCase());// convert all the string letters to upeer case

        System.out.println("Lowercase: " + s1.toLowerCase()); // convert all the string members to lower case

        System.out.println("Character at index 4: " + s1.charAt(4));  // give the letter at respective or asked index number

        System.out.println("Substring from index 0 to 5: " + s1.substring(0,5)); // give lellers from give index range ex. from index 0 to 5

        System.out.println("s1 equals s2: " + s1.equals(s2));// equals()

        System.out.println("Ignore case comparison: " + s1.equalsIgnoreCase("hello world"));// compare number of letters in 2 strings and check whether it is equal or not

        System.out.println("Contains 'World': " + s1.contains("World"));//check if the specific word is present in string or not ->  contains()

        System.out.println("Replace World with Java: " + s1.replace("World","Java"));// replace the given word with a word in a string replace()

        System.out.println("Starts with Hello: " + s1.startsWith("Hello")); // check whether s1 string starts with "Hello word or not  "startsWith()

        System.out.println("Ends with World: " + s1.endsWith("World")); // check if ends with given word or not  -> endsWith()

        System.out.println("Index of 'o': " + s1.indexOf('o'));//  indexOf()

        System.out.println("Last index of 'o': " + s1.lastIndexOf('o'));// find last index of given letter -> lastIndexOf()

        System.out.println("Concatenated string: " + s1.concat(" - Learning Java"));// add the given new string to prev string (concatenate) concat()
    }
}


