package paquete02;

/**
 *
 * @author BrandonVS
 */
public class SumaNumeros {
    public static int obtenerSumaNumeros(int valor){
        int suma = 0;
        for(int i = 1; i <= valor; i++){
            suma = suma + i;
        }
        return suma;
    }
    
    public static int obtenerSumaDos(int valor){
        if (valor <= 0){
            return 0;
        }else{
            return valor + obtenerSumaDos(valor - 1);
        }
    }
}
