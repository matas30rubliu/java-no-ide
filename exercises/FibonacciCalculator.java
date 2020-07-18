package training.exercises;

import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        System.out.println("F(0)=0, F(1)=1, F(2)=1, F(3)=2... Find F(N), when F(N)=F(N-1)+F(N-2)");
        System.out.println("N=... (enter your number)");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(String.format("Calculating F(%s)...", n));
        int answer = findFib(n);
        System.out.println(String.format("F(%s)=%s", n, answer));
    }

    private static int findFib(int n) {
        int answer = 0;
        // F(-2)=-1, F(-1)=1
        if (n == -1 || n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        if (n > 0) {
            return findFib(n - 1) + findFib(n - 2);
        }
        // n < 0, Negafibonacci
        return findFib(n + 2) - findFib(n + 1);
    }
}