package com.company.Games.Tag.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stas on 03.12.2017.
 */
public class Main extends JPanel implements ActionListener {

    Image img = new ImageIcon("2.png").getImage();

    Timer timer = new Timer(20, this);

    JFrame frame;

    public Main(JFrame frame) {
        this.frame = frame;
    }

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0,frame.getWidth(), frame.getHeight(), null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        repaint();
    }

}
