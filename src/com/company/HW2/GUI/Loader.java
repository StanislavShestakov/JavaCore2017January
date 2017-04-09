package com.company.HW2.GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


/**
 * Created by Stas on 30.01.2017.
 */
public class Loader {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        FirstForm form = new FirstForm();
        frame.setContentPane(form.getRootPanel());
        //frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("res//1.jpg")))));
        frame.setTitle("Rundom Number");
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
