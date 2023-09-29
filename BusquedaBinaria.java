import java.util.Scanner;

public class BusquedaBinaria {

    public static void main(String[] arg){

        /**
         *  Busqueda binaria de enteros con orden de datos de forma ascendente
         *  Paradigma imperativo y procedimental.
         */
        ingresarDatos();

    }

    public static void ingresarDatos(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("");

        System.out.print("Digite la cantidad de elementos del arreglo: ");
        int elementos = entrada.nextInt();
        System.out.println("");
        System.out.println(elementos);
        int[] arreglo = new int[elementos];

        System.out.println("Digite los numeros del arreglo en forma ascendente: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Digite el elemento "+ (i+1) + ": ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.println("");


        int[] arregloOrdenado = ordenAscendente(arreglo);
        System.out.println("El arreglo digitalizado ordenado en forma ascendente es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arregloOrdenado[i]);
        }


        System.out.println("");
        System.out.println("");
        System.out.print("Digite el numero que desea encontrar: ");
        int numero = entrada.nextInt();
        System.out.println("");
        
        busquedaBinaria(arregloOrdenado, numero);
    }

    public static int[] ordenAscendente(int[] arreglo){
        int temporal = 0;

        for (int j = 0; j < arreglo.length; j++) {
            for (int i = 0; i < arreglo.length-1; i++) {
                if(arreglo[i] >= arreglo[i+1]){
                    temporal = arreglo[i];
                    arreglo[i]= arreglo[i+1];
                    arreglo[i+1]=temporal;
                }
            }
        }
        return arreglo;
    }

    public static void busquedaBinaria(int[] arreglo, int numero){
        int indiceIzquierda = 0;
        int indiceDerecha = arreglo.length;
        int indiceMitad = ((indiceIzquierda+indiceDerecha)/2);
        boolean encontrado = false;

        while (indiceIzquierda <= indiceDerecha) {
            indiceMitad = ((indiceIzquierda+indiceDerecha)/2);

            if (arreglo[indiceMitad] == numero) {
                encontrado = true;
                break;
            }

            if (arreglo[indiceMitad] >= numero) {
                indiceDerecha = indiceMitad;
                indiceMitad = ((indiceIzquierda+indiceDerecha)/2);
            }

            if (arreglo[indiceMitad] <= numero) {
                indiceIzquierda = indiceMitad;
                indiceMitad = ((indiceIzquierda+indiceDerecha)/2);
            }
        }

        System.out.println("");
        if(encontrado)
            System.out.println("El numero " +numero + " se encuentra en el arreglo digitalizado en la posicion " +indiceMitad);
        else
            System.out.println("El numero " +numero + " no se encuentra en el arreglo");
            
        System.out.println("");

    }
}