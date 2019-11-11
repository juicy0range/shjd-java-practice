package com.rapid7.exam;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

/**
 * @program: rapid7-exam-shjd
 * @description:
 * @author: rapid7
 * @create: 2019-11-10 09:59
 **/


class UseColor extends Applet {

    public void paint(Graphics oldg) {
        Graphics2D g = (Graphics2D) oldg;
        g.setColor(Color.blue);
        g.fill(new Ellipse2D.Float(50, 50, 150, 150));
        g.setColor(new Color(255, 0, 0, 0));
        g.fill(new Ellipse2D.Float(50, 50, 140, 140));
        g.setColor(new Color(255, 0, 0, 64));
        g.fill(new Ellipse2D.Float(50, 50, 130, 130));
        g.setColor(new Color(255, 0, 0, 128));
        g.fill(new Ellipse2D.Float(50, 50, 110, 110));
        g.setColor(new Color(255, 0, 0, 255));
        g.fill(new Ellipse2D.Float(50, 50, 90, 90));
        g.setColor(new Color(255, 200, 0));
        g.fill(new Ellipse2D.Float(50, 50, 70, 70));
    }
}

public class III_II_Applet {

    public static void main(String[] args) {



        // new UseColor().paint();


    }

}
