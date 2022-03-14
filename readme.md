public class Kata {
public static boolean isVeryEvenNumber(int n) {
return ((n - 1) % 9 % 2) != 0 || n == 0;
}
}

class Kata {
public static String getMiddle(String word) {
int l = word.length();
return word.substring(l / 2 - (1 - l % 2), l / 2 + 1);
}
}

class TriangleTester{
public static boolean isTriangle(int a, int b, int c){
return a + b > c && a + c > b && c + b > a;
}
}

