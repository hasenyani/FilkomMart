import java.util.Scanner;

public class fibonacci {

	// Recursive Fibonacci with memoization (still recursive but fast enough for n<=50)
	public static long fib(int n, long[] memo) {
		if (n <= 1) return n;
		if (memo[n] != -1) return memo[n];
		memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
		return memo[n];
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			if (!sc.hasNextInt()) return;
			int n = sc.nextInt();
			if (n < 0) return;
			long[] memo = new long[Math.max(2, n + 1)];
			for (int i = 0; i < memo.length; i++) memo[i] = -1;
			long result = fib(n, memo);
			System.out.println(result);
		}
	}

}
