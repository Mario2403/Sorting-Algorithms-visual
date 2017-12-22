import javax.swing.*;
import java.awt.*;

public class MarcoConDibujos extends JFrame {





    public void dibujaMarcoDib(int tamX, int tamY){

        setTitle("Dibujos!");
        setSize(tamX, tamY);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void dibujaLamina(Elemento[] elementos, Mensajero mensajero){
        LaminaConFiguras lamina1 =new LaminaConFiguras(elementos, mensajero);
        add(lamina1);

    }



}
