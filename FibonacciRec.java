package session10;

public class FibonacciRec {

    public static int fibonacci(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be 1 or greater");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        if (1 != fibonacci(1)) {
            System.out.println("Fehler 1");
        }
        if (1 != fibonacci(2)) {
            System.out.println("Fehler 2");
        }
        if (2 != fibonacci(3)) {
            System.out.println("Fehler 3");
        }
        if (3 != fibonacci(4)) {
            System.out.println("Fehler 4");
        }
    }
}
