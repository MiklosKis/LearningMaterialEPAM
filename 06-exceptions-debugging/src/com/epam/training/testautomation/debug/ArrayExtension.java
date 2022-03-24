package com.epam.training.testautomation.debug;

import java.util.Arrays;

public class ArrayExtension {

    private int[] numbers;

    private ArrayExtension(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "ArrayExtension{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    private void addToNumbers(int number) {
        int[] extendedArray = Arrays.copyOf(numbers, numbers.length + 1);
        extendedArray[numbers.length] = number;
        numbers = extendedArray;
    }

    /**
     * Removes every occasion of the parametered number from the numbers array.
     * @param numberToRemove the number to be removed from the numbers array
     */
    private void removeFromNumbers(int numberToRemove) {
        int[] decreasedArray = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] != numberToRemove) {
                decreasedArray[i] = numbers[i];
            }
        }

        numbers = decreasedArray;
    }

    public static void main(String... args) {
        ArrayExtension ae = new ArrayExtension(new int[]{1, 2, 3, 4});
        System.out.println(ae); // Should be [1, 2, 3, 4].

        ae.addToNumbers(5);
        ae.addToNumbers(3);
        ae.addToNumbers(6);
        System.out.println(ae); // Should be [1, 2, 3, 4, 5, 3, 6].

        ae.removeFromNumbers(3);
        ae.removeFromNumbers(5);
        System.out.println(ae); // Should be [1, 2, 4, 6].
    }
}
