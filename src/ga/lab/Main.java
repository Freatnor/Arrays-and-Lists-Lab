package ga.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

        String charString;
        double summedDoubles;
        int middleValue;

      //Problem 1:
      stringLengthOrValue("I said");
      stringLengthOrValue("hey");
      stringLengthOrValue("whats up?");
      stringLengthOrValue("hello!");

      //Problem 2:
      reversedOrder();

      //Problem 3:
      maxValue(new int[]{2, 52, 7, 91, 10, 12});
      maxValue(new int[]{12, 1, 11});
      maxValue(new int[]{0, 14});
      maxValue(new int[]{100, 23, 29, 101, 1});

      //Problem 4:

      summedDoubles = sumOfValues(new double[]{12.1, 13.9, 7.0});
        System.out.println(summedDoubles);
      //how do we print a variable to the command line

      System.out.println(sumOfValues(new double[]{1.23, 2.09, 9.2}));
      //how do we print a variable to the command line

      System.out.println(sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99}));
      //how do we print a variable to the command line

      System.out.println(sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0}));
      //how do we print a variable to the command line


      //Problem 5:
      charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(charString);
      //how do we print a variable to the command line

        charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
        System.out.println(charString);
      //how do we print a variable to the command line

      charString = charsToString(new char[]{'I', ' ', 'a','m', ' '});
        System.out.println(charString);
      //how do we print a variable to the command line

      charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
        System.out.println(charString);
      //how do we print a variable to the command line

      //Problem 6:
      //Put your code for problem 6 here
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Luke", "Han", "Leia", "R2D2", "Chewie"));

      //Problem 7:
      reversedStringOrder(stringArrayList);

      //Problem 8:
      printOrAdd(stringArrayList);

      //Problem 9:
      //Create an int array of an odd size, with the variable name 'oddSizedArray'
      //Make sure the size is at least 5.
        int[] oddSizedArray = new int[]{1, 3, 5, 7, 9};

      //Problem 10:
      findMiddle(oddSizedArray);
      //how do we print a variable to the command line

      middleValue = findMiddle(new int[]{2,7,9,12,15});
        System.out.println(middleValue);
      //how do we print a variable to the command line

      middleValue = findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10});
        System.out.println(middleValue);
      //how do we print a variable to the command line

      middleValue = findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145});
        System.out.println(middleValue);
      //how do we print a variable to the command line

    }

    public static void stringLengthOrValue(String s){
        if (s.length() > 5)
            System.out.println(s);
        else
            System.out.println(s.length());
    }

    public static void reversedOrder(){
        int[] iA = new int[10];
        for(int i = 0; i < iA.length; i++){
            iA[i] = i;
        }
        for(int i = (iA.length - 1); i >= 0; i--){
            System.out.println(iA[i]);
        }
    }

    public static int maxValue(int[] intArray){
        int maxValue = intArray[0];
        if(intArray.length < 2)
            return maxValue;
        for(int i = 1; i < intArray.length; i++){
            if(intArray[i] > maxValue)
                maxValue = intArray[i];
        }
        return maxValue;
    }

    public static double sumOfValues(double[] doubArray){
        double summedDoubles = 0;
        for(int i =0; i<doubArray.length; i++){
            summedDoubles += doubArray[i];
        }
        //System.out.println(summedDoubles);
        return summedDoubles;
    }

    public static String charsToString(char[] charArray){
        String returnString = "";
        for(int i = 0; i < charArray.length; i++){
            returnString = returnString + charArray[i];
        }
        return returnString;
    }

    public static void reversedStringOrder(List<String> stringList){
        for(int i = (stringList.size() - 1); i >= 0; i--){
            System.out.println(stringList.get(i));
        }
        return;
    }

    public static void printOrAdd(List<String> stringList){
        if(stringList.size() < 10){
            stringList.add("Java");
            return;
        }
        reversedStringOrder(stringList);
        return;
    }

    public static int findMiddle(int[] intArray){
        return intArray[intArray.length /2];
    }

    //declare your functions
}
