package by.ilyabychkovski.arrays.util;

public final class ArrayUtil {

    public static int[] createArray(int length) {
        return new int[length];
    }

    public static int countZeroNumbers(int[] numbers) {

        int amount = 0;

        for (int number : numbers) {

            if (number == 0) {
                amount++;
            }
        }
        return amount;
    }

    public static int countPositiveNumbers(int[] numbers) {

        int amount = 0;

        for (int number : numbers) {

            if (number > 0) {
                amount++;
            }
        }
        return amount;
    }

    public static int countNegativeNumbers(int[] numbers) {

        int amount = 0;

        for (int number : numbers) {

            if (number < 0) {
                amount++;
            }
        }
        return amount;
    }

    public static int performNewArrayAndGetAmountOfNewNumbers(int[] numbers, int highest) {

        int amount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > highest) {
                numbers[i] = highest;
                amount++;
            }

        }
        return amount;
    }

    public static long getSumOfAliquotNumbers(int[] numbers, int aliquotNumber) {

        long sum = 0;

        for (int number : numbers) {

            if (number % aliquotNumber == 0) {
                sum += number;
            }

        }

        return sum;
    }

    public static void bubbleSort(int[] numbers) {

        for (int i = numbers.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }

            }

        }
    }

    public static int[] createArrayWithDivisionedNumbers(int[] numbers) {

        int[] newNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i] % 10;
        }

        return newNumbers;
    }

    public static int getMaxValue(int[] numbers) {

        int maxValue = numbers[0];
        for (int number : numbers) {

            if (number > maxValue) {
                maxValue = number;
            }

        }
        return maxValue;
    }

    public static int getMinValue(int[] numbers) {

        int minValue = numbers[0];
        for (int number : numbers) {

            if (number < minValue) {
                minValue = number;
            }

        }
        return minValue;
    }

}
