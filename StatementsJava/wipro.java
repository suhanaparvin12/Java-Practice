package StatementsJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class wipro {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    // Function to find the sum of all primes in the array excluding the largest prime
    public static int sumOfPrimesExcludingLargest(int[] arr) {
        List<Integer> primes = new ArrayList<>();
        int maxPrime = Integer.MIN_VALUE;

        // Identify prime numbers and find the largest prime
        for (int num : arr) {
            if (isPrime(num)) {
                primes.add(num);
                if (num > maxPrime) {
                    maxPrime = num;
                }
            }
        }

        // If no prime numbers are found
        if (primes.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int num : arr) {
                if (num > max) {
                    max = num;
                } else {
                    sum += num;
                }
            }
            return sum;
        }

        // Calculate the sum of primes excluding the largest prime
        int sum = 0;
        for (int prime : primes) {
            if (prime != maxPrime) {
                sum += prime;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] inputArray = {10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67};
        int result = sumOfPrimesExcludingLargest(inputArray);
        System.out.println("The sum of all prime numbers except the largest prime is: " + result);
    }
}