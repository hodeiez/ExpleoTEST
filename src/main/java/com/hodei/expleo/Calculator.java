package com.hodei.expleo;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Hodei Eceiza
 * Date: 3/27/2021
 * Time: 22:51
 * Project: Expleo
 * Copyright: MIT
 */
public class Calculator {

    private boolean isOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '/' || operator == '*';

    }

    private static double operate(char operator, double operand1, double operand2) {
        return switch (operator) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '/' -> operand1 / operand2;
            case '*' -> operand1 * operand2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

    private static List<Character> stringToArray(String input) {
        return input.trim().chars().
                mapToObj(e -> (char) e)
                .collect(Collectors.toList());
    }

    public double calculateLevel1(String input) {

        List<Character> array = stringToArray(input);

        for (Character c : array) {
            if (isOperator(c)) {
                return operate(c,
                        Double.parseDouble(input.substring(0, array.indexOf(c))),
                        Double.parseDouble(input.substring(array.indexOf(c) + 1)));
            }
        }
        return -1;

    }

    public double calculateLevel2(String input) {
        double result = 0;
        int counter = 1;
        List<Character> array = stringToArray(input);
        String[] split = input.split("[-+*/]");

        for (int i = 0; i < array.size(); i++) {
            if (isOperator(array.get(i))) {
                result = operate(array.get(i), Double.parseDouble(split[0]), Double.parseDouble(split[counter]));
                split[0] = String.valueOf(result);
                counter++;
            }
        }
        return result;

    }

    public double calculateLevel3(String input) {
        double result;
        String newInput = stringToArray(input).stream()
                .map(String::valueOf)
                .map(String::trim)
                .collect(Collectors.joining());
        System.out.println(newInput);
        String[] split = newInput.split("[-+]");
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() > 2) {
                result = calculateLevel1(split[i]);
                var newSplit = newInput.replace(split[i], result + "");
                return calculateLevel2(newSplit);
            }
        }

        return -1;
    }
}
