import java.util.ArrayList;
import java.util.List;


public class PruebaDibujo extends Waiting {

    private int tamanoventanaX;
    private int tamanoventanaY;
    private int anchoElementos;
    private Mensajero mensajero;


    public PruebaDibujo(int tamanoventanaX, int tamanoventanaY, int anchoElementos) {
        this.tamanoventanaX = tamanoventanaX;
        this.tamanoventanaY = tamanoventanaY;
        this.anchoElementos = anchoElementos;

    }


    public void run() throws InterruptedException {
        mensajero = new Mensajero();


        MarcoConOpciones marcoOpc = new MarcoConOpciones(700, 600);
        marcoOpc.dibujaMarcoOpc();
        marcoOpc.opciones(mensajero);




        try {
            waitUntil(0, 1, "Ya") ;


        } catch (Exception e) {
            e.printStackTrace();
        }

        Elemento[] elementos = new Elemento[mensajero.getNumElem()];

        if(mensajero.isRepetidos()){
            generateRandomElementsRepeated(elementos);
        }else {
            generateRandomElementsNoRepeatedOnes(elementos);
        }

        MarcoConDibujos mar = new MarcoConDibujos();

        mar.dibujaMarcoDib(mensajero.getTamanoX(), mensajero.getTamanoY());
        mar.dibujaLamina(elementos, mensajero);
        LaminaTimer timer=new LaminaTimer(mensajero.getTamanoY()-75);

        if (mensajero.isTemporizador()){

            mar.add(timer);
        }

        algoritmoElegidoStart(elementos, mar);

        timer.getTimer().stop();












/*
        generateRandomElementsNoRepeatedOnes(elementos);

        MarcoConDibujos miMarco=new MarcoConDibujos();
        miMarco.dibujaMarcoDib(tamanoventanaX, tamanoventanaY);

        AlgoritmosOrdenacion.mergeSort(elementos, miMarco);
*/

    }

    private void algoritmoElegidoStart(Elemento[] elementos, MarcoConDibujos marco) {

        switch (mensajero.getAlgoritmo()){

            case 0:
                AlgoritmosOrdenacion.insercion(elementos, marco, mensajero); break;
            case 1:
                AlgoritmosOrdenacion.seleccion(elementos, marco, mensajero); break;
            case 2:
                AlgoritmosOrdenacion.burbuja(elementos, marco, mensajero); break;
            case 3:
                AlgoritmosOrdenacion.combSort(elementos, marco, mensajero); break;
            case 4:
                AlgoritmosOrdenacion.heapSort(elementos, marco, mensajero); break;
            case 5:
                AlgoritmosOrdenacion.quickSort(elementos, marco, mensajero); break;
            case 6:
                AlgoritmosOrdenacion.mergeSort(elementos, marco, mensajero); break;

        }

    }

    private void generateRandomElementsNoRepeatedOnes(Elemento[] elementos) {

        List<Integer> usados=new ArrayList<Integer>();


        for (int i = 0; i <elementos.length ; i++) {

            int k;
            do{
                k=  (int)(Math.random()*elementos.length+1);
            }while(usados.contains((Integer)k));



            elementos[i]=new Elemento(k, mensajero.getAnchoElem()+i + i*mensajero.getAnchoElem() , mensajero.getTamanoY() -75-mensajero.getAnchoElem()*k, mensajero.getAnchoElem(), mensajero.getAnchoElem()*k);
            usados.add(k);
        }



    }


    private void generateRandomElementsRepeated(Elemento[] elementos) {




        for (int i = 0; i <elementos.length ; i++) {

            int k=  (int)(Math.random()*elementos.length+1);


            elementos[i]=new Elemento(k, mensajero.getAnchoElem()+i + i*mensajero.getAnchoElem() , mensajero.getTamanoY() -75-mensajero.getAnchoElem()*k, mensajero.getAnchoElem(), mensajero.getAnchoElem()*k);

        }



    }


    @Override
    public boolean until() throws Exception {
        return mensajero.isComienza();
    }
}


