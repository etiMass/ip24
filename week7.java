class week7 {
 int count(char c, String text) {
    int n = 0;
    for(int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == c)
            n++;
    }
    return n;
}

boolean allUpperCase(String text) {
    boolean allUpper = true;
    for(int i = 0; i < text.length(); i++) {
        if ((text.charAt(i) < 'A') || (text.charAt(i) > 'Z'))
            allUpper = false;
    }
    return allUpper;
}

boolean isWord(String text) {
    boolean word = !(text.isEmpty());
    for(int i = 0; i < text.length(); i++) {
        if (!(text.charAt(i) >= 'a' && text.charAt(i) <= 'z') && !(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'))
            word = false;
    }
    return word;
}

boolean isPalindrome(String text) {
    boolean palin = true;
    for(int i = 0; i < text.length()/2; i++) {
        if (text.charAt(i) != text.charAt(text.length()-1-i))
            palin = false;
    }
    return palin;
}

int countWords(String text) {
    boolean onWord = false;
    int c = 0;
    for(int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == ' ')
            onWord = false;
        else if (!onWord) {
            c++;
            onWord = true;
        }
    }
    return c;
}

String wrap(String text, char c) {
    String wrapped = new String(c+text);
    if (c == '(') {
        wrapped += ")";
    }
    else if (c == '[') {
        wrapped += "]";
    }
    else if (c == '{') {
        wrapped += "}";
    }
    else
        wrapped += c;
    return wrapped;
}

int count(String s, String[] array) {
    int c = 0;
    for(int i = 0; i < array.length; i++) {
        if (array[i].equals(s))
            c++;
    }
    return c;
}

String largest(String [] array) {
    int stringMax = 0;
    int indexMax = 0;
    for(int i = 0; i < array.length; i++) {
        if (array[i].length() > stringMax) {
            stringMax = array[i].length();
            indexMax = i;
        }
    }
    return array[indexMax];
}

String join(String [] array, String text) {
    String joined = new String ("");
    for(int i = 0; i < array.length; i++) {
        joined += array[i];
        if (!(i == array.length - 1))
            joined += text;
    }
    return joined;
} 
}

