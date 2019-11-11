package com.rapid7.exam;

import javax.swing.*;

/**
 * @program: rapid7-exam-shjd
 * @description:
 * @author: rapid7
 * @create: 2019-11-10 09:54
 **/

public class III_I_SwingorAWT {
    public void CreateJFrame() {
        JFrame jf = new JFrame("这是一个JFrame窗体");        // 实例化一个JFrame对象
        jf.setVisible(true);        // 设置窗体可视
        jf.setSize(500, 350);        // 设置窗体大小
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);        // 设置窗体关闭方式
    }

    public static void main(String[] args) {
        new III_I_SwingorAWT().CreateJFrame();        // 调用CreateJFrame()方法
    }
}
