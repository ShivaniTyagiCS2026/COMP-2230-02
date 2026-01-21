import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class PostFixEvaluator {
    public int evaluate(String expr) {
        Deque<Integer> stack = new ArrayDeque<>();
        StringTokenizer tokens = new StringTokenizer(expr);
        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();
            try {
                stack.push(Integer.parseInt(token));  // Handles -3!
            } catch (NumberFormatException e) {
                if (stack.size() < 2) return 0;  // Safe: no crash
                int b = stack.pop(), a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(b != 0 ? a / b : 0);
                }
            }
        }
        return stack.size() == 1 ? stack.pop() : 0;
    }
}
