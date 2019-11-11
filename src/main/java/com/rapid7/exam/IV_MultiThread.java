package com.rapid7.exam;

/**
 * @program: rapid7-exam-shjd
 * @description:
 * @author: rapid7
 * @create: 2019-11-10 09:56
 **/

public class IV_MultiThread extends Thread {
    int count = 1, number;


    public IV_MultiThread(int num) {
        number = num;
        System.out.println("创建线程 " + number);
    }


    public void run() {
        while (true) {
            System.out.println("线程 " + number + ":计数 " + count);
            if (++count == 6)
                return;
        }
    }


    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {

            new IV_MultiThread(i + 1).start();
        }
    }
}
