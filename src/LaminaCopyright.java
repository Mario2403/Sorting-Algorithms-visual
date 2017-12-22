
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class LaminaCopyright extends JPanel implements ActionListener {

    final URI uri;

    public LaminaCopyright(Color color) throws URISyntaxException {

            uri = new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ");


        setBounds(384, 450, 500, 60);
        setBackground(color);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setAlignmentX(RIGHT_ALIGNMENT);

       JLabel copy =new JLabel("© 2017 MARIO JURADO SOBA ALL RIGHTS RESERVED", JLabel.LEFT);
       copy.setFont(new Font("Verdana", Font.ITALIC, 10));
       copy.setForeground(new Color(114, 114, 114));
       add(copy);

        JButton button = new JButton();
        button.setText("                                             Más información");
        button.setFont(new Font("Verdana", Font.ITALIC, 10));
        button.setHorizontalAlignment(SwingConstants.RIGHT);
        button.setBorderPainted(false);
        button.setOpaque(false);
        button.setBackground(Color.WHITE);
        button.setToolTipText(uri.toString());
        button.addActionListener(this);
        add(button);









    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(uri);
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
    }
}
