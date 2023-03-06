package Section_06_Control_Flow;

public class SumOdd {
    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        }
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (start < 0 || end < 0 || end < start){
            return -1;
        }

        for (int i = start; i <= end; i++){
            if (isOdd(i)){
                sum += i;
                System.out.println(i + " is an odd number");
            }
        }
        System.out.println(sum);
        return sum;
    }
}
