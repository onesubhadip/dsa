package org.dsa.dp.fibonacci;

import java.time.Duration;
import java.time.Instant;

public class Fibonacci {

    public static void main(String[] args) {
        Instant start = Instant.now();

        System.out.println("Fib of 5 = " + fibDp(5)); //5
        System.out.println("Fib of 10 = " + fibDp(10)); //55
        System.out.println("Fib of 20 = " + fibDp(20)); //6765
        System.out.println("Fib of 50 = " + fibDp(50)); //12586269025

        Instant finish = Instant.now();
        System.out.println("Time taken = "+ Duration.between(start, finish).toMillis());
    }

    /**
     * f(0) = 0
     * f(1) = 1
     * f(n) = f(n-1) + f(n-2)
     */
    static long fib(int n, long[] fibMemory) {
        if(n == 0 || n == 1) return (long)n;
        if(fibMemory[n-1] == 0 ) { //compute and store fibonacci only if its already not computed
            fibMemory[n-1] = fib(n-1, fibMemory) + fib(n-2, fibMemory);
        }
        return fibMemory[n-1];
    }

    static long fibDp(int n) {
        long[] fibMemory = new long[n];
        return fib(n, fibMemory);
    }
}
