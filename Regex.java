import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    /*
     * REGEX or Regular Expression is a kind of pattern that can be applied to a
     * string
     * For eg. When we enter password on any website there are certain set of rules
     * to enter your password like it should contain Uppercase , Lowercase , Special
     * character , etc. These Rules or set of rules are defined by using REGEX
     * feature in java
     * REGEX is introduced after 1.4 version of java
     * You can import it using java.util.regex package in java
     * IT contain three classes:
     * 1. Pattern Class = We can make/define patterns using this like Email pattern
     * , Mobile number pattern , etc.
     * #It is a compiled version of REGEX & used to define pattern in REGEX.
     * #It doesn't have any constructor to create the object . To get object you can
     * call its static method compile. For Eg: Pattern pattern =
     * Pattern.compile("string")
     * 
     * 2. Matcher Class = It matches text . Used to compare the correct password
     * with the user entered password.
     * # It is used to match character sequence
     * # To get the object you can call pattern object matcher method .
     * Eg. Pattern pattern = Pattern.compile("String")
     * Eg. Matcher matcher = pattern.matcher("Character Sequence")
     * 
     * 3. Pattern Syntax Exception class = Unchecked exception thrown to indicate a
     * syntax error in a regular-expression pattern.
     */
    public static void main(String[] args) {

        /* 1. PATTERN CLASS Example */
        // It will print TRUE because whole regex string matches with whole input string
        System.out.println(Pattern.matches("shoryarastogi", "shoryarastogi"));
        // It will print FALSE because the input string not matches with regex string
        System.out.println(Pattern.matches("shoryaras*ogi", "geeksforgeeks"));

        /* 2. PATTERN SEARHING / MATCHER CLASS Example */
        Pattern pattern = Pattern.compile("shorya");// The text we want to find

        Matcher m = pattern.matcher("shoryarastogi");// The text from which we want to find

        while (m.find()) {
            System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
        }

    }
}
