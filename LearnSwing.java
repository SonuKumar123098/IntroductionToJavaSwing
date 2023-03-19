/**
 * LearnSwing
 */
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.*;
import java.util.Set;
public class LearnSwing {

    public static void main(String[] args) {
       // System.out.println("Hello");
    //    JFrame frame=new JFrame("Introduction");
    JFrame frame=new JFrame();
       frame.setTitle("Introduction");
       frame.setLocation(200, 200);
       frame.getContentPane().setBackground(Color.red);
       frame.setBackground(Color.blue);
       frame.setSize(600, 400);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
       
    }
}