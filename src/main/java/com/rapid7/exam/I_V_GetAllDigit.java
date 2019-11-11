package com.rapid7.exam;

import java.util.Scanner;

/**
 * @program: rapid7-exam-shjd
 * @description:
 * @author: rapid7
 * @create: 2019-11-10 09:50
 **/

public class I_V_GetAllDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个正整数");
        int num = sc.nextInt();

        int i = 0;
        while (num > 0) {
            i = num % 10;//计算每一位上的数字

            System.out.println(i);//打印每一位数字

            num = num / 10;//实现位与位之间的遍历
        }

    }
}
