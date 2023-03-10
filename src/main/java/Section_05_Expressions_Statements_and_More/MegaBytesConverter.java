package Section_05_Expressions_Statements_and_More;

public class MegaBytesConverter {

/* Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
The method should not return anything (void) and it needs to calculate the megabytes
and remaining kilobytes from the kilobytes parameter.
Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.*/
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes = kiloBytes / 1024;
        int remainingBytes = kiloBytes % 1024;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingBytes + " KB");
        }
    }
}
