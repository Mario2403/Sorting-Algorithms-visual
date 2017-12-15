import java.util.ArrayList;
import java.util.List;


public class PruebaDibujo {

    private int tamanoventanaX;
    private int tamanoventanaY;
    private int anchoElementos;
    private Elemento[] elementos;

    public PruebaDibujo(int tamanoventanaX, int tamanoventanaY, int anchoElementos, Elemento[] elementos) {
        this.tamanoventanaX = tamanoventanaX;
        this.tamanoventanaY = tamanoventanaY;
        this.anchoElementos = anchoElementos;
        this.elementos = elementos;
    }


    public void run() throws InterruptedException {
        MarcoConOpciones marcoOpc = new MarcoConOpciones(800, 600);
        marcoOpc.dibujaMarcoOpc();
        marcoOpc.opciones();








        /*generateRandomElementsNoRepeatedOnes(elementos);

        MarcoConDibujos miMarco=new MarcoConDibujos();
        miMarco.dibujaMarcoDib(tamanoventanaX, tamanoventanaY);

        AlgoritmosOrdenacion.mergeSort(elementos, miMarco);
        */

    }


    private void generateRandomElementsNoRepeatedOnes(Elemento[] elementos) {

        List<Integer> usados=new ArrayList<Integer>();


        for (int i = 0; i <elementos.length ; i++) {

            int k;
            do{
                 k=  (int)(Math.random()*elementos.length+1);
            }while(usados.contains((Integer)k));



            elementos[i]=new Elemento(k, anchoElementos+i + i*anchoElementos , tamanoventanaY -75-anchoElementos*k, anchoElementos, anchoElementos*k);
            usados.add(k);
        }



    }

    private void generateRandomElementsRepeated(Elemento[] elementos) {




        for (int i = 0; i <elementos.length ; i++) {

               int k=  (int)(Math.random()*elementos.length+1);


            elementos[i]=new Elemento(k, anchoElementos+i + i*anchoElementos , tamanoventanaY -75-anchoElementos*k, anchoElementos, anchoElementos*k);

        }



    }



}


