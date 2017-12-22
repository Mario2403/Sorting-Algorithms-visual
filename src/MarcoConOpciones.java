import javax.swing.*;
import java.awt.*;
import java.net.URISyntaxException;

public class MarcoConOpciones extends JFrame{

    private int tamX;
    private int tamY;
    private LaminaColorFondo colorFondo;
    private Color fondo=new Color(238, 238, 238);


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




       colorFondo=new LaminaColorFondo(tamX, tamY, fondo);

       crearLaminaBotones(mensajero);
       crearLaminaCheckBoxes(mensajero);
       crearLaminaColorChooser(mensajero);
       crearLaminaSelector(mensajero);
       crearLaminaRecomendaciones();
       crearLaminaCopyright();
       crearLaminaTextFields(mensajero);
       setContentPane(colorFondo);
    }

    private void crearLaminaBotones(Mensajero mensajero){
        LaminaBotones botones = new LaminaBotones(fondo, mensajero, this);
        colorFondo.add(botones);


    }
    private void crearLaminaSelector(Mensajero mensajero){
        LaminaSeleccion selector = new LaminaSeleccion(Color.WHITE, mensajero);
        colorFondo.add(selector);
    }

    private void crearLaminaTextFields(Mensajero mensajero){
        LaminaTextFields textFields = new LaminaTextFields(Color.WHITE, mensajero);
        colorFondo.add(textFields);

    }

    private void crearLaminaColorChooser(Mensajero mensajero){
        LaminaColorChooser colorChooser= new LaminaColorChooser(Color.WHITE, mensajero);
        colorFondo.add(colorChooser);


    }

    private void crearLaminaCheckBoxes(Mensajero mensajero){
        LaminaCheckBoxes checkBoxes = new LaminaCheckBoxes(Color.WHITE, mensajero);
        colorFondo.add(checkBoxes);


    }
    private void crearLaminaRecomendaciones(){
        LaminaRecomendaciones recomendaciones= new LaminaRecomendaciones(fondo);
        colorFondo.add(recomendaciones);
    }

    private void crearLaminaCopyright(){
        LaminaCopyright copyright = new LaminaCopyright(fondo);
        colorFondo.add(copyright);
    }
}
