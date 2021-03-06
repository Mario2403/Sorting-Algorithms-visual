import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LaminaTextFields extends JPanel implements ActionListener {

    private JTextField numeroElementos;
    private JTextField anchoElementos;
    private JTextField tamanoX;
    private JTextField tamanoY;
    private Mensajero mensajero;




    public LaminaTextFields(Color color, Mensajero mensajero) {

        this.mensajero=mensajero;

        setBounds(20, 460, 320, 95);
        setBackground(color);
        setLayout(new GridLayout(0,2));
        setBorder(BorderFactory.createTitledBorder("Elementos"));

        creaNumElem();
        creaAnchoElem();
        creaTamX();
        creaTamY();

    }

    private void creaNumElem(){
        JLabel numElem = new JLabel("Numero de elementos");
        numeroElementos= new JTextField("32");
        numeroElementos.setToolTipText("Pulsa ENTER para guardar el dato");
        numeroElementos.addActionListener(this);

        add(numElem);
        add(numeroElementos);


    }
    private void creaAnchoElem(){

        JLabel ancho = new JLabel("Ancho elementos");
        anchoElementos=new JTextField("10");
        anchoElementos.setToolTipText("Pulsa ENTER para guardar el dato");
        anchoElementos.addActionListener(this);

        add(ancho);
        add(anchoElementos);

    }
    private void creaTamX(){
        JLabel tamX=new JLabel("Tamaño ventana x");
        tamanoX=new JTextField("400");
        tamanoX.setToolTipText("Pulsa ENTER para guardar el dato");
        tamanoX.addActionListener(this);

        add(tamX);
        add(tamanoX);

    }
    private void creaTamY(){


        JLabel tamY = new JLabel("Tamaño ventana y");
        tamanoY = new JTextField("400");
        tamanoY.setToolTipText("Pulsa ENTER para guardar el dato");
        tamanoY.addActionListener(this);

        add(tamY);
        add(tamanoY);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==numeroElementos){
            mensajero.setNumElem(Integer.parseInt(numeroElementos.getText()));
        }
        if(e.getSource()==tamanoX){
            mensajero.setTamanoX(Integer.parseInt(tamanoX.getText()));
        }
        if(e.getSource()==tamanoY){
            mensajero.setTamanoY(Integer.parseInt(tamanoY.getText()));
        }
        if (e.getSource()==anchoElementos){
            mensajero.setAnchoElem(Integer.parseInt(anchoElementos.getText()));
        }



    }





}
