package Section_05_Expressions_Statements_and_More;

public class BarkingDog {

//    We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
//    Write a method shouldWakeUp that has 2 parameters.
//    1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
//    2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
//    We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
//    In all other cases return false.
//    If the hourOfDay parameter is less than 0 or greater than 23 return false.
    public static boolean shouldWakeUp(boolean barking, int hours){
        if (hours < 0 || hours > 23){
            return false;
        }

        if (barking && hours < 8 || hours > 22){
            System.out.println("The dog is barking");
            return true;
        }

        else {
            System.out.println("The dog is not barking");
            return false;
        }
    }
}
