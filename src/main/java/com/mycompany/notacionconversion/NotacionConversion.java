package com.mycompany.notacionconversion;
import java.util.Stack;
/**
 *
 * @author Juan José López Rosa
 */
public class NotacionConversion {

    // Precedencia de operadores
    static int getPrecedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Convertir infijo a postfijo
    static String infijoAPostfijo(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // Si el caracter es operando, añadirlo al resultado
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // Si el caracter es '(', agregarlo a la pila
            else if (c == '(') {
                stack.push(c);
            }
            // Si el caracter es ')', vaciar la pila hasta '('
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            // Si el caracter es operador
            else {
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Vaciar la pila restante
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Convertir infijo a prefijo
    static String infijoAPrefijo(String expression) {
        // Invertir la expresión
        StringBuilder reversedExpression = new StringBuilder(expression).reverse();
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < reversedExpression.length(); i++) {
            char c = reversedExpression.charAt(i);

            // Ajuste de paréntesis invertidos
            if (c == '(') {
                c = ')';
            } else if (c == ')') {
                c = '(';
            }

            // Si es operando, agregar al resultado
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // Si es '(', agregar a la pila
            else if (c == '(') {
                stack.push(c);
            }
            // Si es ')', vaciar la pila hasta '('
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            // Si es operador
            else {
                while (!stack.isEmpty() && getPrecedence(c) < getPrecedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Vaciar la pila restante
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        // Invertir el resultado final para obtener la notación prefija
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String expression = "A+B*C-D/E";

        System.out.println("Expresión infija: " + expression);
        System.out.println("Notación postfija: " + infijoAPostfijo(expression));
        System.out.println("Notación prefija: " + infijoAPrefijo(expression));
    }
}
