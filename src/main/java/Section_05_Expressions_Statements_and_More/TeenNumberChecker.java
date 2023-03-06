package Section_05_Expressions_Statements_and_More;

public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3){
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }
    public static boolean isTeen(int age){
        return age >= 13 && age <= 19;
    }
}
