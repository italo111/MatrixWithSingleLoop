package util;
import java.util.Random;


public class ArrayUtil {
    public static final String VERSION = "1.27";
    //class method not an instance method
    public static int[] createRandomArray(int length, int randomBound){
        int [] array = new int[length];
        Random generator = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = generator.nextInt(randomBound + 1);
        }
        return array;
    }
    public static double getAverage(int[] theArray){
        int counter = 0;
        for(int i = 0; i < theArray.length; i++){
            counter = counter + theArray[i];
        }
        //int divided by a double thanks to the casting
        double average = counter/(double)theArray.length;
        return average;
    }
    
    public static double getSum(int [] theArray){
        double sum = 0;
        for(int i = 0; i < theArray.length; i++){
            sum = sum + theArray[i];
        }
        return sum;
    }
    public static int getMaximum(int[] theArray){
        int maximum = theArray[0];
        for(int i = 1; i< theArray.length; i++){
            if(theArray[i] > maximum){
                maximum = theArray[i];
            }
        }
        return maximum;
    }
    
    public static int getMinimum(int[] theArray){
        int minimum = theArray[0];
        for(int i = 1; i< theArray.length; i++){
            if(theArray[i] < minimum){
                minimum = theArray[i];
            }
        }
        return minimum;
    }
    public static int numBelowAverage(int[] theArray){
        int sum = 0;
        for(int i = 0; i< theArray.length; i++){
            sum = sum + theArray[i];
        }
        double average = sum/theArray.length;
        int count = 0;
        for(int i = 0; i < theArray.length; i++){
            if(theArray[i] < average){
                count++;
            }
        }
        return count;
    }
    public static void printArray(int[] theArray){
        for(int i = 0; i < theArray.length; i++){
            if(i == theArray.length -1)
            System.out.print(theArray[i] + "\n");
            else{
                System.out.print(theArray[i] + ",");
            }
        }
    }
    
}
