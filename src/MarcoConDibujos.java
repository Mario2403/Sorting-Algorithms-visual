import javax.swing.*;
import java.awt.*;

public class MarcoConDibujos extends JFrame {





    public void dibujaMarco(){

        setTitle("Dibujos!");
        setSize(400, 400);
    }

    public void dibujaLamina(Elemento[] elementos){

        LaminaConFiguras lamina1=new LaminaConFiguras(elementos);
        add(lamina1);
    }



}
