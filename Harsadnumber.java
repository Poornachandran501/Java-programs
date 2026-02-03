package Coreproject;

import java.util.Scanner;

class Harsadnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;

        for (int t = n; t > 0; t /= 10)
            sum += t % 10;

        System.out.println(n % sum == 0
                ? n + " is a Harshad Number"
                : n + " is not a Harshad Number");
    }
}
