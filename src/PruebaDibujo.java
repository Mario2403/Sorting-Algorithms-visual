import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class PruebaDibujo {
    /*
    * Valores recomendados:
    *
    * 400, 400, 32, 10
    * 800, 800, 69, 10
    * 800, 800, 129, 5
    * 1300, 1000, 300, 3
    *
    *
     */

    private static final int TAMVENTANAX=1300;
    private static final int TAMVENTANAY=1000;
    private static final int NUMEROELEMENTOS=300;
    private static final int ANCHOELEMENTOS=3;


    public static void main(String[] args) throws InterruptedException {


        Elemento[] elementos=new Elemento[NUMEROELEMENTOS];

        generateRandomElementsNoRepeatedOnes(elementos);

        MarcoConDibujos miMarco=new MarcoConDibujos();
        miMarco.dibujaMarco(TAMVENTANAX, TAMVENTANAY);

        AlgoritmosOrdenacion.mergeSort(elementos, miMarco);


        /*for (Elemento e: elementos
             ) {
            System.out.println("x: "+e.getForma().x +  " y:" + e.getForma().y + " h:" + e.getForma().height + " k:" + e.getValor());

        }
*/
    }

    private static void generateRandomElementsNoRepeatedOnes(Elemento[] elementos) {

        List<Integer> usados=new ArrayList<Integer>();


        for (int i = 0; i <elementos.length ; i++) {

            int k;
            do{
                 k=  (int)(Math.random()*elementos.length+1);
            }while(usados.contains((Integer)k));



            elementos[i]=new Elemento(k, ANCHOELEMENTOS+i + i*ANCHOELEMENTOS , TAMVENTANAY-75-ANCHOELEMENTOS*k, ANCHOELEMENTOS, ANCHOELEMENTOS*k);
            usados.add(k);
        }



    }

    private static void generateRandomElementsRepeated(Elemento[] elementos) {




        for (int i = 0; i <elementos.length ; i++) {

               int k=  (int)(Math.random()*elementos.length+1);


            elementos[i]=new Elemento(k, ANCHOELEMENTOS+i + i*ANCHOELEMENTOS , TAMVENTANAY-75-ANCHOELEMENTOS*k, ANCHOELEMENTOS, ANCHOELEMENTOS*k);

        }



    }



}


