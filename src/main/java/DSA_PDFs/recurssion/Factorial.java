package DSA_PDFs.recurssion;

public class Factorial {
    public static int factorial(int n) {
        // Base case: 0! = 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n! = n × (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5; // you can change this number to test
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

//    factorial(5)
//→ 5 * factorial(4)
//→ 5 * (4 * factorial(3))
//            → 5 * (4 * (3 * factorial(2)))
//            → 5 * (4 * (3 * (2 * factorial(1))))
//            → 5 * (4 * (3 * (2 * (1 * factorial(0)))))
//            → 5 * (4 * (3 * (2 * (1 * 1)))) // factorial(0) = 1
//            → 120



//    factorial(5)
//  → factorial(4)
//    → factorial(3)
//      → factorial(2)
//        → factorial(1)
//          → factorial(0) ← returns 1
//            ← returns 1 * 1 = 1
//            ← returns 2 * 1 = 2
//            ← returns 3 * 2 = 6
//            ← returns 4 * 6 = 24
//            ← returns 5 * 24 = 120

}
