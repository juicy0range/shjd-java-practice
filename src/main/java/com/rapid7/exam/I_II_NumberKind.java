package com.rapid7.exam;

import java.util.Scanner;

/**
 * @program: rapid7-exam-shjd
 * @description:
 * @author: rapid7
 * @create: 2019-11-10 09:20
 **/

public class I_II_NumberKind {


    //判断是否是Narcissistic水仙花数
    //水仙花数是指：一个三位数，其各位数字的立方和等于该数本身
    //例如：153就是一个水仙花数。
    //153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
    public boolean isNarcissistic(int num) {

        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;

        if (num == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
            System.out.println(num + "是水仙花数");
            return true;
        }

        return false;
    }


    //判断是否是prime
    //从1至N全部遍历，当这个数只能被1和n整除它就是素数。
    public boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 1; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                //若能除尽，则不为质数
                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    //判断是否是perfect完数
    //求完数；完数的定义：一个数恰好等于它的所有因子之和
    //6=1＋2＋3(6的因子是1,2,3)。

    public boolean isPerfect(int number) {
        int sum = 0;
        int[] yz = new int[1000];
        // int k = 0;
        for (int i = 1; i <= number - 1; i++) {
            if (number % i == 0) {
                sum += i;
                // yz[k] = i;
                // k++;
            }
        }
        if (sum == number) {
            System.out.println(number + "是完数");
            return true;
            // System.out.println("该数的因子有：");
            // for (int j = 0; j < yz.length; j++) {
            //     if (yz[j] != 0) {
            //         System.out.print(yz[j] + "  ");
            //     }
            // }

        } else {
            System.out.println(number + "不是完数");
            return false;

        }

    }


    public static void main(String[] args) {
        boolean isPrime = true;
        boolean isPerfect = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个正整数");
        int num = sc.nextInt();

        //0init
        I_II_NumberKind IIINumberKind = new I_II_NumberKind();


        //判断是否是水仙花数
        IIINumberKind.isNarcissistic(num);

        //判断是否是素数
        isPrime = IIINumberKind.isPrime(num);


        if (isPrime) {
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "不是素数");
        }

        //判断是否是完数
        IIINumberKind.isPerfect(num);

    }
}