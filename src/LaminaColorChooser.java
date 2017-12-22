import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;



public class LaminaColorChooser extends JPanel implements ChangeListener {


    private Mensajero mensajero;
    private JColorChooser jcc= new JColorChooser();

    public LaminaColorChooser(Color color, Mensajero mensajero) {

        this.mensajero=mensajero;

        setBounds(20, 100, 650, 350);
        setBackground(color);
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Selecciona un color para los elementos"));

        creaColorChooser(color);
    }


    private void creaColorChooser(Color color){

        jcc.setBackground(color);

        add(Box.createRigidArea(new Dimension(0, 5)), BorderLayout.SOUTH);
        add(Box.createRigidArea(new Dimension(5, 0)), BorderLayout.WEST);
        add(Box.createRigidArea(new Dimension(5, 0)), BorderLayout.EAST);
        add(Box.createRigidArea(new Dimension(0, 5)), BorderLayout.NORTH);

        add(jcc, BorderLayout.CENTER);

        jcc.getSelectionModel().addChangeListener(this);


    }

    @Override
    public void stateChanged(ChangeEvent e) {
        Color nuevoColor = jcc.getColor();
        mensajero.setColorElem(nuevoColor);

    }
}

