package cyber_dojo;

import utils.ConsoleReader;

import java.util.Stack;

public class BalancedParentheses {
    private final String parentheses;
    private final String allPair = "()[]{}";
    private Stack<Character> charStack = new Stack<>();


    BalancedParentheses (ConsoleReader reader) {
        System.out.println("Print parentheses: ");
        parentheses = reader.readString();
    }

    boolean isBalanced () {
        for (int i = 0; i < parentheses.length(); i++)
            if (addToStack(parentheses.charAt(i)) != 0) return false;

        return charStack.isEmpty();
    }

    private int addToStack (char bracket) {
        if (allPair.indexOf(bracket)  % 2 == 0) {
            charStack.push(bracket);
        }

        else if (allPair.indexOf(bracket) % 2 != 0) {

            if (charStack.isEmpty()) return -1;

            else {
                String pair = String.valueOf(charStack.pop()) + String.valueOf(bracket);
                if (!allPair.contains(pair)) return -2;
            }

        }

        return 0;
    }

    public static void main(String[] args) {
        BalancedParentheses balanced = new BalancedParentheses(new ConsoleReader());
        System.out.println(balanced.isBalanced());
    }
}
