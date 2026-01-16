public class LectureExample1 {
    public static void main(String[] args) {
        int n = 10; // Input size, can be changed to test different values

        // Initialize total to 0: 1 operation
        int total = 0;

        // Loop from i=0 to n-1: n iterations
        for (int i = 0; i < n; i++) {
            // total += 1: 1 operation per iteration
            total += 1;

            // print(i): 1 operation per iteration (I/O operation)
            System.out.println(i);
        }

        // Total operations F(n) = 1 (initialization) + 2*n (for loop: increment and print per iteration)
        // So F(n) = 2n + 1
        // As n grows large, the dominant term is 2n, so Big O is O(n)

        System.out.println("Total: " + total); // Final total should be n
    }
}