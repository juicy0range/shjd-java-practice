package com.rapid7.exam;

import java.util.Scanner;

/**
 * @program: rapid7-exam-shjd
 * @description:
 * @author: rapid7
 * @create: 2019-11-10 07:57
 **/

public class I_I_CharKind {


    public static void main(String[] args) {

        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        //注：Scanner类中的next()方法遇到空格就不进去了，比如说输入haha nene就只会得到haha，空格后面的都被忽略了，因此要用nextLine（）
        String str = sc.nextLine();
        //用来检测中文的正则表达式
        String reg1 = "[\u4e00-\u9fa5]";
        int count1 = 0;
        //用来检测字母的正则表达式
        String reg2 = "[a-zA-Z]";
        int count2 = 0;
        //用于统计空格数
        int count3 = 0;

        //用于统计数字个数
        String reg4 = "[0-9]";
        int count4 = 0;

        //将每个char都存入String数组中
        char[] charArr = str.toCharArray();

        String[] strArr = new String[charArr.length];
        for (int i = 0; i < charArr.length; i++) {

            strArr[i] = String.valueOf(charArr[i]);
            if (strArr[i].matches(reg1)) {
                count1++;
            }
            if (strArr[i].matches(reg2)) {
                count2++;
            }
            if (strArr[i].matches(" ")) {
                count3++;
            }
            if (strArr[i].matches(reg4)) {
                count4++;
            }
        }
        System.out.println("汉字的个数：" + count1);
        System.out.println("字母的个数：" + count2);
        System.out.println("空格的个数：" + count3);
        System.out.println("数字的个数：" + count4);


    }
}
