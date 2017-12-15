import javax.swing.*;
import java.awt.*;

public class MarcoConOpciones extends JFrame{

    private int tamX;
    private int tamY;

    public MarcoConOpciones(int tamX, int tamY) {
        this.tamX=tamX;
        this.tamY=tamY;
    }

    public void dibujaMarcoOpc() {

        setTitle("Opciones!");
        setBounds(300, 200, tamX, tamY);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setDefaultLookAndFeelDecorated(true);
    }

    public void opciones(){


        Color fondo=new Color(238, 238, 238);
        LaminaColorFondo colorFondo=new LaminaColorFondo(tamX, tamY, fondo);
        LaminaBotones botones = new LaminaBotones(fondo);
        LaminaSeleccion selector = new LaminaSeleccion(Color.WHITE);
        LaminaColorChooser colorChooser= new LaminaColorChooser(Color.WHITE);


        colorFondo.add(colorChooser);
        colorFondo.add(selector);
        colorFondo.add(botones);
        setContentPane(colorFondo);


       //colorFondo.add(selector);












    }



}
