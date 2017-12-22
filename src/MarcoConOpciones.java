import javax.swing.*;
import java.awt.*;
import java.net.URISyntaxException;

public class MarcoConOpciones extends JFrame{

    private int tamX;
    private int tamY;
    private Mensajero mensajero;


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

    }

    public void opciones(Mensajero mensajero){

        this.mensajero=mensajero;


        Color fondo=new Color(238, 238, 238);
        LaminaColorFondo colorFondo=new LaminaColorFondo(tamX, tamY, fondo);
        LaminaBotones botones = new LaminaBotones(fondo, mensajero, this);
        LaminaSeleccion selector = new LaminaSeleccion(Color.WHITE, mensajero);
        LaminaColorChooser colorChooser= new LaminaColorChooser(Color.WHITE, mensajero);
        LaminaCheckBoxes checkBoxes = new LaminaCheckBoxes(Color.WHITE, mensajero);
        LaminaTextFields textFields = new LaminaTextFields(Color.WHITE, mensajero);
        LaminaRecomendaciones recomendaciones= new LaminaRecomendaciones(fondo);
        //LaminaTimer timer= new LaminaTimer();
        //colorFondo.add(timer);


        colorFondo.add(recomendaciones);
        try {
            LaminaCopyright copyright = new LaminaCopyright(fondo);
            colorFondo.add(copyright);
        }
        catch(URISyntaxException er){
            System.out.println("Error en la URL");
        }

        colorFondo.add(textFields);
        colorFondo.add(checkBoxes);
        colorFondo.add(colorChooser);
        colorFondo.add(selector);
        colorFondo.add(botones);
        setContentPane(colorFondo);


       //colorFondo.add(selector);












    }



}
