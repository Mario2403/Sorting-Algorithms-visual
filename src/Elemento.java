import java.awt.geom.Rectangle2D;

public class Elemento {



    private int valor;
    private Rectangle2D.Double forma;

    public Elemento(int valor, double posX, double posY, double ancho, double alto){

        this.forma=new Rectangle2D.Double(posX, posY, ancho, alto);
        this.valor=valor;

    }

    public int getValor() {
        return valor;
    }

    public Rectangle2D.Double getForma() {
        return forma;
    }

    @Override
    public String toString() {
        return this.getValor() + "";
    }
}
