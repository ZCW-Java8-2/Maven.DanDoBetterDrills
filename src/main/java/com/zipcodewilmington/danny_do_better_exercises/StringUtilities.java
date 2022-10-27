package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment) {
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment) {
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input) {
        return input.substring(0, 3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input) {
        //when String is less than 3 characters
        if (input.length() < 3) {
            return input;
        //when String is more than 3 characters
        } else {
            return input.substring(input.length() - 3);
        }
    }

        /**
         * @param inputValue the value to be compared
         * @param comparableValue the value to be compared against
         * @return the equivalence of two strings, `inputValue` and `comparableValue`
         */
        public static Boolean compareTwoStrings (String inputValue, String comparableValue){
            return inputValue.equals(comparableValue);
        }

        /**
         * @param inputValue the value input from user
         * @return the middle character of `inputValue`
         */
        public static Character getMiddleCharacter (String inputValue) {
            //when the total character is an even number
            if (inputValue.length() % 2 == 0) {
                return inputValue.charAt((inputValue.length()) / 2 - 1);
            //when the total character is an odd number
            } else {
                return inputValue.charAt(inputValue.length() / 2);
            }
        }

        /**
         * @param spaceDelimitedString a string, representative of a sentence, containing spaces
         * @return the first sequence of characters
         */
        public static String getFirstWord (String spaceDelimitedString) {
            //when the String contains more than 1 word
            if (spaceDelimitedString.contains(" ")) {
                int i = spaceDelimitedString.indexOf(" ");
                return spaceDelimitedString.substring(0, i);
            //when the String contains only 1 word
            } else {
                return spaceDelimitedString;
            }
        }

        /**
         * @param spaceDelimitedString a string delimited by spaces
         * @return the second word of a string delimited by spaces.
         */
        public static String getSecondWord (String spaceDelimitedString) {
            //create an int for the first space bar
            int i = spaceDelimitedString.indexOf(" ");
            //when the String contains only 1 word
            if (!spaceDelimitedString.contains(" ")) {
                return "Too Short";
                //when the String contains more than 1 word
            } else {
               String[] sentence = spaceDelimitedString.split(" ");
               return sentence[1];
            }
        }


        /**
         * @param stringToReverse
         * @return an identical string with characters in reverse order.
         */
        public static String reverse (String stringToReverse){
            //Create StringBuilder object
            StringBuilder sentence = new StringBuilder();
            //Append the String into StringBuilder
            sentence.append(stringToReverse);
            //Flip the StringBuilder
            sentence.reverse();
            //Convert StringBuilder back into String
            stringToReverse = sentence.toString();
            //return String
            return stringToReverse;

        }
    }

