package Section_06_Control_Flow;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int sum = 0;
        for (int div = 1; div < number; div++){
            if (number % div == 0){
                sum += div;
            }
        }
        return sum == number;
    }
}
