import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaRecomendaciones extends JPanel implements ActionListener {

    private JButton recomienda=new JButton("Tips");

    public LaminaRecomendaciones(Color color){

        setBounds(360, 490, 58, 25);
        setLayout(new GridLayout(1, 1));
        setBackground(color);
        creaBoton();
    }

    private void creaBoton(){

        recomienda.setFont(new Font("Dialog", Font.BOLD, 12 ));
        add(recomienda);
        recomienda.addActionListener(this);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame=new JFrame("Recomendaciones");
        if(e.getSource()==recomienda){
            JOptionPane.showMessageDialog(frame, "Algunas configuraciones recomendadas son:\n Nº elem=        32 ,69, 129, 300 \n" +
                    "Ancho elem= 10, 10, 5, 3 \nTamaño x=     400, 400, 800, 1300 \nTamaño y=     400, 400, 800, 1000 " );

        }
    }
}
