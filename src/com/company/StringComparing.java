package com.company;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Stas on 28.02.2017.
 */

public class StringComparing extends Applet {

    TextField textField1;
    TextField textField2;
    String disp1;
    String disp2;
    Button button;


    public void init() {
        Label label = new Label("Строка: ");
        add(label);
        textField1 = new TextField(20);
        add(textField1);

        label = new Label("Подстрока: ");
        add(label);
        textField2 = new TextField(20);
        add(textField2);


        button = new Button("Сравнить");
        add(button);
    }

    public boolean action(Event evt, Object arg) {
        if (arg == "Сравнить") {
            String str1 = textField1.getText();
            String str2 = textField2.getText();
            if (str1.equals(str2)) disp1 = "Строки равны";
            else disp1 = "Строки не равны";
            int res = str1.compareTo(str2);
            disp2 = "Результат сравнения строк " + res;
            repaint();
            return true;
        } else return false;
    }

    public void paint(Graphics g) {
        g.drawString(disp1, 0, 100);
        g.drawString(disp2, 0, 120);
    }
}

