import java.util.ArrayList;
public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add ("Apple");
        list1.add ("Banana");
        list1.add ("Cherry");
        list1.add ("Date");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add ("Banana");
        list2.add ("Date");
        list2.add ("Elderberry");
        list2.add ("Fig");
        ArrayList<String> commonElements = new ArrayList<String>();
        for (String element : list1){
            if(list2.contains(element)){
                commonElements.add(element);
            }
        }
        System.out.println("Lista  de elementos comunes ");
        for(String element :commonElements){
            System.out.println(element);
        }
    }
}