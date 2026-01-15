public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10;
        int b = 3;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // 13
        System.out.println("a - b = " + (a - b));  // 7
        System.out.println("a * b = " + (a * b));  // 30
        System.out.println("a / b = " + (a / b));  // 3 (integer division)
        System.out.println("a % b = " + (a % b));  // 1 (remainder)

        // Comparison operators
        System.out.println("\nComparison Operators:");
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a != b: " + (a != b));  // true
        System.out.println("a < b: " + (a < b));    // false
        System.out.println("a > b: " + (a > b));    // true
        System.out.println("a <= b: " + (a <= b));  // false
        System.out.println("a >= b: " + (a >= b));  // true

        // Logical operators
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));  // false (AND)
        System.out.println("x || y: " + (x || y));  // true (OR)
        System.out.println("!x: " + (!x));          // false (NOT)
        System.out.println("!y: " + (!y));          // true (NOT)
    }
}