import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NuevaVentana  {

    private JButton bot;
    private Mensajero mensajero;
    private Elemento[] elementos;
    private MarcoConDibujos marcoConDibujos;

    public NuevaVentana(Mensajero mensajero, Elemento[] elementos){

        this.mensajero=mensajero;
        this.elementos=elementos;

        marcoConDibujos= new MarcoConDibujos();
        marcoConDibujos.dibujaMarcoDib(mensajero.getTamanoX(), mensajero.getTamanoY());
        marcoConDibujos.dibujaLamina(elementos, mensajero);
        ordenaTodo(elementos, marcoConDibujos);
    }


    public void ordenaTodo(Elemento[] elementos, MarcoConDibujos marcoConDibujos){

        AlgoritmosOrdenacion.burbuja(elementos, marcoConDibujos, mensajero);
    }
}
