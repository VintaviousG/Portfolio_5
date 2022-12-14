import java.util.Scanner;

public class Main {
    /*
     * Student Name: Vintavious Gilbert
     * StudentId: 900351224 
     * Class: CSCI 3122 Data Structures
     * Assignment: Portfolio 5
  
     */
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please Enter Your Sentence For checking");
            String userSentence = scanner.nextLine().toLowerCase();

            System.out.println("Your sentence has been lower cased: " + userSentence);

         

            // Array of Special Characters

            // In this for loop we are looping over the snetence and check for vowels,
            // consonats.
            int countVowels = 0 ,countConsonants = 0, countSpecialCharacters = 0;
            int i = 0;
            while (i < userSentence.length()) {
                //We will check the character at each postion to see if it its in the if statement
                // If it is we will add it to a count variable and use to print he total count later
                char ch = userSentence.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countVowels++;
                }

                // Check number of consonants
                if (ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch == 'g' || ch == 'j' || ch == 'k' || ch == 'l'
                        || ch == 'm' || ch == 'n' || ch == 'p' || ch == 'q' || ch == 's' || ch == 't' || ch == 'v'
                        || ch == 'x' || ch == 'z' || ch == 'h' || ch == 'r' || ch == 'w' || ch == 'y') {
                    countConsonants++;

                }

                // Check number of Special Characters
                /*
                I dont know whiuch specfic special characters are so I search some up and place inn the if statement for checking.
                Other than that. If any of theese character are in te sentence we will keep a count of the characters
                **/

                if (ch == '`' || ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&'
                        || ch == '*' || ch == '(' || ch == ')' || ch == '_' || ch == '=' || ch == '{' || ch == '}'
                        || ch == '[' || ch == ']' || ch == '|' || ch == ':' || ch == ';' || ch == '"' || ch == '<'
                        || ch == '>' || ch == '?' || ch == ',' || ch == '.' || ch == '/' || ch == '`'
                        || ch == '*' || ch == '+' || ch == '-' || ch == ':' || ch == ';' || ch == '"') {
                    countSpecialCharacters++;

                }

                //Count of all values or items in the string the user entered
                i++;
            }
            //The statement below prints out the number of vowels, Consonants, and Special characters and total number things in the sentence.
            System.out.println(i);
            System.out.println("Number of vowels in the given sentence is " + countVowels);
            System.out.println("Number of consonats in the given sentence is: " + countConsonants);
            System.out.println("Number of Special Characters in the given sentence is: " + countSpecialCharacters);
        }

    }

}