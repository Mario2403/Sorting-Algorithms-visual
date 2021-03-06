

public class AlgoritmosOrdenacion {



    private static void dibujaYDuerme(MarcoConDibujos miMarco, Elemento[] vector,  Mensajero mensajero) {


            miMarco.dibujaLamina(vector, mensajero);
            LaminaConFiguras lam = new LaminaConFiguras(vector, mensajero);
            miMarco.add(lam);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        miMarco.repaint();


    }



    public static void seleccion (Elemento[] vector, MarcoConDibujos miMarco, Mensajero mensajero)   {

        for (int i = 0; i < vector.length -1; i++) {



            int k = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j].getForma().height < vector[k].getForma().height) {
                    k = j;
                }

            }

            vector[i].intercambiaCon(vector[k]);

            dibujaYDuerme(miMarco, vector, mensajero);


        }
    }


    public static void insercion(Elemento[] vector, MarcoConDibujos miMarco, Mensajero mensajero)  {


        for	(int i=1;	i<vector.length;	i++)	{

            for (int j = i; j >0 ; j--) {

                if(vector[j].getForma().height<vector[j-1].getForma().height){
                    vector[j].intercambiaCon(vector[j-1]);

                    dibujaYDuerme(miMarco, vector, mensajero);

                }
            }


        }




    }


    public static void burbuja(Elemento[] vector, MarcoConDibujos miMarco, Mensajero mensajero)   {


        int temp = 0;

        for (int i = 0; i < vector.length; i++) {
            for (int j = 1; j < (vector.length - i); j++) {

                if (vector[j - 1].getForma().height > vector[j].getForma().height) {
                    vector[j].intercambiaCon(vector[j-1]);
                    dibujaYDuerme(miMarco, vector, mensajero);
                }

            }
        }
    }



    public static void combSort	(Elemento[]	vector, MarcoConDibujos miMarco, Mensajero mensajero)   {

        boolean ordenado=false;
        int gap=vector.length-1;
        while	(!ordenado	||	gap>1)	{
            ordenado=true;
            int i=0;
            while	(i+gap<vector.length)	{
                if	(vector[i].getForma().height>vector[i+gap].getForma().height)	{
                    vector[i].intercambiaCon(vector[i+gap]);
                    dibujaYDuerme(miMarco, vector, mensajero);
                    ordenado=false;
                }
                i++;
            }
            if	(gap>1)	gap=(int)	Math.floor(gap/1.3);
        }
    }


    public static void heapSort(Elemento[] vector, MarcoConDibujos miMarco, Mensajero mensajero)   {

        int n = vector.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(vector, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            vector[0].intercambiaCon(vector[i]);
            dibujaYDuerme(miMarco, vector, mensajero);

            // call max heapify on the reduced heap
            heapify(vector, i, 0);


        }
    }


    private static void heapify(Elemento vector[], int n, int i){
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && vector[l].getForma().height > vector[largest].getForma().height)
            largest = l;

        // If right child is larger than largest so far
        if (r < n && vector[r].getForma().height > vector[largest].getForma().height)
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            vector[i].intercambiaCon(vector[largest]);

            // Recursively heapify the affected sub-tree
            heapify(vector, n, largest);
        }
    }

    public static void	quickSort(Elemento[]	vector, MarcoConDibujos miMarco, Mensajero mensajero)   {

        quickSortAux(vector,0,vector.length-1, miMarco, mensajero);


    }

    private static void	quickSortAux (Elemento[]	vector,	int	i0,	int	iN, MarcoConDibujos miMarco, Mensajero mensajero)   {
        if	(i0	>=	iN)
            return;
        else	{
            int	m	=	ordenarPorPivote(vector,	i0,	iN, miMarco, mensajero);
            quickSortAux(vector, i0, m-1, miMarco, mensajero);
            quickSortAux(vector,m+1,	iN, miMarco, mensajero);

        }
    }


    private static int ordenarPorPivote	(Elemento[]	vector,	int	i0, int iN, MarcoConDibujos miMarco, Mensajero mensajero)   {
        Elemento pivote	=	vector[iN].clone();
        int i=i0;
        int j=iN-1;
        while	(i<j)	{
            while	(vector[i].getForma().height<=	pivote.getForma().height	&&	i<j)	{i++;}

            while	(vector[j].getForma().height>	pivote.getForma().height	&&	i<j)	{j--;}

            vector[i].intercambiaCon(vector[j]);
            dibujaYDuerme(miMarco, vector, mensajero);
        }
        if	(vector[i].getForma().height	>	pivote.getForma().height)	{
            vector[iN].intercambiaCon(vector[i]);
            vector[i].intercambiaCon(pivote);

            dibujaYDuerme(miMarco, vector, mensajero);

            return	i;
        }
        else
        return	iN;
    }




    private static void	merge(Elemento[]	vector,	int	i0, int k,	int iN, MarcoConDibujos miMarco, Mensajero mensajero)   {
        int i=i0;	int d=k+1;

        Elemento[]	aux=new	Elemento[iN-i0+1];
        int	f=0;
        while	(i<=k	&&	d<=iN)	{
            if	(vector[i].getForma().height<=vector[d].getForma().height)	{

               // aux[f]	=	vector[i];
                //aux[f].intercambiaCon(vector[i]);
                aux[f]=vector[i].clone();
                i++;	f++;
            }
            else	{
                //aux[f]	=	vector[d];
                aux[f]=vector[d].clone();

                //aux[f].intercambiaCon(vector[d]);
                d++;	f++;
            }
        }
        for	(int a=i;	a<=k;	a++)	{aux[f]=vector[a].clone();	f++;}
        for	(int a=d;	a<=iN;	a++)	{aux[f]=vector[a].clone();	f++;}
        for	(int a=0;	a<aux.length;	a++)	{
            vector[i0+a].intercambiaCon(aux[a]);
            dibujaYDuerme(miMarco, vector, mensajero);
        }
    }



    private static void	mergeSortAux	(Elemento[]	vector,	int	i0, int iN, MarcoConDibujos miMarco, Mensajero mensajero)   {
        if	(i0	>=	iN)
            return;
        else	{
            int k=	(i0	+	iN)	/2;
            mergeSortAux(vector, i0, k, miMarco, mensajero);
            mergeSortAux(vector, k+1,	iN, miMarco, mensajero);
            merge(vector,	i0,	k,	iN, miMarco, mensajero);
        }
    }

    public static void mergeSort(Elemento[]	vector, MarcoConDibujos miMarco, Mensajero mensajero)   {
        mergeSortAux(vector,0,	vector.length-1, miMarco, mensajero);
    }



}
