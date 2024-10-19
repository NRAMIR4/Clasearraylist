import java.util.ArrayList;
import java.util.List;

public class Ejericicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        System.out.println("con bucle for");
        System.out.println(numbers);

        System.out.println("con bucle for each");
        for (Integer numero : numbers) {
            System.out.println(numbers);
            System.out.println("con bucle while");
            int k = numbers.size() - 1;
            while (k >= 0) {
                System.out.println(numbers.get(k));
                k--;
            }
        }
    }
}
