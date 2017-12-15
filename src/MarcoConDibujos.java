import javax.swing.*;
import java.awt.*;

public class MarcoConDibujos extends JFrame {





    public void dibujaMarcoDib(int tamX, int tamY){

        setTitle("Dibujos!");
        setSize(tamX, tamY);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void dibujaLamina(Elemento[] elementos){

        LaminaConFiguras lamina1=new LaminaConFiguras(elementos);
        add(lamina1);
    }



}
