import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaBotones extends JPanel implements ActionListener{
    private JButton aceptar;
    private JButton cancelar;


    public LaminaBotones(Color color) {

        setBounds(500, 525, 400, 300);
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
            System.out.println("Aceptar");
        }
        if (e.getSource()==cancelar){
            System.out.println("Cancelar");
        }
    }
}
