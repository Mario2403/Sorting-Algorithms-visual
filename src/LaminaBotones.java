import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class LaminaBotones extends JPanel implements ActionListener{
    private JButton aceptar= new JButton("Aceptar");
    private JButton cancelar = new JButton("Cancelar");
    private MarcoConOpciones marcoConOpciones;
    private Mensajero mensajero;


    public LaminaBotones(Color color, Mensajero mensajero, MarcoConOpciones marcoConOpciones) {


        this.mensajero=mensajero;

        this.marcoConOpciones=marcoConOpciones;
        setBounds(380, 525, 400, 300);
        setBackground(color);


        creaBotones();



    }

private void creaBotones(){




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
