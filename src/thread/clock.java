package thread;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class clock extends JPanel implements Runnable  {
    public JLabel timeLabel;

    public clock() {
        setBounds(0,0,200,100);
        setLayout(new FlowLayout());

        timeLabel = new JLabel();
        add(timeLabel);
    }

    public void Start() {
        new Thread(()->{
            while (true) {
                updateTime();
            }
        }).start();
    }

    private void updateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        timeLabel.setText(dateFormat.format(new Date()));
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
    



}
