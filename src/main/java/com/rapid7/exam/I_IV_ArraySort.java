package com.rapid7.exam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: rapid7-exam-shjd
 * @description:
 * @author: rapid7
 * @create: 2019-11-10 09:44
 **/

public class I_IV_ArraySort {


    public static void main(String[] args) {


        int[] a = {1, 4, -1, 5, 0};

        Arrays.sort(a);
        //数组a[]的内容变为{-1,0,1,4,5}
        for (int i = 0; i < a.length; i++)


            System.out.print(a[i] + "  ");


    }


}
