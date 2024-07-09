package br.com.cubosacademy.exerciciospoo.quinto;

public class Calculadora {
    public double adicao (double num1, double num2) {
        return num1 + num2;
    }
    public double subtracao (double num1, double num2) {
        return num1 - num2;
    }
    public double multiplicacao (double num1, double num2) {
        return num1 * num2;
    }
    public double dividao (double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero!");
        } else {
            return num1 / num2;
        }
    }
}
