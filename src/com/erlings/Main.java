package com.erlings;


public class Main {

    public static int classifyTriangle(int a, int b, int c) {
        int retVal = 0;

        if (a == b && b == c)
            retVal = 3; //"Equilateral";
        if ((a == b && b != c) || (b == c && c != a) || (c == a && b != c))
            retVal = 2; //"Isosceles";
        if (a != b && b != c && c != a)
            retVal = 1; //"Scalene";
        if (a <= 0 || b <= 0 || c <= 0)
            retVal = 4; // Error, side length cannot be zero or negative
        return retVal;
    }

    public static void main(String[] args) {
        int sideA = 0;
        int sideB = 0;
        int sideC = 0;
        int count = 0;
        for (String arg : args){
            if (count == 0) sideA = Integer.parseInt(arg);
            if (count == 1) sideB = Integer.parseInt(arg);
            if (count == 2) sideC = Integer.parseInt(arg);
            count ++;
        }
        if (args.length < 3){
            System.out.println("Triangle classifier, no or not enough side lengths input. Using default values.");
            System.out.println("Usage classifier <side a> <side b> <side c> ... additional arguments will be ignored");
            sideA = 3;
            sideB = 3;
            sideC = 3;
        }
        System.out.println("Trianlge classifier, side lengths:");
        System.out.println(sideA);
        System.out.println(sideB);
        System.out.println(sideC);
        System.out.println("Trianlge is classified as: " + classifyTriangle(sideA, sideB, sideC));

    }
}
