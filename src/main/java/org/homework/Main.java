package org.homework;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] countEvens1 = {2, 1, 2, 3, 4};
        int[] countEvens2 = {2, 2, 0, 0};
        int[] countEvens3 = {1, 3, 5};
        System.out.println("Первый массив: " + Arrays.toString(countEvens1));
        System.out.println("Второй массив: " + Arrays.toString(countEvens2));
        System.out.println("Третий массив: " + Arrays.toString(countEvens3));
        // 1. Написать метод, возвращающий количество чётных элементов массива.

        System.out.println("Количество четных элементов первого массива: " + returnEvenNumbers(countEvens1));
        System.out.println("Количество четных элементов второго массива: " + returnEvenNumbers(countEvens2));
        System.out.println("Количество четных элементов третьего массива: " + returnEvenNumbers(countEvens3));
        // 2. Написать функцию, возвращающую разницу между самым большим и самым маленьким
        // элементами переданного не пустого массива.
        System.out.println("Разница между большим и меньшим элементами первого массива: "
                + returnDifferenceOfMaxAndMinElements(countEvens1));
        System.out.println("Разница между большим и меньшим элементами второго массива: "
                + returnDifferenceOfMaxAndMinElements(countEvens2));
        System.out.println("Разница между большим и меньшим элементами третьего массива: "
                + returnDifferenceOfMaxAndMinElements(countEvens3));
        // Написать функцию, возвращающую истину, если в переданном массиве есть два
        // соседних элемента, с нулевым значением.
        System.out.println("В переданном первом массиве есть 2 соседних элемента, с нулевым значением: "
                + zeroElementsAreNear(countEvens1));
        System.out.println("В переданном втором массиве есть 2 соседних элемента, с нулевым значением: "
                + zeroElementsAreNear(countEvens2));
        System.out.println("В переданном третьем массиве есть 2 соседних элемента, с нулевым значением: "
                + zeroElementsAreNear(countEvens3));
    }

    /**
     * 1. Написать метод, возвращающий количество чётных элементов массива.
     * countEvens([2, 1, 2, 3, 4]) → 3
     * countEvens([2, 2, 0]) → 3
     * countEvens([1, 3, 5]) → 0
     */
    public static int returnEvenNumbers(int[] array) {
        int counter = 0;
        for (int countEven : array) {
            if (countEven % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * 2. Написать функцию, возвращающую разницу между самым большим и самым ма-
     * леньким элементами переданного не пустого массива.
     */
    public static int returnDifferenceOfMaxAndMinElements(int[] array) {
        int countEvenMax = Arrays.stream(array).max().getAsInt();
        int countEvenMin = Arrays.stream(array).min().getAsInt();
        int result = countEvenMax - countEvenMin;
        return result;
        }


    /**
     * 3. Написать функцию, возвращающую истину, если в переданном массиве есть два
     * соседних элемента, с нулевым значением.
     */
    public static boolean zeroElementsAreNear(int[] array){
        for (int i : array) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }
}