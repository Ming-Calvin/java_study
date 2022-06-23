package day09.RecursionTest;

/*
* 递归方法的使用
* 递归： 一个方法调用自己
*
*
*
* */


public class RecursionTest {
    // 1. 计算1-100以内的所有自然数的和
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0 ; i <= 100; i++) {
//            sum += i;
//        }

        RecursionTest test = new RecursionTest();

        int sum1 = test.getSum(100);

        System.out.println(sum1);

        int num2 = test.f(10);

        System.out.println(num2);

        for (int i = 1; i < 5; i++) {
            int num3 = test.Fibonacci(i);
            System.out.println(num3);
        }

    }

    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if(n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }

    // 斐波那契
    public int Fibonacci(int n) {
        if (n < 3) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    // 快排
    
}
