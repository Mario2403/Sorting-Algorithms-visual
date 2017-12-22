import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaTimer extends JPanel implements ActionListener {

    private JLabel tiempo;
    private Integer nano=0;
    private Integer seg=0;

    public Timer getTimer() {
        return timer;
    }

    private Timer timer;

    public LaminaTimer( int posY){

        setBounds(20, posY, 110, 20);
        tiempo=new JLabel("");
        //setBackground(Color.lightGray);

        timer=new Timer(1, this);
        timer.start();
        add(tiempo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        tiempo.setText(seg.toString() + "." + nano.toString() + " segundos");
        nano++;
        if (nano==999){ seg++; nano=0;}


    }


}
