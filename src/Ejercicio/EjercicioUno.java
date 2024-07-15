package Ejercicio;

import java.util.ArrayList;
import java.util.List;

/*
 * Implementa un método para devolver todos los subconjuntos de un arreglo de enteros
 * 
 * Se puede sin recursividad
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]
 * 
 * El  metodo me debe devolver una lista de listas de enteros. 
 * Se puede usar varios metodos 
 * 
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 */
 
public class EjercicioUno {


    public static List<List<Integer>> subsets(List<Integer> set) {
        List<List<Integer>> result = new ArrayList<>();
        int n = set.size();
        int numSubsets = 1 << n; 

        for (int i = 0; i < numSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(set.get(j));
                }
            }
            result.add(subset);
        }

        return result;
    }
}