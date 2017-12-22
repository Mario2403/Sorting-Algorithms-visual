import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LaminaCheckBoxes extends JPanel implements ItemListener {

    private JCheckBox repetidos;
    private JCheckBox tiempo;
    private Mensajero mensajero;


    public LaminaCheckBoxes(Color color, Mensajero mensajero){

        this.mensajero=mensajero;

        setBounds(250, 20, 420, 70);
        setBackground(color);
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        setBorder( BorderFactory.createTitledBorder("Opciones"));


        repetidos = new JCheckBox("Elementos repetidos");
        repetidos.setBackground(color);
        repetidos.setToolTipText("Determina si pueden existir elementos del mismo tamaño");
        tiempo = new JCheckBox("Mostrar tiempo transcurido");
        tiempo.setBackground(color);
        tiempo.setToolTipText("Muestra un temporizador con el tiempo transcurrido");

        repetidos.addItemListener(this);
        tiempo.addItemListener(this);


        add(repetidos);
        add(Box.createRigidArea(new Dimension(5, 0)));
        add(tiempo);

    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getItemSelectable()==repetidos){
            if (e.getStateChange()==ItemEvent.SELECTED) {
                mensajero.setRepetidos(true);
            }
            else {
                mensajero.setRepetidos(false);
            }
        }

        if(e.getItemSelectable()==tiempo){
            if (e.getStateChange()==ItemEvent.SELECTED) {
                mensajero.setTemporizador(true);
            }
            else {
                mensajero.setTemporizador(false);
            }
        }
    }
}
