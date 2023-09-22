import java.io.Console;
import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    static Storage storage;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        storage = new Storage();



    }
    private static int readInt(Scanner input) {
        while (true) {
            String line = input.nextLine();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.err.println("Error: wrong integer");
            }
        }
    }

    private static void startValue(Scanner input) throws ScannerException {
        System.out.println("Введите значения: ");
        int value = readInt(input);


    }

}
