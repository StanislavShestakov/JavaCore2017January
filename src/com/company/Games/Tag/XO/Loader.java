package com.company.Games.Tag.XO;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Stas on 21.03.2017.
 */
public class Loader {
    public static void main(String[] args) {
        Game game = new Game();
//        game.printGame();

        JFrame frame = new JFrame();
        GameForm gameForm = new GameForm(game);
        frame.setContentPane(gameForm.getRootPanel());
        frame.setTitle("Х-О");
        Dimension dimension = new Dimension(400, 400);
        frame.setSize(dimension);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
