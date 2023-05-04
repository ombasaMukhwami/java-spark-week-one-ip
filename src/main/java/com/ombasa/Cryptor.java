package com.ombasa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Cryptor {
    private static final Set<Character> ALPHABETS = new HashSet<>(
            Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));

    public Cryptor() {
        steps = 3;
    }

    public Cryptor(int steps) {
        this.steps = steps;
    }

    private static final char SPACE = ' ';
    private int steps;

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public String encrypt(String data) {
        char[] dataToProcess = data.toCharArray();
        int length = data.toCharArray().length;

        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < length; i++) {

            char currentCharacter = dataToProcess[i];
            int currentPosition = ALPHABETS.stream().collect(Collectors.toList()).indexOf(currentCharacter);
            if (currentPosition < 0) {
                rs.append(currentCharacter);
                continue;
            }

            int index = currentPosition - steps;
            if (index < 0) {
                index = 26 + index;
            }

            rs.append(ALPHABETS.toArray()[index]);

        }


        return rs.toString();
    }

    public String descrypt(String data) {
        char[] dataToProcess = data.toCharArray();
        int length = data.toCharArray().length;

        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < length; i++) {

            char currentCharacter = dataToProcess[i];
            int currentPosition = ALPHABETS.stream().collect(Collectors.toList()).indexOf(currentCharacter);
            if (currentPosition < 0) {
                rs.append(currentCharacter);
                continue;
            }

            int index = currentPosition + steps;
            if (index > 25) {
                index = index - 26;
            }

            rs.append(ALPHABETS.toArray()[index]);

        }


        return rs.toString();
    }
}
