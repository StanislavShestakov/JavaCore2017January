package com.company.Games.Tag.XO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stas on 21.03.2017.
 */
public class GameForm {
    private int[][] pole;
    private Game engine;
    private JPanel rootPanel;


    public JPanel getRootPanel() {
        return rootPanel;
    }


    public GameForm(Game engine) {
        this.engine = engine;
        pole = engine.getPole();
        GridBagConstraints c = new GridBagConstraints(); //задает стиль кнопокс
        c.insets = new Insets(5, 5, 5, 5);     //отступы
        JLabel messages = new JLabel();

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                c.gridy = i;  //сеткa по горизонтали
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(100, 100)); //разрешение с кот она появится
                button.setText(i + " " + j);

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] coords = button.getText().split(" ");
                        String btnText = button.getText();
                        if (!btnText.equals("X") && !btnText.equals("O")) {
                            //engine.turn(Integer.parseInt(coords[0]), Integer.parseInt(coords[1]), true);
                            int turn = engine.GUITurn(Integer.parseInt(coords[0]), Integer.parseInt(coords[1]));
                            if (turn == 1) {
                                button.setText("X");

                            } else if (turn == -1) {
                                button.setText("O");
                            }
                            if (engine.checkIsWin()) {
                                //System.out.println("Win!");
                                messages.setText("Пебеда!!!");
                                JOptionPane.showMessageDialog(rootPanel, "Победа");
                                clear();

                            } else {
                                messages.setText("");
                            }
                        } else {
                            // JOptionPane.showMessageDialog(rootPanel,"Ячейка занята");
                            messages.setText("Ячейка занята");
                        }

                    }
                });
                rootPanel.add(button, c);


            }
        }
        c.gridy = pole.length;
        rootPanel.add(messages, c);


//        JMenuBar jMenuBar = new JMenuBar();
//        JMenu jMenu = new JMenu("Game");
//        jMenuBar.add(jMenu);
//        JMenuItem jMenuItem = new JMenuItem("Играть с компьтером");
//        JMenuItem jMenuItem1 = new JMenuItem("Играть с игроком");
//        JMenuItem jMenuItem2 = new JMenuItem("Выход");
//        jMenu.add(jMenuItem);
//        jMenu.add(jMenuItem1);
//        jMenu.add(jMenuItem2);
//        setJMenuBar(jMenuBar);
//        jMenuItem2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
//        rootPanel.add(jMenuBar);
//        setVisible(true);

    }

    public void clear() {
        int i = 0;
        int j = 0;
        int limit = pole.length;
        JButton button1 = null;
        Component[] component = rootPanel.getComponents();
        for (int y = 0; y < component.length; y++) {
            if (component[y] instanceof JButton) {
                button1 = (JButton) component[y];
                button1.setEnabled(true);
                if (i < limit) {
                    button1.setText(j + " " +  i++);
                } else {
                   i = 0;
                   button1.setText(++j + " " + i++);

                }
            }
        }

    }


}
