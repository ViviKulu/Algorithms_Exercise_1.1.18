package com.company;

public class Main {

    //    Consider the following recursive function:

    //    public static int mystery(int a, int b){
    //        if (b == 0) return 0;
    //        if (b % 2 == 0) return mystery(a+a, b/2);
    //        return mystery(a+a, b/2) + a;
    //    }

    //    What are the values of mystery(2, 25) and mystery(3, 11)? Given positive integers
    //    a and b, describe what value mystery(a, b) computes. Answer the same question, but
    //    replace + with * and replace return 0 with return 1.

    //    The value of mystery(2,25) is 50 and of mystery(3,11) is 33. The value that mystery(a,b) computes is the
    //    a * b essentially. If b == 0 return 0 for a fail fast or if b is evenly divisible into 2, return a + a
    //    (2 + 2 * 25 / 2) else if not equal to 0 or evenly divisible by 2, return (a + a * b / 2) + a.

    public static void main(String[] args) {
        // write your code here
        int a = 2;
        int b = 25;
        mystery(a, b);
        System.out.println(mystery(a,b));
    }

    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }
}
