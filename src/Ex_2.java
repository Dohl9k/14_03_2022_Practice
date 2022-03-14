//Write a function that returns true if the number is a "Very Even" number.
//
//        If a number is a single digit, then it is simply "Very Even" if it itself is even.
//
//        If it has 2 or more digits, it is "Very Even" if the sum of its digits is "Very Even".
//
//        Examples
//        number = 88 => returns false -> 8 + 8 = 16 -> 1 + 6 = 7 => 7 is odd
//
//        number = 222 => returns true -> 2 + 2 + 2 = 6 => 6 is even
//
//        number = 5 => returns false
//
//        number = 841 => returns true -> 8 + 4 + 1 = 13 -> 1 + 3 => 4 is even


class Ex_2 {
    public static boolean isVeryEvenNumber(int number) {
        boolean is_even = true;
        int new_number = 0;
        while (number / 10 > 0) {
            while (number > 0){
                new_number += number % 10;
                number /= 10;
            }
            number = new_number;
            new_number = 0;
        }
        if (number % 2 == 1){
            is_even = false;
        }
        return is_even;
    }
    public static void main(String[] args) {
        System.out.println(isVeryEvenNumber(4554));
    }
}
//
//public class Kata {
//    public static boolean isVeryEvenNumber(int n) {
//        return ((n - 1) % 9 % 2) != 0 || n == 0;
//    }
//}