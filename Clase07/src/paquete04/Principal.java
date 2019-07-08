/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author BrandonVS
 */
public class Principal {
    public static void main(String[] args) {
        
        int suma = 0;
        int arreglo [] = {10, 20, 30, 1, 2, 3, 40, 4};
        int metodo = Arreglo.obtenerTamanioArreglo(arreglo, arreglo.length);
        
        System.out.printf("Metodo = %d\n", metodo);
        
        int metodo2 = Arreglo.obtenerTamanioArregloDos(arreglo, arreglo.length);
        
        System.out.printf("Metodo dos = %d\n", metodo2);
        
    }
}
