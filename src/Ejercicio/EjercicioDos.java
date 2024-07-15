package Ejercicio;

import java.util.ArrayList;
import java.util.List;

/*
 * Dados n pares de paréntesis, implementa un algoritmo para generar todas las combinaciones
 * válidas de paréntesis.
 *
 * Ejemplo 1:
 *  Input:
 *    n: 1
 *  Output:
 *    ["()"]
 *
 * Ejemplo 2:
 *  Input:
 *    n: 3
 *  Output:
 *    ["((()))","(()())","(())()","()(())","()()()"]
 *      ((()))   (()())   (())()   ()(())   ()()()


()()()
 *
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 * Se debe usar StringBuilder
 */
public class EjercicioDos {

    public static List<String> generateParenthesis (int n) {
        List<String> result= new ArrayList<>();
        generate(result, new StringBuilder(),0,0,n);
        return result;

    }
    public static void generate(List<String>result,StringBuilder current, int inicio, int cierre, int max){
        if(current.length()==max *2){
            result.add(current.toString());
            return;
        }
        if (inicio<max ){
            current.append("(");
            generate(result, current, inicio+1, cierre, max);
            current.deleteCharAt(current.length()-1);

        }
        if (cierre<inicio){
            current.append(")");
            generate(result, current, inicio, cierre+1, max);
            current.deleteCharAt(current.length()-1);
        }

    }
    
}
