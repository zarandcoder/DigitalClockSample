/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalclock;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author vadim
 */
public class DigitalClock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClockLabel dateLabel = new ClockLabel("date");
        ClockLabel timeLabel = new ClockLabel("time");
        ClockLabel dayLabel = new ClockLabel("day");

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Digital Clock");
        frame.setSize(900,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
        
        frame.add(dateLabel);
        frame.add(timeLabel);
        frame.add(dayLabel);
        
        frame.getContentPane().setBackground(Color.black);
        
        frame.setVisible(true);

    }
    
}
