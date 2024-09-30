package com.ps;


public class Calculator {
    public static void main(String[] args) {

//        Calculator calculator = new Calculator();
        int add = addMethod(1,2,3);
        System.out.println(add);
        int substract = substractMethod(1,2,3);
        System.out.println(substract);
        int multiply = multiplyMethod(1,2,3);
        System.out.println(multiply);
        int divide = divideMethod(1,2,3);
        System.out.println(divide);
        int modulus = moduloMethod(1,2,3);
        System.out.println(modulus);







    }
    public static int addMethod (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public static int substractMethod(int num1, int num2, int num3){
        return num1 - num2 - num3;
    }
    public static int multiplyMethod(int num1, int num2, int num3){
        return num1 * num2 * num3;
    }
    public static int divideMethod(int num1, int num2, int num3){
        return num1 / num2 / num3;
    }
    public static int moduloMethod(int num1, int num2, int num3){
        return num1 % num2 % num3;
    }

}