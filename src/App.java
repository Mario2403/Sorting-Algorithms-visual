public class App {

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

        PruebaDibujo ordenaVisual=new PruebaDibujo(TAMVENTANAX, TAMVENTANAY, ANCHOELEMENTOS, elementos);

        ordenaVisual.run();


    }
}
