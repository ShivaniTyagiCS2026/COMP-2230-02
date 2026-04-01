public class HashFunctionExercises {

    // Division method: hash value is key modulo table size.
    static int divisionHash(int key, int tableSize) {
        return key % tableSize;
    }

    // Multiplication method: uses a fractional constant to distribute keys.
    static int multiplicationHash(int key, int tableSize) {
        double A = (Math.sqrt(5) - 1) / 2; // constant between 0 and 1
        double fractionalPart = (key * A) % 1;
        return (int) Math.floor(tableSize * fractionalPart);
    }

    // Simple string hash: polynomial accumulation with a prime base.
    static int stringHash(String s, int tableSize) {
        int hash = 0;
        int prime = 31;
        for (char c : s.toCharArray()) {
            hash = (hash * prime + c) % tableSize;
        }
        return hash;
    }

    public static void main(String[] args) {
        // Use a small hash table size for demonstration.
        int tableSize = 10;
        int[] keys = {10, 22, 31, 4, 15, 28, 17, 88, 59};

        System.out.println("Integer Hash Values (Division Method):");
        for (int key : keys) {
            System.out.printf("key=%d -> index=%d\n", key, divisionHash(key, tableSize));
        }

        System.out.println("\nInteger Hash Values (Multiplication Method):");
        for (int key : keys) {
            System.out.printf("key=%d -> index=%d\n", key, multiplicationHash(key, tableSize));
        }

        System.out.println("\nString Hash Values:");
        String[] words = {"apple", "banana", "grape", "pear", "peach", "melon"};
        for (String word : words) {
            System.out.printf("word=%s -> index=%d\n", word, stringHash(word, tableSize));
        }
    }
}
