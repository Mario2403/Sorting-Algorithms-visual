import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LaminaBotones extends JPanel implements ActionListener{
    private JButton aceptar;
    private JButton cancelar;
    private MarcoConOpciones marcoConOpciones;
    private Mensajero mensajero;

    private Elemento[] elementos;

    public LaminaBotones(Color color, Mensajero mensajero, MarcoConOpciones marcoConOpciones) {


        this.mensajero=mensajero;

        this.marcoConOpciones=marcoConOpciones;
        setBounds(380, 525, 400, 300);
        //setSize(200, 200);
        setBackground(color);
        //setLayout(null);

        this.aceptar = new JButton("Aceptar");
        this.cancelar = new JButton("Cancelar");

        aceptar.setBounds(573, 530, 85, 25);
        cancelar.setBounds(680, 530, 85, 25);

        aceptar.addActionListener( this);
        cancelar.addActionListener(this);
        add(aceptar);
        add(cancelar);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==aceptar){

            marcoConOpciones.setVisible(false);
            mensajero.setComienza(true);



        }
        if (e.getSource()==cancelar){
            System.exit(0);
        }
    }




}
