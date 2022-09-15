package VPJ_v2;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        System.out.println(isValid(input()));
    }

    public static boolean isValid(String s) {
        Stack<Character> stackOfCharacters = new Stack<>();

        for (char currentChar : s.toCharArray()) {

            if (currentChar == '(') {
                stackOfCharacters.push(')');
            } else if (currentChar == '{') {
                stackOfCharacters.push('}');
            } else if (currentChar == '[') {
                stackOfCharacters.push(']');
            } else if (stackOfCharacters.isEmpty()) {
                return false;
            } else if (!stackOfCharacters.pop().equals(currentChar)) {
                return false;
            }

        }
        return stackOfCharacters.isEmpty();
    }

    static String input() {
        System.out.println("Enter some bracket characters:  ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        while (!s.matches("[(){}\\[\\] ]+")) {
            System.out.println("ERROR: invalid character entered ");
            System.out.println("Please enter only some of these (, ), {, }, [ or ]:  ");
            s = input.nextLine();
        }

        return s;
    }
}

