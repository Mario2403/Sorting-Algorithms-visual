import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class LaminaConFiguras extends JPanel {


    private Elemento[] elementos;
    private Mensajero mensajero;

    public LaminaConFiguras(Elemento[] elementos, Mensajero mensajero){

        this.elementos=elementos;
        this.mensajero=mensajero;
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);



        Graphics2D g2= (Graphics2D) g;


        for (Elemento e: elementos ) {
            g2.setPaint(mensajero.getColorElem());
            g2.fill(e.getForma());
        }






    }



}
