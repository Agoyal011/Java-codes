public class Primes {
    // an example of initializer list
    // stores some prime numbers in an array and prints them

    public static void main (String[] args)
    {
        int[] primeNums={2,3,5,7,11,13,17,19};

        System.out.println("Array Length:" + primeNums.length);
        System.out.println("The first few prime numbers are:");

        for (int prime:primeNums)
            System.out.println(prime+"");

    }
}

