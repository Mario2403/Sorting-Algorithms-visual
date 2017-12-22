import java.awt.*;

public class Mensajero {

    private int algoritmo=0;
    private boolean repetidos=false;
    private boolean temporizador=false;
    private Color colorElem=Color.BLACK;
    private int numElem=32;
    private int anchoElem=10;
    private int tamanoX=400;
    private int tamanoY=400;
    private boolean comienza=false;

    public boolean isComienza() {
        return comienza;
    }

    public void setComienza(boolean comienza) {
        this.comienza = comienza;
    }



    public int getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(int algoritmo) {
        this.algoritmo = algoritmo;
    }

    public boolean isRepetidos() {
        return repetidos;
    }

    public void setRepetidos(boolean repetidos) {
        this.repetidos = repetidos;
    }

    public boolean isTemporizador() {
        return temporizador;
    }

    public void setTemporizador(boolean temporizador) {
        this.temporizador = temporizador;
    }

    public Color getColorElem() {
        return colorElem;
    }

    public void setColorElem(Color colorElem) {
        this.colorElem = colorElem;
    }

    public int getNumElem() {
        return numElem;
    }

    public void setNumElem(int numElem) {
        this.numElem = numElem;
    }

    public int getAnchoElem() {
        return anchoElem;
    }

    public void setAnchoElem(int anchoElem) {
        this.anchoElem = anchoElem;
    }

    public int getTamanoX() {
        return tamanoX;
    }

    public void setTamanoX(int tamanoX) {
        this.tamanoX = tamanoX;
    }

    public int getTamanoY() {
        return tamanoY;
    }

    public void setTamanoY(int tamanoY) {
        this.tamanoY = tamanoY;
    }
}
