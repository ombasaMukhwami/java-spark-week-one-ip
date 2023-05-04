package com.ombasa;

public final class Helper {
    private Helper() {

    }

    public static int isValidNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (Exception exception) {
            return 0;
        }
    }

    public static int isValidNumber(String number, int result) {
        try {
            return Integer.parseInt(number);
        } catch (Exception exception) {
            return result;
        }
    }
}
