package paquete04;

/**
 *
 * @author BrandonVS    
 */
public class Arreglo {
    
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, 
                tamanio - 1 ); 
        }
    }
    public static int obtenerTamanioArregloDos(int a[], int b){
        
        int suma = 0;
        for (int i = 0; i < b; i++){
            suma = suma + a[i];
        }
        return suma;
    }
}
