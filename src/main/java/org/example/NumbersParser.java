package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersParser {

    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        System.out.println(Arrays.toString(sortNumbers(inputArray))); // Output: 0, 1, 2, 4, 5
    }

    public static List<Integer> parseNumbers(String str) {
        List<Integer> numbers = new ArrayList<>();
        String[] tokens = str.split(",");
        for (String token : tokens) {
            token = token.trim();
            numbers.add(Integer.parseInt(token));
        }
        return numbers;
    }

    public static int[] sortNumbers(String[] inputArray) {
        List<Integer> numbersList = new ArrayList<>();
        for (String str : inputArray) {
            numbersList.addAll(parseNumbers(str));
        }
        return numbersList.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}