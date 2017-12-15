import javax.swing.*;
import java.awt.*;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LaminaSeleccion extends JPanel implements ItemListener{


    private JComboBox<String> cb;

    public LaminaSeleccion(Color color){


        setBounds(20, 20, 200, 58);
        setLayout(new BorderLayout(3, 3));
        setBackground(color);
        setBorder(BorderFactory.createTitledBorder("Selecciona un Algoritmo"));



        JColorChooser jcc=new JColorChooser(Color.WHITE);

        cb=new JComboBox<String>();
        cb.addItem("Inserción");
        cb.addItem("Selección");
        cb.addItem("Burbuja");
        cb.addItem("CombSort");
        cb.addItem("HeapSort");
        cb.addItem("QuickSort");
        cb.addItem("MergeSort");
        cb.setBackground(Color.WHITE);
        cb.addItemListener(this);





        add(cb, BorderLayout.CENTER);
        add(Box.createRigidArea(new Dimension(0, 5)), BorderLayout.SOUTH);
        add(Box.createRigidArea(new Dimension(5, 0)), BorderLayout.WEST);
        add(Box.createRigidArea(new Dimension(5, 0)), BorderLayout.EAST);
        add(Box.createRigidArea(new Dimension(0, 5)), BorderLayout.NORTH);


    }

    @Override
    public void itemStateChanged (ItemEvent e) {
        if (e.getSource()==cb){
            String seleccionado=(String) cb.getSelectedItem();
            assert seleccionado != null;
            if(seleccionado.equalsIgnoreCase("Inserción")){
                System.out.println("Inserción");
            }
        }


    }
}
