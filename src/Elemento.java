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


    public  void intercambiaCon(Elemento e){
        double auxh=this.forma.getHeight();
        double auxy=this.forma.getY();

        this.forma.y=e.getForma().y;
        this.forma.height=e.getForma().height;

        e.getForma().height=auxh;
        e.getForma().y=auxy;

    }

    @Override
    protected Elemento clone()  {

        return new Elemento(this.valor, this.forma.x, this.forma.y, this.forma.width, this.forma.height);
    }
}
