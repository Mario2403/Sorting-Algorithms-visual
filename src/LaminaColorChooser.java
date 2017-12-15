import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaColorChooser extends JPanel implements ChangeListener {


    JColorChooser jcc;

    public LaminaColorChooser(Color color) {
        setBounds(20, 100, 650, 350);
        setBackground(color);
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Selecciona un color para los elementos"));


        jcc = new JColorChooser();
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
        System.out.println(nuevoColor.toString());
    }
}

