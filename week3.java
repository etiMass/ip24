class week3 {
 boolean isPerfectSquare(int n) {
    double nSqrt = Math.sqrt(n);
    int intSqrt = (int) nSqrt;
    return (intSqrt - nSqrt == 0);
} 
}

class EvenOdd {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static boolean isOdd(int n) {
        return !EvenOdd.isEven(n);
    }
}

class RandomInts {
    static int random() {
        return (int) (Math.random() * 1000000);
    }

    static int randomUntil(int max) {
        return (int) (Math.random() * max);
    }

    static int randomWithin(int min, int max) {
        return min + (int) (Math.random() * (max-min));
    }
}

class EvenOddRandom {
    static int randomEven(int n) {
        double nDiv = (double) n/2;
        int nR = (int) (Math.random() * nDiv);
        return 2*nR;
    }
    static int randomOdd(int n) {
        double nDiv = (double) n/2;
        int nR = (int) (Math.random() * nDiv);
        return 2*nR + 1;
    }
}

class Divisors {
    static int countDivisors(int n) {
        int div = 1;
        int cDiv = 0;
        double nDiv;
        while(div <= n){
            nDiv = (double) n/div;
            int intDiv = (int) nDiv;
            if (intDiv - nDiv == 0)
                cDiv = cDiv + 1;
            div = div + 1;
        }
        return cDiv;
    }
    static int sumProperDivisors(int n) {
        int div = 1;
        int sum = 0;
        double nDiv;
        while(div < n){
            nDiv = (double) n/div;
            int intDiv = (int) nDiv;
            if (intDiv - nDiv == 0)
                sum = sum + div;
            div = div +1;
        }
        return sum;
    }
    static boolean isPrime(int n) {
        return (Divisors.countDivisors(n) == 2);
    }
}

class primeNumbers {
    static int countPrimes(int n) {
        int nCount = 0;
        int pCount = 0;
        while (nCount <= n) {
            if (Divisors.countDivisors(nCount) == 2)
                pCount = pCount + 1;
            nCount = nCount + 1;
        }
        return pCount;
    }
    static boolean existsPrimeBetween(int a, int b) {
        boolean pExist = false;
        a = a + 1;
        while (a < b) {
            if (Divisors.countDivisors(a) == 2) {
                pExist = true;
                a = b + 1;
            }
            a = a + 1;
        }
        return pExist;
    }
}

class perfectNumbers {
    static boolean isPerfect(int n) {
        return (Divisors.sumProperDivisors(n) == n); 
    }
    static int countPerfectNumbers(int n) {
        int nCount = 1;
        int pCount = 0;
        while (nCount <= n) {
            if (Divisors.sumProperDivisors(nCount) == nCount)
                pCount = pCount + 1;
            nCount = nCount + 1;
        }
        return pCount;
    }
}

class LargerPrimeDiff {
    static int largestPrimeDiff(int n) {
        int nCount = 1;
        int pMin = 0;
        int pMax = 0;
        int pDiff = 0;
        int pLargDiff = 0;
        while (nCount <= n) {
            if (Divisors.isPrime(nCount) == true)
            {
                pMin = pMax;
                pMax = nCount;
            }
            if (pMin != 0)
                pDiff = pMax - pMin;
            if (pDiff > pLargDiff)
                pLargDiff = pDiff;
            nCount = nCount + 1;
        }
        return pLargDiff;
    }
}