package com.example.fx7calculator;

public class Model {
    public double calculation(double a, double b, String operator){
        switch (operator){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                if (b == 0){
                    return 0;
                }
                else{
                    return a/b;
                }

        }
        System.out.println("Anon operator: " + operator);
        return 0;
    }
}
