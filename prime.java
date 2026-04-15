public class prime {
    public static void main(String[] args) {
        int n = 10; // The number of primes we want to find
        int count = 0; // To keep track of how many primes we've found
        int number = 2; // The number we will test for primality (starting at 2)

        System.out.println("Printing the first " + n + " prime numbers:");

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        
        // We only need to check up to the square root of num for efficiency
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
