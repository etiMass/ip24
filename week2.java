class week2 {
 double abs(double n) {
    if (n >= 0)
        return n;
    else
        return -n;
}


int max(int a, int b) {
    if (a >= b)
        return a;
    else
        return b;
}


int min(int a, int b) {
    if (a <= b)
        return a;
    else
        return b;
}


int irsGroup(int n) {
    if (n >= 0 && n < 10000) 
        return 1;
    if (n >= 10000 && n <= 25500)
        return 2;
    if (n > 25500 && n <= 48500)
        return 3;
    if (n > 48500)
        return 4;
    return 0;
}


double irsTax(int n) {
    if (n == 1)
        return 0.12;
    if (n == 2)
        return 0.18;
    if (n == 3)
        return 0.23;
    if (n == 4)
        return 0.29;
    return 0.0;
}


static void varAssign() {
int n = 1;
n = 2;
n = n + 1;
n = n + 1;
n = n + 1;

}

static void varAssignDiv() {
int v = 2024;
v = v/10;
v = v/10;
v = v/10;

}

int firstDigit(int n) {
    while(n > 10) {
        n = n/10;
    }
    return n;
}


static void naturalsIterator() {
int i = 1;
while(i < 5) {
   i = i + 1;
}

}

int sumNaturals(int max) {
    int n = max;
    while (max >= 1) {
        max = max-1;
        n = n + max;
    }
    return n;
}


static void reverseIteration() {
int x = 5;
while (x > 0) {
    x = x - 1;
}

}

int powerOfTwo(int e) {
    int n = 2;
    while(e > 1) {
        e = e - 1;
        n = n*2;
    }
    if (e != 0)
        return n;
    else
        return 1;
}


boolean isMultiple(int n, int m) {
    while(n > 0) {
        n = n - m;
    }
    return (n == 0) ? true : false;
}


int intDivision(int n, int d) {
    int q = 0; //quociente
    while(n >= d) {
        n = n - d;
        q = q + 1;
    }
    return q;
}


static void iterationStepTwo() {
int p = 2;
while (p < 10) {
    p = p + 2;
}

}

int sumEvenBetween(int min, int max) {
    int n = 0;
    if ((min % 2) == 1)
        min = min + 1;
    if ((max % 2) == 1)
        max = max - 1;
    while(min <= max) {
        n = n + min;
        min = min + 2;
    }
    return n;
}


char nextLetter(char lerL) {
    int lNum = (int) lerL;
    char terL;
    if (lerL == 'z')
        terL = 'a';
    else
    terL = (char) (lNum+1);
    return terL;
}


int gcd(int a, int b) {
    int c = a;
    int d = b;
    b = c;
    a = d;
    while(b > 0) {
        c = (a%b);
        a = b;
        b = c;
    }
    return a;
}


int invertInt(int n) {
    int divDez = 0;
    int num = n;
    int inv = 0;
    int nNovo = n;
    int Div = 1;
    int eDez = 1;
    int resto = 0;
    while(num >= 10) {
        num = num/10;
        divDez = divDez + 1;
    }
    num = divDez;
    while (divDez >= 0) {
        while(divDez > 0) {
            eDez = eDez*10;
            divDez = divDez - 1;
        }
        Div = Div*10;
        num = num - 1;
        divDez = num;
        resto = nNovo % Div;
        resto = resto/(Div/10);
        resto = resto*eDez;
        inv = inv + resto;
        eDez = 1;
    }
    return inv;
}


int fib(int n) {
    if (n > 0)
    {
        int ind = 0;
        int fibo = 1;
        int nacci = 0;
        int fibonacci = 0;
        while(ind <= n){
            if (ind == 3) {
                nacci = fibo;
                fibo = fibo + nacci;
            }
            if (ind > 3) {
                fibonacci = nacci;
                nacci = fibo;
                fibo = fibo + fibonacci;
            }
            ind = ind + 1;
        }
        return fibo;
    }
    else return 0;
}
 
}

class IrsUtil {
    static int irsGroup(int n) {
        if (n >= 0 && n < 10000) 
            return 1;
        if (n >= 10000 && n <= 25500)
            return 2;
        if (n > 25500 && n <= 48500)
            return 3;
        if (n > 48500)
            return 4;
        return 0;
    }
    static double irsTax(int n) {
        if (n == 1)
            return 0.12;
        if (n == 2)
            return 0.18;
        if (n == 3)
            return 0.23;
        if (n == 4)
            return 0.29;
        return 0.0;
    }
}
