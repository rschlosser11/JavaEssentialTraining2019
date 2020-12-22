package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 10 + 12;
        String answer = "The answer is " + result;
        System.out.println(answer);

        String howMany = 20 + " things";
        System.out.println(howMany);

        var result2 = 10 + 20;
        int intV = 42;
        var fromInt = Integer.toString(intV);
        System.out.println(fromInt);

        boolean boolV = true;
        var fromBool = Boolean.toString(boolV);
        System.out.println(fromBool);

        long longV = 10_000_000;
        var fromLong = Long.toString(longV);
        System.out.println(fromLong);
    }
}
