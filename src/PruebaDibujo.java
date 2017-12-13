import java.awt.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class PruebaDibujo {


    public static void main(String[] args) throws InterruptedException {


        Elemento[] elementos=new Elemento[32];

        generateRandomElements(elementos);
        elementos.toString();


        MarcoConDibujos miMarco=new MarcoConDibujos();
        miMarco.dibujaMarco();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //miMarco.dibujaLamina(elementos);



        ordenaInsercion(elementos, miMarco);
         //miMarco.dibujaLamina(elementos);

        /*for (Elemento e: elementos
             ) {
            System.out.println("x: "+e.getForma().x +  " y:" + e.getForma().y + " h:" + e.getForma().height + " k:" + e.getValor());

        }
*/
    }

    private static void generateRandomElements(Elemento[] elementos) {

        for (int i = 0; i <elementos.length ; i++) {
            int k= (int) (Math.random()*elementos.length);

            elementos[i]=new Elemento(k, 10+i + i*10 , 325-10*k, 10, 10*k);

        }



    }


    public static void ordenaInsercion (Elemento[] vector, MarcoConDibujos miMarco) throws InterruptedException {

        for (int i = 0; i < vector.length -1; i++) {



            int k = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j].getForma().height < vector[k].getForma().height) {
                    k = j;
                }

            }
                int auxHeight= (int) vector[i].getForma().height;
                int auxY= (int) vector[i].getForma().y;

                vector[i].getForma().height=vector[k].getForma().height;
                vector[i].getForma().y=vector[k].getForma().y;

                vector[k].getForma().height = auxHeight;
                vector[k].getForma().y = auxY;
                miMarco.dibujaLamina(vector);
                Thread.sleep(500);
                //miMarco.setVisible(false);
                //miMarco.setVisible(true);
                miMarco.repaint();
                
        }
    }




/*
            while	(k>0	&&	vector[k-1].getForma().height>aux)	{

                vector[k].getForma().y=vector[k-1].getForma().y;
                //vector[k].getForma().width=vector[k-1].getForma().width;
                vector[k].getForma().height=vector[k-1].getForma().height;
                k--;
            }
            vector[k].getForma().y=auxElem.getForma().y;
            //vector[k].getForma().width=auxElem.getForma().width;
            vector[k].getForma().height=auxElem.getForma().height;

            //miMarco.dibujaLamina(vector);
            //Thread.sleep(1000);

        }
    }*/
}


