package ua.goit.timonov.antMaven.controller;

import ua.goit.timonov.antMaven.view.SwingFrameWithTable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Alex on 27.05.2016.
 */
public class SwingMain {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new SwingFrameWithTable();
            frame.setTitle("Collection testing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
