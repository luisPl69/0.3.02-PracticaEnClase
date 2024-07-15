import java.util.ArrayList;
import java.util.List;

import Ejercicio.EjercicioDos;
import Ejercicio.EjercicioUno;

public class App {
    public static void main(String[] args) throws Exception {

         EjercicioUno ejerUno = new EjercicioUno();
         List<Integer> set = new ArrayList<>();
         set.add(1);
         set.add(2);
         set.add(3);
        List<List<Integer>> result = ejerUno.subsets(set);
        System.out.println("Resolución del Ejercicio Uno:");
        System.out.println(result);

         EjercicioDos ejerDos = new EjercicioDos();
         int n = 3;
         List<String> ouput = ejerDos.generateParenthesis(n);
         for (String  s :ouput){
            
            System.out.println(s);
         }
         
         
         
         
    }
}
