import javax.swing.*;
import java.awt.*;

public class LaminaColorFondo extends JPanel{

    public LaminaColorFondo( int tamX, int tamY, Color color) {
        setLayout(null);
        setSize(tamX, tamY);
        setBackground(color);
    }
}
