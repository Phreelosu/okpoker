/*
* File: App.java
* Author: Nagy József
* Copyright: 2021, Nagy József 
* Date: 2021-09-11
* Licenc: MIT
* Refaktor: Rátkay Dániel
* Github: https://github.com/Phreelosu
*
*/

package views;

import javax.swing.*;
import java.awt.Color;

public class MainWindow extends JFrame {
    public JButton startBtn = new JButton("Start");
    public JButton stopBtn = new JButton("Stop");
    public JButton nextBtn = new JButton("Következő");
    public JPanel tablePanel = new JPanel();
    public JButton flop1Btn = new JButton("");
    public JButton flop2Btn = new JButton("");
    public JButton flop3Btn = new JButton("");
    public JPanel handPanel = new JPanel();
    public JButton humanCard1Btn = new JButton();
    public JButton humanCard2Btn = new JButton();
    public JPanel buttonPanel = new JPanel();
    public JButton turnButton = new JButton();
    public JButton riverButton = new JButton();

    public MainWindow() {
        initializeComponents();
        configureTablePanel();
        configureHandPanel();
        configureButtonPanel();
        configureMainFrame();
    }

    private void initializeComponents() {
        tablePanel.setSize(100, 100);
        tablePanel.setBackground(Color.LIGHT_GRAY);

        flop1Btn.setVisible(false);
        flop2Btn.setVisible(false);
        flop3Btn.setVisible(false);

        turnButton.setVisible(false);
        riverButton.setVisible(false);
    }

    private void configureTablePanel() {
        tablePanel.add(flop1Btn);
        tablePanel.add(flop2Btn);
        tablePanel.add(flop3Btn);

        add(tablePanel);
    }

    private void configureHandPanel() {
        handPanel.add(humanCard1Btn);
        handPanel.add(humanCard2Btn);

        add(handPanel);
    }

    private void configureButtonPanel() {
        buttonPanel.add(startBtn);
        buttonPanel.add(nextBtn);
        buttonPanel.add(stopBtn);

        add(buttonPanel);
    }

    private void configureMainFrame() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
