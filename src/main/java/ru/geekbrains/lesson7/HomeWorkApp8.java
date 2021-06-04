package ru.geekbrains.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HomeWorkApp8 extends JFrame {
    private int value;

    public HomeWorkApp8(int initial) {


        setBounds(500, 500, 500, 120);
        setTitle("Счетчик");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Time new roman", Font.BOLD, 30);

        JTextField counterValue = new JTextField();
        add(counterValue, BorderLayout.CENTER);

        value = initial;
        counterValue.setText(String.valueOf(value));

        JButton button1 = new JButton("<");
        JButton button2 = new JButton(">");
        button1.setFont(font);
        button2.setFont(font);
        add(button1, BorderLayout.WEST);
        add(button2, BorderLayout.EAST);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValue.setText(String.valueOf(value));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValue.setText(String.valueOf(value));
            }
        });

        counterValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    value = Integer.parseInt(counterValue.getText());
                } catch (NumberFormatException e) {
//                    e.printStackTrace();
                }
                System.out.println(counterValue.getText());
            }
        });

        setVisible(true);
    }


    public static void main(String[] arg) {

        new HomeWorkApp8(3);
    }
}
