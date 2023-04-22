package C3_EX_3_20_;


import javax.swing.*;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
/*
* Due to a strange bug when I cloned this, I decided to make the entire lab from scratch with my own code.
* The bug had something to do with the JDK version, and I couldn't resolve it.
* */
public class HouseDrawer {

    public static void main (String[] args)
    {
        JFrame Frame = new JFrame("Window");
        Frame.setSize(640, 480);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HouseDraw HD = new HouseDraw();
        Frame.add(HD);
        Frame.setVisible(true);
    }
}
