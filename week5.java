class week5 {
 static void incrementation() {
int i = 1;
i++;
i++;
i++;
}

static void cumulativeAssign() {
int n = 1;
n += 2;
n += 3;
n += 4;
}

static void whileToFor() {
int s = 0;
for(int i = 1; i <= 5; i++) {
    s += i;
}
}

void invertValues(boolean[] array) {
    for(int i = 0; i < array.length; i++) {
        array[i] = !array[i];
    }
}

void replace(char[] letters, char find, char replace) {
    for(int i = 0; i < letters.length; i++) {
        if (letters[i] == find)
            letters[i] = replace;
    }
}

void replaceFirst(char[] letters, char find, char replace) {
    for(int i = 0; i < letters.length; i++) {
        if (letters[i] == find) {
            letters[i] = replace;
            return;
        }
    }
}

void replaceLast(char[] letters, char find, char replace) {
    int last = -1;
    for(int i = 0; i < letters.length; i++) {
        if (letters[i] == find)
            last = i;
    }
    if (last != -1) 
        letters[last] = replace;
}

void constrain(double[] array, double min, double max) {
    for(int i = 0; i < array.length; i++) {
        if (array[i] < min)
            array[i] = min;
        else if (array[i] > max)
            array[i] = max;
    }
} 
}

class SumArrayAbs {
     static void arrayToAbs(int[] array) {
         for(int i = 0; i < array.length; i++)
             if(array[i] < 0)
                 array[i] = -array[i];
     }
     
     static int sum(int[] array) {
         int s = 0;
         for(int i = 0; i < array.length; i++)
             s += array[i];
         return s;
     }
     
     static int sumAbs(int[] array) {
         int[] absArray = ArrayCopy.copy(array);
         arrayToAbs(absArray);
         return sum(absArray);
     }
 }

 class ArrayOrder {
    static void swap(int[] array, int i, int j) {
        int iVal = array[i];
        array[i] = array[j];
        array[j] = iVal;
    }
    static void invert(int[] array) {
        for(int i = 0; i < array.length/2; i++) 
            swap(array, i, array.length - 1 - i);
    }
}

class arrayRandom {
    static void randomSwap(int[] array) {
        int a = RandomInts.randomUntil(array.length);
        int b = RandomInts.randomUntil(array.length);
        while(b == a) {
            b = RandomInts.randomUntil(array.length);
        }
        ArrayOrder.swap(array, a, b);
    }
    static void shuffle(int[] array) {
        int n;
        for(int i = array.length - 1; i > 0; i--) {
            n = RandomInts.randomUntil(array.length - 1);
            ArrayOrder.swap(array,i,n);
        }
    }
}

class arrayShift {
    static void shiftLeft(int[] array) {
        int n = array[0];
        for(int i = 1; i <= array.length - 1; i++)
            array[i-1] = array[i];
        array[array.length - 1] = n;
    }
    static void shiftRight(int[] array) {
        int n = array[array.length - 1];
        for(int i = array.length - 1; i > 0; i--)
            array[i] = array[i-1];
        array[0] = n;
    }
}

class bubbleSort {
    static void sort(int[] array) {
        int n = array.length - 1;
        
        while(n > 0) {
            for(int i = 0; i < n; i++) {
                if (array[i] > array[i+1])
                    ArrayOrder.swap(array,i,i+1);
            }
            n--;
        }
    }
}