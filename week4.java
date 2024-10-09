class week4 {
 static void arrayRead() {
int[] numbers = {4, 3, 2, 1}; 
int sum = numbers[0];
sum = sum + numbers[1];
sum = sum + numbers[2];
sum = sum + numbers[3];
}

int sum(int[] array) {
    int i = 0;
    int s = 0;
    while(i < array.length) {
        s = s + array[i];
        i = i + 1;
    }
    return s;
}

static void arrayOfDigits() {
int[] digits = new int[10];
int i = 0;
while(i < digits.length) {
    digits[i] = i;
    i = i + 1;
}
}

int[] naturals(int n) {
    assert n >= 0 : "argumento não pode ser negativo";
    int[] nats = new int[n];
    int i = 1;
    while(i <= n) {
        nats[i-1] = i;
        i = i + 1;
    }
    return nats;
}

boolean isOrdered(int[] array) {
    int i = 1;
    boolean inOrder = true;
    while(i < array.length) {
        if (array[i-1] > array[i])
            inOrder = false;
        i = i + 1;
    }
    return inOrder;
}

int[] inverted(int[] array) {
    int n = array.length;
    int[] inAr = new int[n];
    int i = 0;
    while(i <= n - 1) {
        inAr[i] = array[n - 1 - i];
        i = i + 1;
    }
    return inAr;
}

boolean contains(int [] array, int n) {
    int i = 0;
    boolean hasN = false;
    while(i < array.length) {
        if (array[i] == n)
            hasN = true;
        i = i + 1;
    }
    return hasN;
}

int count(int [] array, int n) {
    int i = 0;
    int count = 0;
    while(i < array.length) {
        if (array[i] == n)
            count = count + 1;
        i = i + 1;
    }
    return count;
}

boolean isPalindrome(char [] array) {
    int i = 0;
    boolean palindrome = true;
    while(i < array.length) {
        if (array[i] != array[array.length - 1 - i])
            palindrome = false;
        i = i + 1;
    }
    return palindrome;
}

boolean areEqual(int[] a, int[] b) {
    if (a.length != b.length)
        return false;
    boolean equality = true;
    int i = 0;
    while(i < a.length) {
        if (a[i] != b[i])
            equality = false;
        i = i + 1;
    }
    return equality;
}

int[] merge(int[] left, int[] right) {
    int i = 0;
    int[] mergeArr = new int[left.length + right.length];
    while(i < mergeArr.length) {
        if(i < left.length)
            mergeArr[i] = left[i];
        else
            mergeArr[i] = right[i - left.length];
        i = i + 1;
    }
    return mergeArr;
}

boolean alternatedBooleans(boolean [] array) {
    int i = 1;
    boolean boolPrior = array[0];
    boolean alternated = true;
    while(i < array.length) {
        if (boolPrior == array[i])
            alternated = false;
        boolPrior = array[i];
        i = i + 1;
    }
    return alternated;
}

boolean[] invertedBooleans(boolean[] array) {
    int i = 0;
    while(i < array.length) {
        array[i] = !array[i];
        i = i + 1;
    }
    return array;
} 
}

class arrayUtil {
    static boolean isEmpty(int [] array) {
        return (array.length == 0);
    }
    static int first(int [] array) {
        if (isEmpty(array))
            return 0;
        else
            return array[0];
    }
    static int last(int [] array) {
        if (isEmpty(array))
            return 0;
        else
        return array[array.length - 1];
    }
    static int nextIndex(int [] array, int n) {
        if (isEmpty(array))
            return 0;
        else
        return n < array.length - 1 ? n + 1 : 0;
    }
    static int prevIndex(int [] array, int n) {
        if (isEmpty(array))
            return 0;
        else
        return n > 0 ? n - 1 : array.length - 1;
    }
    static int element(int [] array, int n) {
        if (isEmpty(array))
            return 0;
        else
        return n > 0 ? array[n] : array[array.length + n];
    }
}

class ArrayCopy {
    static int[] copyNewSize(int[] array, int n) {
        int[] nSize = new int[n];
        int i = 0;
        int arLen = n > array.length ? array.length : n;
        while(i < arLen) {
            nSize[i] = array[i];
            i = i + 1;
        }
        return nSize;
    }
    static int[] copy(int[] array) {
        return copyNewSize(array, array.length);
    }
}

class arrayRNG {
    static int[] randomArray(int n) {
        int[] array = new int[n];
        int i = 0;
        while(i < n) {
            array[i] = RandomInts.randomUntil(10);
            i = i + 1;
        }
        return array;
    }
    static int randomIndex(int [] array) {
        return RandomInts.randomUntil(array.length);
    }
    static int randomElement(int [] array) {
        return array[RandomInts.randomUntil(array.length)];
    }
}

class doubleStats {
    static double min(double [] array) {
        int i = 1;
        double n = array[0];
        while(i < array.length) {
            if (n > array[i])
                n = array[i];
            i = i + 1;
        }
        return n;
    }
    static double max(double [] array) {
        int i = 1;
        double n = array[0];
        while(i < array.length) {
            if (n < array[i])
                n = array[i];
            i = i + 1;
        }
        return n;
    }
    static double sum(double [] array) {
        int i = 0;
        double n = 0;
        while(i < array.length) {
            n = n + array[i];
            i = i + 1;
        }
        return n;
    }
    static double average(double [] array) {
        double n = sum(array);
        n = n / array.length;
        return n;
    }
}

class indexUtil {
    static int[] subArray(int[] array, int start, int end) {
        int[] sub = new int[end - start + 1];
        int i = 0;
        while(i < sub.length) {
            sub[i] = array[start + i];
            i = i + 1;
        }
        return sub;
    }
    static int[] leftSide(int[] array, boolean middle) {
        int mid = array.length/2; 
        if ((array.length % 2 == 1) && middle == true)
            mid = mid + 1;
        return subArray(array, 0, mid - 1);
    }
    static int[] rightSide(int[] array, boolean middle) {
        int mid = array.length/2; 
        if ((array.length % 2 == 1) && middle == false)
            mid = mid + 1;
        return subArray(array, mid, array.length - 1);
    }
}