package Section_06_Control_Flow;

public class AllFactors {

    // This was one of the first exercises with which I learned control flow statements (in this case the for cycle)
    // The next paragraph were the instructions

    // Write a method named printFactors with one parameter of type int named number.
    // The method should print all factors of the number.
    // A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).

    public static void printFactors(int number){

        if (number < 1){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++){

            if (number % i == 0){
                System.out.println(i);
            }
        }
    }
}
