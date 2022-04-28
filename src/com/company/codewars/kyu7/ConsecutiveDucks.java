package com.company.codewars.kyu7;

public class ConsecutiveDucks {
    public static void main(String[] args) {
        System.out.println(consecutiveDucks(382131));

    }

    public static boolean consecutiveDucks(int n) {
        boolean result = false;
        int start = 1;
        int sum = 0;
        while (start != n/2) {
            for (int i = start; i <= n; i++) {
                sum += i;
                if (sum > n) {
                    start++;
                    sum = 0;
                    break;
                }
                if (sum == n) {
                    result = true;
                }
            }

        }
        return result;
    }
}
