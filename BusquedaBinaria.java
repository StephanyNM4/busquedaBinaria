public class BusquedaBinaria {

    public static void main(String[] arg){
        //Arreglo en orden ascendente
        int[] arreglo = {1,2,3,4,5,6,7};
        int numero = 2;
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
        // System.out.println(encontrado);

        if(encontrado)
            System.out.println("El numero " +numero + " se encuentra en el arreglo en la posicion " +indiceMitad);
        else
            System.out.println("El numero " +numero + " no se encuentra en el arreglo");
    }
}