class week6 {
  
}

record Range(int min, int max) {

}

class RangeUtil {
    static int length(Range r) {
        int maxN = r.max();
        int minN = r.min();
        if (minN <= maxN)
            return maxN-minN+1;
        else
            return 0;
    }
    static int sum(Range r) {
        int maxN = r.max();
        int minN = r.min();
        int sumN = 0;
        for(int i = minN; i <= maxN; i++) {
            sumN += i;
        }
        return sumN;
    }
    static Range indexes(int [] array) {
        return new Range(0,array.length - 1);
    }
    static Range expand(Range r, int n) {
        int maxN = r.max();
        int minN = r.min();
        if (n < 0) {
            minN += n;
        }
        else
        {
            maxN += n;
        }
        return new Range(minN,maxN);
    }
}

record Range(int min, int max) {
    boolean isEmpty() {
        return (min > max);
    }
    int length() {
        if (min <= max)
            return max-min+1;
        else
            return 0;
    }
    boolean includes(int n) {
        return (n <= max && n >= min);
    }
    boolean excludes(int n) {
        return (n > max || n < min);
    }
    boolean isValidFor(int [] array) {
        int minN = array[0];
        int maxN = array[0];
        for(int i = 0; i < array.length; i++) {
            if (minN > array[i])
                minN = array[i];
            if (maxN < array[i])
                maxN = array[i];
        }
        return (minN <= min && maxN >= max);
    }
    boolean contains(Range r) {
        int minN = r.min();
        int maxN = r.max();
        return (min <= minN && max >= maxN);
    }
    Range expand(int n) {
        int maxN = max;
        int minN = min;
        if (n < 0) {
            minN += n;
        }
        else
        {
            maxN += n;
        }
        return new Range(minN,maxN);
    }
}

class ArrayFunctions {
    static int sum(int [] array, Range r) {
        int minN = r.min();
        int maxN = r.max();
        int sumN = 0;
        for(int i = minN; i <= maxN; i++) {
            sumN += array[i];
        }
        return sumN;
    }
    
    static int [] subArray(int [] array, Range r) {
        int minN = r.min();
        int[] newArray = new int[r.length()];
        if (r.length() <= 0)
            return newArray;
        newArray[0] = array[minN];
        for(int i = 0; i < r.length(); i++) {
            newArray[i] = array[minN];
            minN++;
        }
        return newArray;
    }
    static Range valueRange(int [] array) {
        int minN = array[0];
        int maxN = array[0];
        for(int i = 0; i < array.length; i++) {
            if (minN > array[i])
                minN = array[i];
            if (maxN < array[i])
                maxN = array[i];
        }
        return new Range(minN,maxN);
    }
}

record Dimension(int x, int y) {
    int area() {
        return x*y;
    }
    int perimeter() {
        return x*2+y*2;
    }
    boolean isSquare() {
        return (x == y);
    }
    boolean isVertical() {
        return (y > x);
    }
    boolean isHorizontal() {
        return (x > y);
    }
    boolean largerThan(Dimension r) {
        int x2 = r.x();
        int y2 = r.y();
        return ((x*y) > (x2*y2));
    }
    Dimension scale(int n) {
        return new Dimension(x*n,y*n);
    }
}

record Position(int line, int column) {
   Position top() {
       return new Position(line-1,column);
   }
   Position right() {
       return new Position(line,column+1);
   }
   Position bottom() {
       return new Position(line+1,column);
   }
   Position left() {
       return new Position(line,column-1);
   }
   Position [] adjacent() {
       Position[] array = new Position[4];
       array[0] = top();
       array[1] = right();
       array[2] = bottom();
       array[3] = left();
       return array;
   }
   Position [] adjacentNonNegative() {
       Position[] array = new Position[4];
       int oIndex = 0;
       array[0] = top();
       array[1] = right();
       array[2] = bottom();
       array[3] = left();
       for(int i = 0; i < array.length; i++)
           if (array[i].line >= 0 && array[i].column >= 0)
                oIndex++;
       Position[] arrayP = new Position[oIndex];
       oIndex = 0;
       for(int i = 0; i < array.length; i++) {
           if (array[i].line >= 0 && array[i].column >= 0) {
                arrayP[oIndex] = array[i];
                oIndex++;
           }
       }
       return arrayP;
   }
}

class positionUtil {
    static Position [] diagonal(int n) {
        Position[] diarray = new Position[n];
        for(int i = 0; i < n; i++) {
            diarray[i] = new Position(i,i);
        }
        return diarray;
    }
    static Position [] positions(Dimension d) {
        int xP = d.x();
        int yP = d.y();
        Position[] array = new Position[xP*yP];
        for(int j = 0; j < yP; j++) {
            for(int i = 0; i < xP; i++)
                array[i+xP*j] = new Position(j,i);
        }
        return array;
    }
    static boolean contains(Position [] array, Position p) {
        for(int i = 0; i < array.length; i++) {
            if (array[i].equals(p))
                return true;
        }
        return false;
    }
}

record Point(double x, double y) {
    boolean isOrigin() {
        return (x == 0 && y == 0);
    }
    Point scale(double n) {
        return new Point(x*n,y*n);
    }
    Point sum(Point p) {
        return new Point(x + p.x, y + p.y);
    }
    double distance(Point p) {
        double pitagora;
        pitagora = Math.pow(x-p.x,2) + Math.pow(y-p.y,2);
        return Math.sqrt(pitagora);
    }
}