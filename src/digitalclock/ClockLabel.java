/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalclock;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/**
 *
 * @author vadim
 */
public class ClockLabel extends JLabel implements ActionListener {
    String type;
    SimpleDateFormat sdf;

    public ClockLabel(String type) {
        this.type = type;
        setForeground(Color.green);
        
        switch(type) {
            case "date":sdf = new SimpleDateFormat("MMMM dd yyyy");
                        setFont(new Font("sans-serif", Font.PLAIN, 36));
                        setHorizontalAlignment(SwingConstants.LEFT);
                        break;
            case "time":sdf = new SimpleDateFormat("hh:mm:ss a");
                        setFont(new Font("sans-serif", Font.PLAIN, 120));
                        setHorizontalAlignment(SwingConstants.CENTER);
                        break;
            case "day": sdf = new SimpleDateFormat("EEEE ");
                        setFont(new Font("sans-serif", Font.PLAIN, 48));
                        setHorizontalAlignment(SwingConstants.RIGHT);
                        break;
            default:    sdf = new SimpleDateFormat();
                        break;
        }
        
        Timer t = new Timer(1000, this);
        t.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Date d = new Date();
        setText(sdf.format(d));
    }
}
