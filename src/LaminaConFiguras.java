import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class LaminaConFiguras extends JPanel {


    private Elemento[] elementos;

    public LaminaConFiguras(Elemento[] elementos){

        this.elementos=elementos;
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);



        Graphics2D g2= (Graphics2D) g;


        for (Elemento e: elementos ) {
            g2.setPaint(Color.BLACK);
            g2.fill(e.getForma());
        }


/*
        Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, 400, 400);
        g2.setPaint(Color.BLACK);
        g2.fill(rectangulo);
        g2.setPaint(Color.GREEN);
        g2.fill( new Rectangle2D.Double(20, 20, 25, 300));
*/





    }



}
