boolean onlyOnePositive(int a, int b) {
    if (a == 0 || b == 0) return false;
    else return ((double) a/b) < 0;
}