package com.zipcodewilmington;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>(0);

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array [1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length -1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
          return Arrays.asList(array).contains(value);

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
            String[] str = new String[array.length];
            int endOfFirstArray = array.length - 1;
            int index = 0;
            for (int i = endOfFirstArray; i >= 0; i--) {
                str[index] = array[i];
                index++;
            }
            return str;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String[] reversed = reverse(array);

        for(int i = 0; i < array.length; i++) {
            if (array[i].equals(reversed[i]) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String[] alpha = "abcdefghijklmnopqrstuvwxyz".split("");
        ArrayList<String> letters = new ArrayList(Arrays.asList(alpha));

        //For each string in the array, remove all letters in that string from list
        for(int i = 0; i < array.length; i++){
            removeLetters(letters, array[i]);
        }

        //if there are no letters left, then the array contained all letters. Otherwise, it was not pangramic
        return letters.size() == 0;
    }

    public static List<String> removeLetters(ArrayList<String> letters, String value){
        //Send string to lowercase, so we can still match any uppercase letters
        value = value.toLowerCase();

        //Examine each letter of the value string, remove them if they're in the letters list
        for(int i = 0; i < value.length(); i++){
            Character currentLetter = value.charAt(i); //Capture Current letter of value string
            int indexOfLetterInList = letters.indexOf(currentLetter.toString()); //Get index of current letter in letters list
            if(indexOfLetterInList >=0){  //If letter was in list, remove it
                letters.remove((indexOfLetterInList));
            }

        }
        return letters;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        /*
        * Use the array to create an array list
        * call .removeAll(valuetoRemove) on that created array list
        * return yourArrayList.toArray()
        * */


        int size = array.length - getNumberOfOccurrences(array, valueToRemove);
        int subIndex = 0;
        String[] result = new String[size];

        for(int i = 0; i < array.length; i++){
            if(array[i] != valueToRemove){ //If this is a word we need to add
                result[subIndex++] = array[i];
            }
        }

        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
