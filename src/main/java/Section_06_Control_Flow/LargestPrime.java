package Section_06_Control_Flow;

public class LargestPrime {

/*Write aW method named getLargestPrime with one parameter of type int named number.
If the number is negative or does not have any prime numbers,
the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.
*/
    public static int getLargestPrime(int number){

        int div = 2;
        if (number < 2){
            return -1;
        }

        while (div < number){
            if (number % div != 0){
                div++;
            } else {
                number = number / div;
                div = 2;
            }
        }
        return number;
    }
}
