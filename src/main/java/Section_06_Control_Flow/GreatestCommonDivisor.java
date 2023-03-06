package Section_06_Control_Flow;

public class GreatestCommonDivisor {

/*Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of the two numbers (int).*/
    public static int bruteForce(int first, int second, int third){

        int gcd = 1;

        for (int i = 1; i < first || i < second || i < third; i++){

            if (first % i == 0 && second % i == 0 && third % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static int euclidsAlgorithm(int first, int second){
        if (second == 0) {
            return first;
        }
        return euclidsAlgorithm(second, first % second);
    }
}
