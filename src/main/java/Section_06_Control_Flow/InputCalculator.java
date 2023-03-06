package Section_06_Control_Flow;

import java.util.Scanner;

public class InputCalculator {
/*Write a method called inputThenPrintSumAndAverage that does not have any parameters.
The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.*/

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double average = 0;
        int count = 0;
        while (true){
            boolean hasInt = scanner.hasNextInt();
            if (hasInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else break;
        }
        average = Math.round(sum / count);
        System.out.println("SUM = " + (long)sum + " AVG = " + (long)average);
        scanner.close();
    }
}
