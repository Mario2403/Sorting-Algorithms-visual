import javax.swing.*;
import java.awt.*;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LaminaSeleccion extends JPanel implements ItemListener{

    private Mensajero mensajero;
    private JComboBox<String> cb = new JComboBox<>();

    public LaminaSeleccion(Color color, Mensajero mensajero){

        this.mensajero=mensajero;

        setBounds(20, 20, 200, 58);
        setLayout(new BorderLayout(3, 3));
        setBackground(color);
        setBorder(BorderFactory.createTitledBorder("Selecciona un Algoritmo"));

        creaJComboBox();
        creaEspacios();

    }

    private void creaEspacios(){
        add(Box.createRigidArea(new Dimension(0, 5)), BorderLayout.SOUTH);
        add(Box.createRigidArea(new Dimension(5, 0)), BorderLayout.WEST);
        add(Box.createRigidArea(new Dimension(5, 0)), BorderLayout.EAST);
        add(Box.createRigidArea(new Dimension(0, 5)), BorderLayout.NORTH);

    }


    private void creaJComboBox(){

        cb.addItem("Inserción");
        cb.addItem("Selección");
        cb.addItem("Burbuja");
        cb.addItem("CombSort");
        cb.addItem("HeapSort");
        cb.addItem("QuickSort");
        cb.addItem("MergeSort");
        cb.setBackground(Color.WHITE);
        cb.addItemListener(this);
        cb.setToolTipText("Elige el algoritmo de ordenación a utilizar");
        add(cb, BorderLayout.CENTER);

    }

    @Override
    public void itemStateChanged (ItemEvent e) {
        if (e.getSource()==cb){
            String seleccionado=(String) cb.getSelectedItem();
            assert seleccionado != null;

            if(seleccionado.equalsIgnoreCase("Inserción")){
                mensajero.setAlgoritmo(0);
            }
            if(seleccionado.equalsIgnoreCase("Selección")){
                mensajero.setAlgoritmo(1);
            }
            if(seleccionado.equalsIgnoreCase("Burbuja")){
                mensajero.setAlgoritmo(2);
            }
            if(seleccionado.equalsIgnoreCase("CombSort")){
                mensajero.setAlgoritmo(3);
            }
            if(seleccionado.equalsIgnoreCase("HeapSort")){
                mensajero.setAlgoritmo(4);
            }
            if(seleccionado.equalsIgnoreCase("QuickSort")){
                mensajero.setAlgoritmo(5);
            }
            if(seleccionado.equalsIgnoreCase("MergeSort")){
                mensajero.setAlgoritmo(6);
            }
        }


    }
}
