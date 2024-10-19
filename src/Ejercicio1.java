import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {

    String fruits1 = "Apple";
    String fruits2 = "Banana";
    String fruits3 = "Cherry";

    List<String> listFruits = new ArrayList<>();

    listFruits.add(fruits1);
    listFruits.add(fruits2);
    listFruits.add(fruits3);

    System.out.println(listFruits);

    listFruits.remove(1);
    System.out.println(listFruits);

        listFruits.set(1,"Orange");
        System.out.println(listFruits);
    }

}




