package by.ilyabychkovski.arrays.util;

public final class ConsolePrinter {

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
