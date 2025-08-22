public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        // Arithmetic
        System.out.println("a + b = " + (a + b));
        
        // Relational
        System.out.println("a > b? " + (a > b));

        // Logical
        System.out.println((a > 0 && b > 0));

        // Assignment
        a += 3;
        System.out.println("Updated a = " + a);

        // Unary
        b++;
        System.out.println("Incremented b = " + b);

        // Ternary
        int max = (a > b) ? a : b;
        System.out.println("Max value: " + max);
    }
}
