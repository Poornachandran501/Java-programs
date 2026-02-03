package Coreproject ;
public class Perfectnumber {
    public static void main(String[] args) {
        int num = 28, sum = 0;

        for (int i = 1; i <= num / 2; i++)
            if (num % i == 0) sum += i;

        System.out.println(sum == num 
                ? num + " is a Perfect Number"
                : num + " is not a Perfect Number");
    }
}