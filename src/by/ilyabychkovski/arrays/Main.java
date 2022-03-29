package by.ilyabychkovski.arrays;

import by.ilyabychkovski.arrays.util.ArrayUtil;
import by.ilyabychkovski.arrays.util.ConsolePrinter;
import by.ilyabychkovski.arrays.util.ConsoleScanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ConsoleScanner console = new ConsoleScanner(new Scanner(System.in));

        int arrayLength = console.getInt();
        int[] array = ArrayUtil.createArray(arrayLength);

        for (int i = 0; i < array.length; i++) {
            array[i] = console.getInt();
        }
        ConsolePrinter.printArray(array);
        ArrayUtil.swapMaxAndMin(array);
        ConsolePrinter.printArray(array);

        console.close();
    }

}
