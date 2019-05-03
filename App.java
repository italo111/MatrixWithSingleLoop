package project;
import util.ArrayUtil;
import matrix.MatrixArray;
/**
 *
 * @author OWNER
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //accessing a static method
       int [] rnds = ArrayUtil.createRandomArray(15,100);
       System.out.println("15 Elements of the random Array");
       System.out.println("-----------------------------------------");
       ArrayUtil.printArray(rnds);
       System.out.println("-----------------------------------------");
       System.out.println("");
       System.out.println("Array Sum = " +ArrayUtil.getSum(rnds));
       System.out.println("Array Elements below the average = " +
               ArrayUtil.numBelowAverage(rnds));
       System.out.println("Array Maximum = " + ArrayUtil.getMaximum(rnds));
        System.out.println("Array Minimum = " + ArrayUtil.getMinimum(rnds));
        System.out.println("\n\n");
       System.out.println("-----------------------------------------");
       System.out.println("Elements of a 10x10 MatrixArray");
       System.out.println("-----------------------------------------");
       MatrixArray matrixArray = new MatrixArray(10,10);
       matrixArray.consolePrint();
       System.out.println("Sum of matrix = " + matrixArray.getSum());
       System.out.println("Average of matrix = " + matrixArray.getAverage());
       System.out.println("-----------------------------------------");
       System.out.println("\n");
       matrixArray.changeEvenColsPattern();
       matrixArray.consolePrint();
       System.out.println("Sum of matrix = " + matrixArray.getSum());
       System.out.println("Average of matrix = " + matrixArray.getAverage());
       System.out.println("-----------------------------------------");
       System.out.println("\n");
       matrixArray.changeAllEvenPattern();
       matrixArray.consolePrint();
       System.out.println("Sum of matrix = " + matrixArray.getSum());
       System.out.println("Average of matrix = " + matrixArray.getAverage());
       System.out.println("-----------------------------------------");
       System.out.println("\n");
       
       }
    }
    

