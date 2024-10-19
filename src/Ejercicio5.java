import java.util.ArrayList;
public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }
        Integer[] arreglo = new Integer[numeros.size()];
        arreglo = numeros.toArray(arreglo);
        for (Integer numero : arreglo) {
            System.out.println(numero);
        }
    }
}