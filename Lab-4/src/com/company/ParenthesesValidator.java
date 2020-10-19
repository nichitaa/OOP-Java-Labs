package com.company;

import java.util.Stack;

public class ParenthesesValidator {

    // method to check if the expresion has valid parenthesis
    static boolean isValidExpresion(String e) {

        Stack<Character> stack = new Stack<Character>(); // stack to store the parenthesis

        // iterate over expresion
        for (int i = 0; i < e.length(); i++) {
            char ch = e.charAt(i); // getting the current char

            // if is opening parentheses -> push to stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }

            // if is closing parentheses:
            if (ch == ')' || ch == ']' || ch == '}') {
                // if the stack is empty it means that we are missing at least a opening parenthesis
                if (stack.isEmpty()) {
                    return false;
                }
                // if the stack is not empty -> pop the parenthesis from the stack
                else {
                    char removedParenthesis = stack.pop();
                    // switch case on the current closing parenthesis
                    switch (ch) {
                        // return false if the popped parenthesis from the stack
                        // is a opening parenthesis of different type
                        case ')':
                            if (removedParenthesis=='{' || removedParenthesis=='[') {
                                return false;
                            }
                            break;
                        case ']':
                            if (removedParenthesis=='{' || removedParenthesis=='(') {
                                return false;
                            }
                            break;
                        case '}':
                            if (removedParenthesis=='[' || removedParenthesis=='(') {
                                return false;
                            }
                            break;
                    }
                }
            }
        }
        // if the stack is empty then all parentheses corresponds -> valid expression
        return (stack.isEmpty());
    }

}
