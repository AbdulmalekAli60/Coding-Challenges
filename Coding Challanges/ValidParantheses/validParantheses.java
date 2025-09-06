package ValidParantheses;
import java.util.Stack;

public class validParantheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(sameOrNot(s));
    }

    public static boolean sameOrNot(String s) {

        Stack<Character> charStack = new Stack<>();

        for (char c : s.toCharArray()) { 

            if (c == '(' || c == '{' || c == '[') { 
                charStack.add(c); 
            }

            else if (c == ')' || c == '}' || c == ']') { 
                if (charStack.isEmpty()) { 
                    return false;
                }

                char top = charStack.pop(); 

                if ( (c == ')' && top != '(' ) || (c == ']' && top != '[' ) || (c == '}' && top != '{' ) ) {
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }
}
