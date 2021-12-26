package main.java;

public class RegNumberGenerator {
    static String getAlphaNumericString(int n) {

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";


        StringBuilder sb = new StringBuilder(n);

        int index = (int) (AlphaNumericString.length() * Math.random());
        sb.append(AlphaNumericString.charAt(index));


        return sb.toString();
    }
}