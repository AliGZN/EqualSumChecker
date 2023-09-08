package org.example;

public class Main {
    public static void main(String[] args) {

        int num1=1;
        int num2=1;
        int num3=2;

        boolean equal = HasEqualSum.hasEqualSum(num1,num2,num3);
        System.out.println("Do the first two numbers have an equal sum to the third number? " + equal);

    }
}