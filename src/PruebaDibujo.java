import java.util.ArrayList;
import java.util.List;


public class PruebaDibujo extends Waiting {


    private Mensajero mensajero= new Mensajero();
    private Elemento[] elementos;
    private LaminaTimer timer;
    private MarcoConDibujos marcoConDibujos;


    void run()  {

        creaMarcoOpciones();
        generaElementos();

        try {
        waitUntil(0, 1, "Ya");  //Espera a que se pulse el boton aceptar
        }
        catch (Exception e){
            e.printStackTrace();
        }

        creaMarcoDibujo();
        creaTemporizador(marcoConDibujos);
        algoritmoElegidoStart(elementos, marcoConDibujos);
        timer.getTimer().stop();


    }

    private void creaMarcoDibujo(){


        marcoConDibujos = new MarcoConDibujos();
        marcoConDibujos.dibujaMarcoDib(mensajero.getTamanoX(), mensajero.getTamanoY());
        marcoConDibujos.dibujaLamina(elementos, mensajero);

    }

    private void creaMarcoOpciones(){

        MarcoConOpciones marcoOpc = new MarcoConOpciones(700, 600);
        marcoOpc.dibujaMarcoOpc();
        marcoOpc.opciones(mensajero);

    }

    private void creaTemporizador(MarcoConDibujos marcoConDibujos){

        timer=new LaminaTimer(mensajero.getTamanoY()-75);

        if (mensajero.isTemporizador()){
            marcoConDibujos.add(timer);
        }

    }

    private void generaElementos(){
        elementos = new Elemento[mensajero.getNumElem()];

        if(mensajero.isRepetidos()){
            generateRandomElementsRepeated(elementos);
        }else {
            generateRandomElementsNoRepeatedOnes(elementos);
        }

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

        List<Integer> usados= new ArrayList<>();


        for (int i = 0; i <elementos.length ; i++) {

            int k;
            do{
                k=  (int)(Math.random()*elementos.length+1);
            }while(usados.contains(k));



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


