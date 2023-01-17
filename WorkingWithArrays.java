package Q2;
import java.util.Scanner;
public class WorkingWithArrays {
    public static void main(String args[]) {
        myHeader(2);                            //header method
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = scan.nextInt();                 //user input
        int[] array = new int[arraySize];               //instantiating int array

        for (int i = 0; i < arraySize; i++) {           //populating array in array using arraySize
            System.out.print("Enter Value " + (i+1) + ": ");
            int arrayPopulate = scan.nextInt();
            array[i] = arrayPopulate;
        }

        double[] mma5Array = mma5MethodDasol(array);    //calling public static mma5 method
        if (mma5Array == null) {                        //conditional statement for output
        } else {
            System.out.printf("The max is %.2f \n",mma5Array[0]);
            System.out.printf("The min is %.2f \n",mma5Array[1]);
            System.out.printf("The average of the numbers divisible by 5 is %.2f \n", mma5Array[2]);
            System.out.print("My student number is 251224110 \n");
        }
        myFooter(2);                             //footer method
}
    //double-type method with integer parameter
    public static double[] mma5MethodDasol(int[] oneArray){
        double[] mmaArray = new double[3];              //for double-type reference return

        //reference variables
        int maxValue = oneArray[0];
        int minValue = oneArray[0];
        double sum = 0;
        int count = 0;
        double averageValue;

        //
        for(int i=0; i<oneArray.length; i++) {          //checking through all the array index
            if (oneArray[i] % 5 == 0) {
//                Math.max(maxValue, oneArray[i]);        //finding max
//                Math.min(minValue, oneArray[i]);        //finding min
                if (oneArray[i] < minValue) {         //calculating the minValue
                    minValue = oneArray[i];
                }
                if (oneArray[i] > maxValue) {         //calculating the maxValue
                    maxValue = oneArray[i];
                }
                sum += oneArray[i];                     //sum of divisible by 5 arrays
                count++;
            }
        }

        System.out.println("\nHere is the result......");

        //conditional statement for the method output
        if(count==0){
            mmaArray = null;
            System.out.println("In the array, there was no number divisible by 5");
        } else {
            averageValue = sum/count;
            System.out.println("Found " + count + " numbers that are divisible by 5");
            //assigning values to mmaArray for double-type output
            mmaArray[0] = maxValue;
            mmaArray[1] = minValue;
            mmaArray[2] = averageValue;
        }

        return mmaArray;
    }
    public static void myHeader(int labNum){
        System.out.println("=====================================================");
        System.out.printf("Lab Exercise %d-Q1 \n", labNum);
        System.out.println("Prepared By: Dasol Lim");
        System.out.println("Student Number: 251224110");
        System.out.println("Working with arrays and conitional statements!");
        System.out.println("=====================================================");
    }
    //This is myFooter containing a good-bye message
    public static void myFooter(int labNum){
        System.out.printf("Completion of Lab Exercise %d-Q1 is successful! \n", labNum);
        System.out.println("Signing off - Dasol Lim");
    }
}
