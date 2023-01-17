package Q1;
import java.util.*;
import java.text.*;

public class Q1L1 {
    public static void main(String args[]) {
        myHeader(1);                                //calling my header

        Scanner scan = new Scanner (System.in);             //this is a Scanner

        System.out.print("Enter an integer number: ");
        int num1 = scan.nextInt();                          //getting int user input
        while(num1<0){                                      //method to validate non-zero and positive number
            System.out.print("Enter an integer number: ");  //validating zero or positive number
            num1 = scan.nextInt();
            if(num1>=0){
                break;
            }
        }

        //reference variables
        double result = 1;
        int i =1;
        long activateTime, executeTime, totalTime;

        //number formatting for output statement
        NumberFormat numFormat1 = new DecimalFormat("0.##E0");       //two hashtag means decimal place and 0 means digit
        NumberFormat numFormat2 = new DecimalFormat("0.E0");         //two hashtag means decimal place and 0 means digit

        //iterative method inside the main method
        activateTime = System.nanoTime();                                   //active time
        while(i<=num1){                                                     //factorial iterative method
            result=result*i;
            i++;
        }
        executeTime = System.nanoTime();                                    //execute time
        totalTime = executeTime - activateTime;                             //total time for main iterative method

        System.out.printf("Factorial (%d) is %s \n",num1, numFormat2.format(result));
        System.out.println("Time taken by iterative solution inside main: " + numFormat1.format(totalTime) + "sec");

        //active, execute time wrapped around the iterative code
        activateTime = System.nanoTime();
        System.out.printf("Factorial (%d) with iterative method is %s \n",num1, numFormat2.format((iterativeFactorial(num1))));
        executeTime = System.nanoTime();
        totalTime = executeTime - activateTime;

        System.out.println("Time taken by iterative method call: " + numFormat1.format(totalTime) + "sec");

        //active, execute time wrapped around the recursive code
        activateTime = System.nanoTime();
        System.out.printf("Factorial (%d) with recursive method is %s \n",num1, numFormat2.format((recursiveFactorial(num1))));
        executeTime = System.nanoTime();
        totalTime = executeTime - activateTime;

        System.out.println("Time taken by recursive method call: " + numFormat1.format(totalTime) + "sec");

        myFooter(1);                        //footer
    }
    //This is myHeader method containing my name and student number
    public static void myHeader(int labNum){
        System.out.println("=====================================================");
        System.out.printf("Lab Exercise %d-Q1 \n", labNum);
        System.out.println("Prepared By: Dasol Lim");
        System.out.println("Student Number: 251224110");
        System.out.println("Goal of this Exercise: Checking the code-execution time!");
        System.out.println("=====================================================");
    }
    //This is myFooter containing a good-bye message
    public static void myFooter(int labNum){
        System.out.printf("Completion of Lab Exercise %d-Q1 is successful! \n", labNum);
        System.out.println("Signing off - Dasol Lim");
    }
    //This is an iterative method for factorial
    public static double iterativeFactorial(int n){
        double result = 1, i =1;
        while(i<=n){
            result=result*i;                        //factorial iterative method
            i++;
        }return result;                             //since factorial of 0 is 1
    }
    //This is a recursive method for factorial
    public static double recursiveFactorial(int n){
        if(n==0){                                   //base case
            return 1;                               //since factorial of 0 is 1
        } else {
            return n*recursiveFactorial(n-1);   //this is a recursive call: n*(n-1)*(n-2)..*1(
        }
    }

}
