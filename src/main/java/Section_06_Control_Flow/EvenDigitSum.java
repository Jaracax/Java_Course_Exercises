package Section_06_Control_Flow;

public class EvenDigitSum {
    /*Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value. */

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;

        while (number > 0){

            int digit = number % 10;
            if (digit % 2 == 0){
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
