package game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControlPanel {
    private JButton PLAYButton;
    private JButton PAUSEButton;
    private JComboBox comboBox1;
    private JButton QUITButton;
    private JButton GOButton;
    private JPanel mainPanel;
    private JButton RESTARTButton;
    private JButton SAVEButton;
    private JButton LOADButton;

    private Game game;
    public Fish fish;

    private int selectedLevel;

    public ControlPanel(Game game) {

        this.game = game;

        PAUSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pause");
                game.pause();
            }
        });

        PLAYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Play");
                game.play();
            }
        });


        QUITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                selectedLevel = Integer.parseInt((String) box.getSelectedItem());
            }
        });

        GOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.go(selectedLevel);
            }
        });

        RESTARTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.restart();
            }
        });

        SAVEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //SaveRestore SR = new SaveRestore(game);
                //SR.save();
                game.save();
            }
        });

        LOADButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //SaveRestore SR = new SaveRestore(game);
                //SR.load();
                game.read();
            }
        });

        PLAYButton.setFocusable(false);
        PAUSEButton.setFocusable(false);
        QUITButton.setFocusable(false);
        comboBox1.setFocusable(false);
        GOButton.setFocusable(false);
        RESTARTButton.setFocusable(false);
        SAVEButton.setFocusable(false);
        LOADButton.setFocusable(false);

    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

}

