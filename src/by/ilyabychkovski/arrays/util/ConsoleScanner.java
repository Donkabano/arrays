package by.ilyabychkovski.arrays.util;

import java.io.Closeable;
import java.util.Scanner;

public class ConsoleScanner implements Closeable {

    private final Scanner scanner;

    public ConsoleScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void close() {
        scanner.close();
    }

    public int getInt() {
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
